package com.wipro;
import java.util.Scanner;
public class program1A {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>0)
		{
			System.out.println("The given integer number is Positive");
		}
		else if(a<0)
		{
			System.out.println("The given integer number is Negative");
		}
		else 
		{
			System.out.println("The given integer number is Zero");
		}
	}

}
