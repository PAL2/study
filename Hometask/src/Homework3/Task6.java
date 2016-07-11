package Homework3;

public class Task6 {

	public static void main(String[] args) {
		int[] array = { 32, -34, 34, 13, -32, 34, 65, -94, 34, -65 };
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " | ");
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0){
				j = j+1;
			}
		}
		System.out.println("\nКоличество отрицательных элементов: " + j);
	}

}
