package Homework3;

public class Task1 {

	public static void main(String[] args) {
		float array[] = { 2.1f, 2.3f, 4.1f, 3.2f, 6.3f, 4.2f, 4.5f, 2.3f, 2.2f, 1.1f }; // Initialization of the array
		/* Display of the array */
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + " | ");
		}
		float sum = 0; // Assigning to the variable value
		for (int i = 0; i < 10; i++) {
			sum += array[i]; // Calculation of the sum of the array
		}
		System.out.println("\naverage value = " + sum / 10); // Display of the average value of the array
	}
}
