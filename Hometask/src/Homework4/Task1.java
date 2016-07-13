package Homework4;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Введите номер k-й буквы");
		int k = s.nextInt(); // Entering letter number
		System.out.println("Введите символ замены");
		String n = s.next(); // Input letters substitute
		String str = ("An Independence Day is an annual event commemorating the anniversary of a nation's independence or statehood, usually after ceasing to be a group or part of another nation.");
		String temp;
		String[] array = str.split(" "); // Creating an array of words from a string
		
		/* Letters replacement cycle */
		
		for (int i = 0; i < array.length; i++) {
			if (k < array[i].length()) { // Comparing the value "K" and word length
				temp = "";
				temp += array[i].substring(0, k - 1);
				temp += n;
				temp += array[i].substring(k, array[i].length());
				array[i] = temp;
			}
			System.out.print(array[i] + " "); // Display a result of the conversion line
		}
	}
}
//