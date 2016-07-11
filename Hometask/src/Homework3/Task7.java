package Homework3;

public class Task7 {

	public static void main(String[] args) {
		int[] array = { 22, -3, 12, 0, -32, 34, 65, 23, 34, -65 };
		int summa = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " | ");
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				break;
			}
			summa += array[i];
		}
		System.out.println("\nСумма элементов массива до первого нуля: " + summa);
	}

}
