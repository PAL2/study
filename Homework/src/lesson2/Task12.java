package lesson2;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число N");
		int n = in.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Сумма чисел от 1 до " + n + " равна " + sum);

	}
}