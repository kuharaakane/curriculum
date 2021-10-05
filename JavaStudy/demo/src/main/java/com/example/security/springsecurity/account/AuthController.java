package com.example.security.springsecurity.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//問４－１ コントローラーを意味するアノテーションを記述
@Controller
public class AuthController {

	@Autowired
//	特定のアノテーションを付与したクラスのインスタンスを使用できるようにする
	private AccountRepository repository;

	public List<Account> get() {
		return (List<Account>) repository.findAll();
	}
//	指定された条件と一致するすべての要素を取得

	@RequestMapping("/")
	public String index() {
		return "redirect:/top";
	}
//	Spring MVC のコントローラに付与して、リクエスト URL に対して、
//	どのメソッドが処理を実行するか定義するアノテーション。
//	redirect＝転送/topnにアクセスするとこのコントローラが実行される。

	@GetMapping("/login")
	public String login() {
		return "login";
	}
//	リクエストパラメータが指定されなかった時のデフォルト値を指定

	@PostMapping("/login")
	public String loginPost() {
		return "redirect:/login-error";
	}

	@GetMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		return "login";
	}
//	リクエストパラメータが指定されなかった時のデフォルト値を指定


	@RequestMapping("/top")
	public String top() {
		return "/top";
	}
//	Spring MVC のコントローラに付与して、リクエスト URL に対して、
//	どのメソッドが処理を実行するか定義するアノテーション。
//	/topnにアクセスするとこのコントローラが実行される。

}