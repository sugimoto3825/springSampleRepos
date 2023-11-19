package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/* DIプログラムサンプル
 * 
 * 【 DIを使うときのルール 】
 * ①インターフェースを利用して依存関係を作る。
 * 　（×クラスを利用して依存関係を作る　←別のクラスに差し替える場合などの修正範囲が多くなる）
 * 
 * ②インスタンスを明示的に生成しない。 
 * 
 * ③アノーテーションをクラスに付与する。
 * 
 * ④Spring Frameworkにインスタンス生成させる。
 * 
 * ⑤インスタンスを利用したい場所でアノーテーションを付与する。
 */

import com.example.demo.chapter03.used.Greet;

/* SpringBoot起動クラス */
@SpringBootApplication
public class DiSampleApplication {
	/*
	 * ルール② インスタンスを明示的に生成しない。 
	 * ルール⑤ インスタンスを利用したい場所でアノーテーションを付与する。
	 */
	/* 注入される箇所 */
	@Autowired
	Greet greet;
	
	/* 実行メソッド */
	private void execute() {
		greet.greeting();
	}

	/* mainメソッド */
	public static void main(String[] args) {
		SpringApplication.run(DiSampleApplication.class, args).getBean(DiSampleApplication.class).execute();;
	}

}
