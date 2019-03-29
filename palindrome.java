/*
 * Copyright 2018 Nicholas Marthinuss
 * https://github.com/nmarth2993
 * Licensed under the MIT License
 */

import java.util.*;

public class palindrome {
	public static void main(String[] args) {
		String s, r;
		Scanner i = new Scanner(System.in);
		System.out.print("Enter a string to test if palindrome: ");
		System.out.print((s = i.nextLine().replaceAll(" ", "")).equalsIgnoreCase(r 
			= new StringBuilder(s).reverse().toString()));
	}
}
