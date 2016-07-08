package lesson2;

import java.util.Scanner; // Import the class Scanner

public class Task7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Create an object of class Scanner
		System.out.println("Введите номер дня недели");
		int n = in.nextInt(); // Reading the value of a number
		switch (n) {
		case 1: // Compare
			System.out.println("Понедельник"); // Display weekday name
			break;
		case 2: // Compare
			System.out.println("Вторник"); // Display weekday name
			break;
		case 3: // Compare
			System.out.println("Среда"); // Display weekday name
			break;
		case 4: // Compare
			System.out.println("Четверг"); // Display weekday name
			break;
		case 5: // Compare
			System.out.println("Пятница"); // Display weekday name
			break;
		case 6: // Compare
			System.out.println("Суббота"); // Display weekday name
			break;
		case 7:// Compare
			System.out.println("Воскресенье"); // Display weekday name
			break;
		default:
			System.out.println("Дня недели с таким номером не существует"); // Display an error message
		}
	}

}
