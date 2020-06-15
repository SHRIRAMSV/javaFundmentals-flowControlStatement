package com.wipro;

public class program17 {

	public static void main(String[] args) {
		int sum = 0, rem = 0;
		int i = Integer.parseInt(args[0]);
		int j = i;
		while (j % 10 > 0) {

			rem = j % 10;
			sum = (sum * 10) + rem;
			j = j / 10;

		}

		if (sum == i) {
			System.out.println(i + " is a palindrome");
		} 
		else {
			System.out.println(i + " is not a palindrome");
		}

	}

}
