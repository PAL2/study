package lesson2;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число N");
		long n = in.nextLong();
		long f = 1;
		for (long i = 1; i <= n; i++) {
			f=f*i;
		}
		System.out.println(n + "! = " + (long)f);

	}
}