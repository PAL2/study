package Homework3;

public class Task5 {

	public static void main(String[] args) {
		int[] array = new int[15];
		for (int i = 0; i < 15; i++) {
			array[i] = (int) (Math.random() * 100 + 1);
			System.out.print(array[i] + " | ");
		}
		int min = array[0];
		for (int val : array) {
			if (val < min) {
				min = val;
			}
		}
		System.out.println("\nНаименьший элемент массива равен " + min);
		for (int i = 0; i < 15; i++) {
			if (array[i] == min) {
				System.out.println("Индекс наименьшего элемента в массиве равен " + i);
			}
		}
	}
}