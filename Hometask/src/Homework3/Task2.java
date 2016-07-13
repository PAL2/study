package Homework3;

public class Task2 {

	public static void main(String[] args) {
		int[] array = { 421, 42, 323, 9994, 435, 576, 347, 548, 659, 240 }; // Initialization of the array
		int min = array[0]; // Assigning to the variable value of the first element of the array
		int max = array[0]; // Assigning to the variable value of the first element of the array
		
		/* Cycle of the searching of the min and max value of the array */
		
		for (int val : array) {
			if (val < min) {
				min = val;
			}
			if (val > max) {
				max = val;
			}
		}
		System.out.printf("min value = %,5d", min); // Display of the min value of the array
		System.out.printf("\nmax value = %,5d", max); // Display of the max value of the array
	}
}
