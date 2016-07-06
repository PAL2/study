package lesson2;

public class Task1 {

	public static void main(String[] args) {
		String s = "Pivasik";
		  int length = s.length();
		  System.out.println("Длина строки = " + length);
		  int n = length/2;
		  String s1 = s.substring(0, n);
		  String s2 = s.substring(n, length);
		  System.out.println(s1);
		  System.out.println(s2);
	}

}
