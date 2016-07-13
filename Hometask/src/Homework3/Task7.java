package Homework3;

public class Task7 {

	public static void main(String[] args) {
		int[] array = { 22, -3, 12, 0, -32, 34, 65, 23, 34, -65 }; //Filling in of the array with initialization list
		int summa = 0;
		
		/* Display of the array */
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " | ");
		}
		
		/* Calculation of the sum of elements of the array to the first zero */
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				break;
			}
			summa += array[i];
		}
		System.out.println("\nСумма элементов массива до первого нуля: " + summa); // Display of the sum of elements of the array to the first zero
	}

}
