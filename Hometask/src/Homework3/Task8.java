package Homework3;

public class Task8 {

	public static void main(String[] args) {
		int[] array = { 11, -3, 2, 2, 0, 34, 65, 23, 34, -65 }; //Filling in of the array with initialization list
		int op = 1;
		
		/* Display of the array */
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " | ");
		}
		
		/* Calculation of the op. of elements of the array to the first zero */
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				break;
			}
			op = op * array[i];
		}
		System.out.println("\nПроизведение элементов массива до первого нуля: " + op); // Display of the op. of elements of the array to the first zero
	}

}
