package Homework4;

public class Task2 {

	public static void main(String[] args) {
		String s = "Many countries have more than one National Day".toLowerCase(); // Translate the string to lowercase
		String first = ""; // Create a blank line
		String second = ""; // Create a blank line
		for (char ch : s.toCharArray()) { // Convert the string into an array of characters
			first += Character.isLetter(ch) ? String.format("%-3s", ch) : ch; // Split line on the letters and spaces
			second += Character.isLetter(ch) ? String.format("%-3s", ch - 'a' + 1) : ch; // display a number of letters
		}
		System.out.println(first);
		System.out.println(second);
	}
}