/*
 * Copyright 2018 Nicholas Marthinuss
 * https://github.com/nmarth2993
 * Licensed under the MIT License
 */

import java.util.*;

public class p {
	public static void main(String[] a) {
		String s;
		System.out.print("p:" + (s = new Scanner(System.in).nextLine().replaceAll(" ", ""))
				.equalsIgnoreCase(new StringBuilder(s).reverse().toString()));
	}
}
