package Homework3;

public class Task2 {

	public static void main(String[] args) {
		int[] array = { 421, 42, 323, 9994, 435, 576, 347, 548, 659, 240 };
		int min = array[0];
		int max = array[0];
		for (int val : array) {
			if (val < min) {
				min = val;
			}
			if (val > max) {
				max = val;
			}
		}
		System.out.printf("min value = %,5d", min);
		System.out.printf("\nmax value = %,5d", max);
	}
}
