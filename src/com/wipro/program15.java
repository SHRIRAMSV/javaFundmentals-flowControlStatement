package com.wipro;

public class program15 {

	public static void main(String[] args) {
		int size = Integer.parseInt(args[0]);

		for (int i = 1; i <= size; i++) {
			int j = 1;
			while (j <= i) {
				System.out.print("* ");
				j++;
			}

			System.out.println(); 
		}
	}

}
