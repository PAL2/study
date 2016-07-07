package lesson2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Create an object of class Scanner
		System.out.println("Введите целое число A");
		int A = in.nextInt(); // read integer A
		System.out.println("Введите целое число B");
		int B = in.nextInt(); // read integer B
		/*
		 * Compare the number of A and B and display compare result
		 */
		if (A > B) {
			System.out.println("A>B");
		} else if (A < B) {
			System.out.println("A<B");
		} else {
			System.out.println("A=B");
		}
	}

}
