package Homework3;

public class Task9 {

	public static void main(String[] args) {
		int[] array = { 11, -3, 2, 2, 0, 34, 65, 0, 34, -65 };
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + " | ");
		}
		for (int i = 0; i < 10; i++) {
			if (array[i] == 0) {
			array[9] = array[i];
			}
		}

		System.out.print("\n");
		for (int j = 0; j < 10; j++) {
			System.out.print(array[j] + " | ");
		}
	}
}