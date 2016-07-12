package Homework4;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Введите номер k-й буквы");
		int k = s.nextInt();
		System.out.println("Введите символ замены");
		String n = s.next();
		String str = new String("Soviet Russia denounced the Treaty of Brest-Litovsk and renewed its interest in the Baltic region.");
		String temp;
		String[] array = str.split(" ");
		for (int i = 0; i < array.length; i++) {
			if (k < array[i].length()) {
				temp = "";
				temp += array[i].substring(0, k - 1);
				temp += n;
				temp += array[i].substring(k, array[i].length());
				array[i] = temp;
			}
			System.out.print(array[i] + " ");
		}
	}
}