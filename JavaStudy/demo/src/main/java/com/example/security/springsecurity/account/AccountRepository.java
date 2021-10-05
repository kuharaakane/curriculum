package com.example.security.springsecurity.account;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//問２－１ リポジトリを作成するアノテーションを記述
@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
    public Account findByUsername(String username);
//    findByUsername　ユーザー名で検索
    public List<Account> findAll();
}

//CrudRepository:データベースのテーブルへ対応するクラス
//　　　　　　　　　一般的なCread/Read/Update/Delete操作が定義されている
//findByUsername(String username)　
//Spring Session を使用してユーザー名でセッションを検索する
