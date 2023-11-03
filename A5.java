package test;

import java.util.Scanner;

public class A5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the integers separated by spaces ");
		String input = scanner.nextLine();
		String[] inputArray = input.split(" ");

		try {
			checkForDuplicates(inputArray);
			System.out.println("No duplicate numbers!");
		}

		catch (DuplicateNumberException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void checkForDuplicates(String[] numbers) throws DuplicateNumberException {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i].equals(numbers[j])) {
					throw new DuplicateNumberException("Error: Duplicate number found: " + numbers[i]);
				}
			}
		}
	}
}

class DuplicateNumberException extends Exception {
	public DuplicateNumberException(String message) {
		super(message);
	}
}

/*
 * 5) Write a Java program that reads a list of integers from the user and
 * throws an exception if any numbers are duplicates. Test Case : Input the
 * Integers 1 2 3 3 4 5 Error: Duplicate number found: 3 Test Case: Input 1 2 3
 * 4 5 6 No duplicate numbers
 */
