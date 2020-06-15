package com.wipro;

public class program14 {

	public static void main(String[] args) {
		int sum = 0, rem = 0;
		int i = Integer.parseInt(args[0]);

		for (int j = i; j % 10 > 0;) {

			rem = j % 10;
			sum = sum + rem;
			j = j / 10;

		}

		System.out.println(sum);
	}

}
