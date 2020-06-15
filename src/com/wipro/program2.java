package com.wipro;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int value = sc.nextInt();
		
		if (value%2==0) {
			System.out.println("The given integer number is even");
		} else {
			System.out.println("The given integer number is odd");
		}
	sc.close();
	}

}
