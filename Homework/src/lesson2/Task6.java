package lesson2;

import java.util.Scanner; // Import the class Scanner

public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Create an object of class Scanner
		System.out.println("Введите число в диапазоне от 1 до 999");
		int r = in.nextInt(); // Reading the value of a number
		int r10 = r % 10; // Calculation the remainder of the division the number by 10
		int r100 = r % 100; // Calculation the remainder of the division the number by 100
		/* Cycle determining the correct case*/
		if (0 < r & r < 1000) { // Check entry number in the range 1 to 999
			if (11 <= r100 & r100 <= 19) { // Checking entry the remainder of the division by 100 in the range from 11 to 19
				System.out.println(r + " рублей"); // Display ending numbers from 11 to 19
			} else {
				switch (r10) {// Checking the remainder of the division by 10
				case 1:
					System.out.println(r + " рубль"); // Display number with the end of 1
					break;
				case 2:
					System.out.println(r + " рубля"); // Display number with the end of 2
					break;
				case 3:
					System.out.println(r + " рубля"); // Display number with the end of 3
					break;
				case 4:
					System.out.println(r + " рубля"); // Display number with the end of 4
					break;
				default:
					System.out.println(r + " рублей"); // Display numbers other end
				}
			}
		} else {
			/* Display a message that the number is not included in the range from 1 to 999 */
			System.out.println("Введено число не входящее в диапазон от 1 до 999");
		}
	}
}
