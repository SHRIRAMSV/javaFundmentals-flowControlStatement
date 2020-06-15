package com.wipro;

public class program16 {

	public static void main(String[] args) {
		int sum = 0, rem = 0;
		int i = Integer.parseInt(args[0]);
		int j = i;
		while (j % 10 > 0) {

			rem = j % 10;
			sum = (sum * 10) + rem;
			j = j / 10;

		}

		System.out.println(sum);

	}

}
