package lesson2;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число N");
		int n = in.nextInt();
		double sum = 0;
		for (double i = 1; i <= n; i++) {
			sum = sum + 1 / i;
		}
		System.out.println("Сумма " + n + " членов ряда равна " + sum);

	}
}