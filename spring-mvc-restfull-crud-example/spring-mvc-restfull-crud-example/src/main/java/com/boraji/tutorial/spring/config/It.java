package com.boraji.tutorial.spring.config;

public class It {

	int a;
	int b;
	int c;

	public static void main(String[] args) {

		It it = new It();
		it.run("everything");

	}

	void run(String ss) {

		if ((ss == null) || (ss.length() <= 1))
			System.out.println(ss);
		else {
			System.out.print(ss.charAt(ss.length() - 1));
			run(ss.substring(0, ss.length() - 1));
		}
	}
}
