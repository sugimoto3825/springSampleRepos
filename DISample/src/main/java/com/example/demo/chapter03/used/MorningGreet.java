package com.example.demo.chapter03.used;

import org.springframework.stereotype.Component;

/*
 * ルール③ アノーテーションをクラスに付与する。
 * 　→1つのインターフェースに対して1つの実装クラスのみ@Componentアノーテーションを付与する。
 * 　　付与しないと下記のコンパイルエラーが発生する。
 *     エラー: Field greet in com.example.demo.DiSampleApplication required a single bean, but 2 were found:
 * ルール④ Spring Frameworkにインスタンス生成させる。
 * 　→起動時のコンポーネントスキャン後、インスタンス生成アノーテーションが付与されたクラスのインスタンスを自動生成する。
 */

/* 実装クラス その1 */
//@Component
public class MorningGreet implements Greet {
	@Override
//	public void greeting() {
	public void greeting() {
		System.out.println("----------------------");
		System.out.println("おはようございます！");
		System.out.println("----------------------");
	}
}
