package Homework3;

public class Task6 {

	public static void main(String[] args) {
		int[] array = { 32, -34, 34, 13, -32, 34, 65, -94, 34, -65 }; //Filling in of the array with initialization list
		int j = 0; // Assigning to the variable value
		
		/* Display of the array */
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " | ");
		}
		
		/* Cycle of the searching of the negative value of the array */
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0){
				j = j+1;
			}
		}
		System.out.println("\nКоличество отрицательных элементов: " + j);
	}

}
