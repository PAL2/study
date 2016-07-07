package lesson2;

public class Task1 {

	public static void main(String[] args) {
		String s = "Pivasik"; // With the text string
		int length = s.length(); // The calculation of the string length
		/*
		 * The output value of the length of the string to the console
		 */
		System.out.println("Длина строки = " + length);
		int n = length / 2; // Half-string division
		String s1 = s.substring(0, n); // Calculating a first half string
		String s2 = s.substring(n, length); // Calculating a second half string
		System.out.println(s1); // The display of the first half-string
		System.out.println(s2); // The display of the second half-string
	}

}
