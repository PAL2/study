package Homework3;

public class Task1 {

	public static void main(String[] args) {
		float array[] = { 2.1f, 2.3f, 4.1f, 3.2f, 6.3f, 4.2f, 4.5f, 2.3f, 2.2f, 1.1f };
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + " | ");
		}
		float sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += array[i];
		}
		System.out.println("\naverage value = " + sum / 10);
	}
}
