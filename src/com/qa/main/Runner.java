package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		Coins coins = new Coins();
		coins.change(4.58,80);
		System.out.println("\n");
		coins.change(3.17,200);
	}

}
