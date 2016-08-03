package Thread;

import java.util.Scanner;

public class OneHundred extends Thread {
	String name;

	public OneHundred(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void run() {

		StringBuilder s = new StringBuilder();
		s = s.append(this.getName() + ":");
		for (int i = 1; i <= 100; i++) {
			s = s.append(" " + i);
			if (i % 10 == 0) {
				System.out.println(s);
				s = new StringBuilder();
				s = s.append(this.getName() + ":");

			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите start для запуска потоков");
		String start = sc.nextLine().toLowerCase();
		String prov = "start";
		if (prov.equals(start)) {
			OneHundred first = new OneHundred("Thread 1");
			OneHundred second = new OneHundred("Thread 2");

			first.start();
			second.start();

		} else {
			System.out.println("Не введено слово start");
		}
		sc.close();
	}
}
