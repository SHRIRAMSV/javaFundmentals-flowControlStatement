package com.wipro;

public class program5 {

	public static void main(String[] args) {
		char value = args[0].charAt(0);
		charCheck(value);

	}

	public static void charCheck(char value) {

		if ((value >= 65 && value <= 90) || (value >= 97 && value <= 122))
			System.out.println(" Alphabet ");

		else if (value >= 48 && value <= 57)
			System.out.println(" Digit ");

		else
			System.out.println(" Special Character ");
	}
}
