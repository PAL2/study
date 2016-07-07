package lesson2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Create an object of class Scanner
		System.out.println("Введите целое число A"); // read integer A
		int A = in.nextInt();
		System.out.println("Введите целое число B"); // read integer B
		int B = in.nextInt();
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
