package lesson2;

import java.util.Scanner; // Import the class

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Create an object of class Scanner
		System.out.println("Введите целое число X");
		int X = sc.nextInt(); // read integer X
		System.out.println("Введите целое число Y");
		int Y = sc.nextInt(); // read integer Y
		System.out.println("X/Y=" + (double) X / Y); // Display the quotient of the X and Y
	}

}
