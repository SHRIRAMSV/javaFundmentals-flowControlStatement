package com.wipro;

import java.util.Scanner;

public class program1B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two non-negative values");
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		lastdigit(value1, value2);
		sc.close();
	}

	public static void lastdigit(int value1, int value2) {

		if ((value1 % 10) == (value2 % 10)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
