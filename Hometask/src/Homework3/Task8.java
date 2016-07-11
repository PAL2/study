package Homework3;

public class Task8 {

	public static void main(String[] args) {
		int[] array = { 11, -3, 2, 2, 0, 34, 65, 23, 34, -65 };
		int op = 1;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " | ");
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				break;
			}
			op = op * array[i];
		}
		System.out.println("\nПроизведение элементов массива до первого нуля: " + op);
	}

}
