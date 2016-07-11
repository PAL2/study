package Homework3;

public class Task4 {

	public static void main(String[] args) {
		int[] array = new int[15];
		for (int i = 0; i < 15; i++) {
			array[i] = (int) (Math.random() * 100 + 1);
			System.out.print(array[i] + " | ");
		}
		int max = array[0];
		for (int val : array) {
			if (val > max) {
				max = val;
			}
		}
		System.out.println("\nНаибольший элемент массива равен " + max);
		for (int i = 0; i < 15; i++) {
			if (array[i] == max) {
				System.out.println("Индекс наибольшего элемента в массиве равен " + i);
			}
		}
	}
}