import java.util.Scanner;

public class palindrome {
	public static viod main(String[] args) {
		String userInput, reverse;
		Scanner i = new Scanner(System.in);
		System.out.print("Enter a string to test if palindrome: ");
		System.out.println((userInput = i.nextLine().replaceAll(" ", 
"")).equalsIgnoreCase(reverse = new 
StringBuilder(userInput).reverse().toString()));
	}
}
