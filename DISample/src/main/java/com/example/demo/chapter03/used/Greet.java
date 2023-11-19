package com.example.demo.chapter03.used;

/* ルール① インターフェースを利用して依存関係を作る。 */

/* 「使われる側」インターフェース */ 
public interface Greet {
	/* 挨拶をする */
	void greeting();
}
