package com.qa.main;

public class Coins {
	public void change(double Price, double Payment) {
		System.out.println("Price: £" + Price + "\nPayment given: £" + Payment);
		double Owed = Payment - Price + 0.002;
		int fifty=0, twenty=0, ten=0, five=0, two=0, one=0, fiftyP=0, twentyP=0, tenP=0, fiveP=0, twoP=0, oneP=0;
		if (Owed < 0) {
			System.out.println("Try paying more.");
		}
		for (;Owed>=50;Owed-=50) {
			fifty++;
		}
		if (fifty == 1) {
			System.out.println(fifty + " fifty pound note.");
		}
		if (fifty > 1) {
			System.out.println(fifty + " fifty pound notes.");
		}
		for (;Owed>=20;Owed-=20) {
			twenty++;
		}
		if (twenty == 1) {
			System.out.println(twenty + " twenty pound note.");
		}
		if (twenty > 1) {
			System.out.println(twenty + " twenty pound notes.");
		}
		for (;Owed>=10;Owed-=10) {
			ten++;
		}
		if (ten == 1) {
			System.out.println(ten + " ten pound note.");
		}
		if (ten > 1) {
			System.out.println(ten + " ten pound notes.");
		}
		for (;Owed>=5;Owed-=5) {
			five++;
		}
		if (five == 1) {
			System.out.println(five + " five pound note.");
		}
		if (five > 1) {
			System.out.println(five + " five pound notes.");
		}
		for (;Owed>=2;Owed-=2) {
			two++;
		}
		if (two == 1) {
			System.out.println(two + " two pound coin.");
		}
		if (two > 1) {
			System.out.println(two + " two pound coins.");
		}
		for (;Owed >= 1;Owed-=1) {
			one++;
		}
		if (one == 1) {
			System.out.println(one + " one pound coin.");
		}
		if (one > 1) {
			System.out.println(one + " one pound coins.");
		}
		for (;Owed >= 0.5;Owed-=0.5) {
			fiftyP++;
		}
		if (fiftyP == 1) {
			System.out.println(fiftyP + " fifty pence coin.");
		}
		if (fiftyP > 1) {
			System.out.println(fiftyP + " fifty pence coins.");
		}
		for (;Owed >= 0.2;Owed-=0.2) {
			twentyP++;
		}
		if (twentyP == 1) {
			System.out.println(twentyP + " twenty pence coin.");
		}
		if (twentyP > 1) {
			System.out.println(twentyP + " twenty pence coins.");
		}
		for (;Owed >= 0.1;Owed-=0.1) {
			tenP++;
		}
		if (tenP == 1) {
			System.out.println(tenP + " ten pence coin.");
		}
		if (tenP > 1) {
			System.out.println(tenP + " ten pence coins.");
		}
		for (;Owed >= 0.05;Owed-=0.05) {
			fiveP++;
		}
		if (fiveP == 1) {
			System.out.println(fiveP + " five pence coin.");
		}
		if (fiveP > 1) {
			System.out.println(fiveP + " five pence coins.");
		}
		for (;Owed >= 0.02;Owed-=0.02) {
			twoP++;
		}
		if (twoP == 1) {
			System.out.println(twoP + " two pence coin.");
		}
		if (twoP > 1) {
			System.out.println(twoP + " two pence coins.");
		}
		for (;Owed >= 0.01;Owed-=0.01) {
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

