package Homework3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		/* Filling in of the array with a keyboard*/
		
		Scanner in = new Scanner(System.in);
		int[] array2 = new int[15];
		for (int i = 0; i < 15; i++) {
			System.out.println("Введите " + (i + 1) + " элемент массива");
			array2[i] = in.nextInt();
		}
		System.out.println("\nМассив заполнен вводом с клавиатуры:");
		for (int i = 0; i < 15; i++) {
			System.out.printf("%3d |", array2[i]);
		}
		
		/* Filling in of the array with initialization list */
		
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		System.out.println("\nМассив заполнен с помощью списка инициализации:");
		for (int i = 0; i < 15; i++) {
			System.out.printf("%3d |", array1[i]);
		}
		int[] array3 = new int[15];
		for (int i = 0; i < 15; i++) {
			array3[i] = (int) (Math.random() * 100 + 1);
			
			/*Filling in of the array with random numbers*/
			
		}
		System.out.println("\nМассив заполнен случайными числами:");
		for (int i = 0; i < 15; i++) {
			System.out.printf("%3d |", array3[i]);
		}
	}
}