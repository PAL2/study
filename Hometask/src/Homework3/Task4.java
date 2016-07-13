package Homework3;

public class Task4 {

	public static void main(String[] args) {

		/* Filling in of the array with random numbers */

		int[] array = new int[15];
		for (int i = 0; i < 15; i++) {
			array[i] = (int) (Math.random() * 100 + 1);
			System.out.print(array[i] + " | ");
		}
		
		int max = array[0]; // Assigning to the variable value
		
		/* Cycle of the searching of the max value of the array */
		
		for (int val : array) {
			if (val > max) {
				max = val;
			}
		}
		System.out.println("\nНаибольший элемент массива равен " + max); // Display of the max value of the array
		
		/* Max value of the array index search */
		
		for (int i = 0; i < 15; i++) {
			if (array[i] == max) {
				System.out.println("Индекс наибольшего элемента в массиве равен " + i);
			}
		}
	}
}