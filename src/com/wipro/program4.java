package com.wipro;

public class program4 {

	public static void main(String[] args) {
		char firstchar= args[0].charAt(0);
		char secondchar=args[1].charAt(0);
		if(firstchar<secondchar) {
			System.out.println(firstchar+ "," +secondchar);
		}
		else {
			System.out.println(secondchar+ "," +firstchar);
		}
			

	}

}
