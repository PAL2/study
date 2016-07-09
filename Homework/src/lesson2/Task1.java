package Homework3;

public class Task1 {

	public static void main(String[] args) {
		float array[] = {1.1f, 3.2f, 3.1f, 5.4f, 6.3f, 5.4f, 3.4f, 3.7f, 5.3f, 4.1f}; // Create an array
		/* The display of array variables */
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + " | ");
		}
		float average = 0; // assignment of the initial value of the variable
		for (int i=0; i<10; i++){
			/* Cycle of calculating the sum of the array elements */
			average += array[i];
		}
		System.out.println("\naverage value = " + average/10); // Display the average value of the variables
	}
}
