package com.qa.main;

public class Coins {
	public void change(double price, double payment) {
		System.out.println("Price: £" + price + "\nPayment given: £" + payment);
		double owed = payment - price + 0.00001;
		System.out.println(owed);
		int fifty = 0, twenty = 0, ten = 0, five = 0, two = 0, one = 0, fiftyP = 0, twentyP = 0, tenP = 0, fiveP = 0,
				twoP = 0, oneP = 0;
		if (owed < 0) {
			System.out.println("Try paying more.");
		}
		for (; owed >= 50; owed -= 50) {
			fifty++;
		}
		if (fifty == 1) {
			System.out.println(fifty + " fifty pound note.");
		}
		if (fifty > 1) {
			System.out.println(fifty + " fifty pound notes.");
		}
		for (; owed >= 20; owed -= 20) {
			twenty++;
		}
		if (twenty == 1) {
			System.out.println(twenty + " twenty pound note.");
		}
		if (twenty > 1) {
			System.out.println(twenty + " twenty pound notes.");
		}
		for (; owed >= 10; owed -= 10) {
			ten++;
		}
		if (ten == 1) {
			System.out.println(ten + " ten pound note.");
		}
		if (ten > 1) {
			System.out.println(ten + " ten pound notes.");
		}
		for (; owed >= 5; owed -= 5) {
			five++;
		}
		if (five == 1) {
			System.out.println(five + " five pound note.");
		}
		if (five > 1) {
			System.out.println(five + " five pound notes.");
		}
		for (; owed >= 2; owed -= 2) {
			two++;
		}
		if (two == 1) {
			System.out.println(two + " two pound coin.");
		}
		if (two > 1) {
			System.out.println(two + " two pound coins.");
		}
		for (; owed >= 1; owed -= 1) {
			one++;
		}
		if (one == 1) {
			System.out.println(one + " one pound coin.");
		}
		if (one > 1) {
			System.out.println(one + " one pound coins.");
		}
		for (; owed >= 0.5; owed -= 0.5) {
			fiftyP++;
		}
		if (fiftyP == 1) {
			System.out.println(fiftyP + " fifty pence coin.");
		}
		if (fiftyP > 1) {
			System.out.println(fiftyP + " fifty pence coins.");
		}
		for (; owed >= 0.2; owed -= 0.2) {
			twentyP++;
		}
		if (twentyP == 1) {
			System.out.println(twentyP + " twenty pence coin.");
		}
		if (twentyP > 1) {
			System.out.println(twentyP + " twenty pence coins.");
		}
		for (; owed >= 0.1; owed -= 0.1) {
			tenP++;
		}
		if (tenP == 1) {
			System.out.println(tenP + " ten pence coin.");
		}
		if (tenP > 1) {
			System.out.println(tenP + " ten pence coins.");
		}
		for (; owed >= 0.05; owed -= 0.05) {
			fiveP++;
		}
		if (fiveP == 1) {
			System.out.println(fiveP + " five pence coin.");
		}
		if (fiveP > 1) {
			System.out.println(fiveP + " five pence coins.");
		}
		for (; owed >= 0.02; owed -= 0.02) {
			twoP++;
		}
		if (twoP == 1) {
			System.out.println(twoP + " two pence coin.");
		}
		if (twoP > 1) {
			System.out.println(twoP + " two pence coins.");
		}
		for (; owed >= 0.01; owed -= 0.01) {
			oneP++;
		}
		if (oneP == 1) {
			System.out.println(oneP + " one penny coin.");
		}
		if (oneP > 1) {
			System.out.println(oneP + " one penny coins.");
		}
	}
}
