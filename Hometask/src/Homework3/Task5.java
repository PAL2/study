package Homework3;

public class Task5 {

	public static void main(String[] args) {
		
		/* Filling in of the array with random numbers */
		
		int[] array = new int[15];
		for (int i = 0; i < 15; i++) {
			array[i] = (int) (Math.random() * 100 + 1);
			System.out.print(array[i] + " | ");
		}
		
		int min = array[0]; // Assigning to the variable value
		
		/* Cycle of the searching of the min value of the array */
		
		for (int val : array) {
			if (val < min) {
				min = val;
			}
		}
		System.out.println("\nНаименьший элемент массива равен " + min); // Display of the min value of the array
		
		/* Min value of the array index search */
		
		for (int i = 0; i < 15; i++) {
			if (array[i] == min) {
				System.out.println("Индекс наименьшего элемента в массиве равен " + i);
			}
		}
	}
}