package lesson2;

import java.util.Scanner; // Import the class

public class Task5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Create an object of class Scanner
		System.out.println("Введите ваш рост в сантиметрах");
		int height = in.nextInt(); // reading the value of height
		System.out.println("Введите ваш вес");
		int weight = in.nextInt(); // reading the value of weight
		int optWeight = height - 100; // Calculation of ideal weight
		System.out.println("Ваш оптимальный вес = " + optWeight); // Display ideal weight
		/* cycle calculation optimal weight */
		if (optWeight > weight) {
			System.out.println("Вам необходимо поправиться");
		} else {
			if (optWeight < weight) {
				System.out.println("Вам необходимо похудеть");
			} else {
				System.out.println("Ваш вес в норме");
			}
		}

	}

}
