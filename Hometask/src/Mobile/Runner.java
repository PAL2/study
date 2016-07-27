package Mobile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Runner {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		int quantity = 0;
		SortedSet<Rate> rate = new TreeSet<>();
		rate.add(new BusinessPeople(Name.БизнесПлюс, 50000, 130000, 200));
		rate.add(new BusinessPeople(Name.БизнесПро, 100000, 180000, 150));
		rate.add(new ShortTalk(Name.ВсеГоворят, 95000, 110000, 250));
		rate.add(new ShortTalk(Name.ЛетоЗовет, 230000, 100000, 300));

		FileOutputStream fos = new FileOutputStream("temp.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		BusinessPeople business = new BusinessPeople(Name.Бизнес, 120000, 190000, 300);
		oos.writeObject(business);
		oos.close();

		FileInputStream fis = new FileInputStream("temp.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		BusinessPeople business1 = (BusinessPeople) ois.readObject();
		ois.close();

		Iterator<Rate> iterator4 = rate.iterator();
		while (iterator4.hasNext()) {
			System.out.println(iterator4.next());
		}

		Scanner in = new Scanner(System.in);
		System.out.println(
				"Вывести на экран:\n1. Список тарифов, отсортированный на основе размера абонентской платы\n2. Общую численность клиентов\n3. Тариф, соответствующий заданному диапазону параметров\t");
		try {
			int a = in.nextInt();
			switch (a) {
			case 1:

				System.out.println("Сортировка тарифов на основе размера абонентской платы:\n");

				Iterator<Rate> iterator = rate.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				break;
			case 2:
				Iterator<Rate> iterator2 = rate.iterator();
				while (iterator2.hasNext()) {
					Rate current = iterator2.next();
					quantity = quantity + current.getQuantitySubscribers();
				}
				System.out.println("\nОбщая численность абонентов: " + quantity);
				break;

			case 3:
				System.out.println("Введите диапазон параметров:");
				System.out.println("Минимальный размер абонентской платы:");
				int feeMin = in.nextInt();
				if (feeMin < 0) {
					System.out.println("Размер абонентской платы не может быть отрицательным:");
				}
				System.out.println("Максимльный размер абонентской платы:");
				int feeMax = in.nextInt();
				if (feeMax < 0) {
					System.out.println("Размер абонентской платы не может быть отрицательным:");
				}
				System.out.println("Минимальная стоимость минуты вызова:");
				int costMin = in.nextInt();
				if (costMin < 0) {
					System.out.println("Стоимость вызова не может быть отрицательной:");
				}
				System.out.println("Максимальная стоимость минуты вызова:");
				int costMax = in.nextInt();
				if (costMax < 0) {
					System.out.println("Стоимость вызова не может быть отрицательной:");
				}
				Iterator<Rate> iterator3 = rate.iterator();
				int i = 0;
				while (iterator3.hasNext()) {
					Rate current2 = iterator3.next();
					if (current2.getCostOneMinuteCall() <= costMax && current2.getCostOneMinuteCall() >= costMin
							&& current2.getSubscriptionFee() <= feeMax && current2.getSubscriptionFee() >= feeMin) {
						System.out.println(current2);
						i++;
					}
				}

				if (i == 0) {
					System.out.println("Нет тарифов, соответствующих заданному диапазону параметров!");
				}
				break;
			default:
				System.out.println("Неверно введено значение");
			}
		} catch (

		InputMismatchException e) {
			System.out.println("Введен неверный тип значения");
		}

		in.close();
	}

}