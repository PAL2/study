package lesson2;

import java.util.Scanner; // Import the class

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Create an object of class Scanner
		System.out.println("Введите год");
		int year = sc.nextInt(); // read year
		/* Cheking whether a leap year */
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("Год високосный");
				} else {
					System.out.println("Год не високосный");
				}
			} else {
				System.out.println("Год високосный");
			}
		} else
			System.out.println("Год не високосный");
	}

}
