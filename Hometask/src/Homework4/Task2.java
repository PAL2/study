package Homework4;

public class Task2 {

	public static void main(String[] args) {
		String s = "Many countries have more than one National Day".toLowerCase();
		String first = "";
		String second = "";
		for (char ch : s.toCharArray()) {
			first += Character.isLetter(ch) ? String.format("%-3s", ch) : ch;
			second += Character.isLetter(ch) ? String.format("%-3s", ch - 'a' + 1) : ch;
		}
		System.out.println(first);
		System.out.println(second);
	}
}