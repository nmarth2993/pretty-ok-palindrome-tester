/*
 * Copyright 2018 Nicholas Marthinuss
 * https://github.com/nmarth2993
 * Licensed under the MIT License
 */

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		String userInput, reverse;
		Scanner i = new Scanner(System.in);
		System.out.print("Enter a string to test if palindrome: ");
		System.out.println((userInput = i.nextLine().replaceAll(" ", "")).equalsIgnoreCase(reverse 
			= new StringBuilder(userInput).reverse().toString()));
	}
}
