package com.wipro;

public class program3 {

	public static void main(String[] args) {

		int size = args.length;
		if (size == 0) {
			System.out.println("No Values");
		} else {
			if (size == 1) {

				System.out.print(args[0]);

			} else {
				for (int i = 0; i < size - 1; i++) {
					System.out.print(args[i] + ",");
				}
				System.out.print(args[size - 1]);
			}
		}
	}

}
