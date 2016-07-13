package Homework4;

public class Task3 {

	public static void main(String[] args) {
		String s = "Ma23#^ny countries h@ave mor421e tha23n one Na_tional Day";
		s = s.replaceAll("[ \t\n\r]+", " "); // Convert all whitespace to spaces
		s = s.replaceAll("[^a-zA-Zа-яА-Я ]", ""); // Delete all characters except spaces that are not letters
		System.out.println(s); 
	}
}
