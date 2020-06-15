package com.wipro;

public class program7 {

	public static void main(String[] args) {
		char val = args[0].charAt(0);

		if (Character.isLowerCase(val)) {

			System.out.println(Character.toUpperCase(val));
		} else if (Character.isUpperCase(val)){

			System.out.println(Character.toLowerCase(val));
		} else {
			System.out.println("Enter an alphabet");
		}

	}

}
