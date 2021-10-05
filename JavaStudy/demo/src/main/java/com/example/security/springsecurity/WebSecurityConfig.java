package com.example.security.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.security.springsecurity.account.AccountService;

@EnableWebSecurity
//Spring Security の Webセキュリティが有効になる(Spring Security を使う＠).Spring MVC との統合ができるようになる
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//	WebSecurityConfigurerAdapterをクラス継承・定義。ビジネスロジックと分離してセキュリティを管理できる

	@Autowired
	private AccountService userService;
//	AccountServiceをインスタンス化。

	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		HttpSecurityのconfigureメソッドでURLごとにセキュリティ設定を行う
		http
		.authorizeRequests()
//		authorize（）：何の権利を持っているのか認証情報を返す
		.antMatchers("/login", "/login-error").permitAll()
//		antMatchers:指定されたantパターンに一致する場合にのみ呼び出される
//		permitAll全てのユーザに上記リソースへの操作を認める

		.antMatchers("/**").hasRole("USER")
//		"/**" = ワイルドカード。/*:同一階層のURLのみ/**指定階層以下のURLが対象
//		hasRole("USER")：USER以上のロールも持っている場合TRUEを返す

		.and()

		.formLogin()
//		フォーム認証の適用
		.loginPage("/login").failureUrl("/login-error");
//		failureUrl：ログインに失敗した時のURL　"/login-error"へ飛ぶ
	}


	//変更点 ロード時に、「admin」ユーザを登録する。
	@Override
//	DB登録
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.userDetailsService(userService)
		.passwordEncoder(passwordEncoder());

		if (userService.findAllList().isEmpty()) {
			userService.registerAdmin("admin", "secret", "admin@localhost");
			userService.registerManager("manager", "secret", "manager@localhost");
			userService.registerUser("user", "secret", "user@localhost");
		}
	}
	//変更点 PasswordEncoder(BCryptPasswordEncoder)メソッド
	@Bean
	public PasswordEncoder passwordEncoder() {
//

		//
		return new BCryptPasswordEncoder();
	}

}