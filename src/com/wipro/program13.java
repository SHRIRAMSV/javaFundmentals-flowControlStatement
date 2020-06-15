package com.wipro;

public class program13 {

	public static void main(String[] args) {
		System.out.println("Prime Numbers:");
		for(int val=10;val<99;val++) {
			int num = val;
			boolean flag = false;
			for (int i = 2; i <= num / 2; ++i) {
				if (num % i == 0) {
					flag = true;
					break;
				}
			}

			if (!flag)
				System.out.println(num);
				}

		}
		
	
}
