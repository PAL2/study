package Homework4;

public class Task3 {

	public static void main(String[] args) {
		String s = "Ma23#^ny countries h@ave mor421e tha23n one Na_tional Day";
		s = s.replaceAll("[ \t\n\r]+", " ");
		s = s.replaceAll("[^a-zA-Zа-яА-Я ]", "");
		System.out.println(s);
	}
}
