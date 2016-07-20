package Airline;

import java.util.Scanner;

import Airline.Flight;

public class Airline {

	public static void main(String[] args) {

		Flight[] fly = new Flight[6];
		fly[0] = new Flight("Ларнака", "B121", "Boeing-747", "11:00", "Суббота", 1100);
		fly[1] = new Flight("Лондон", "B331", "Boeing-767", "04:00", "Среда", 400);
		fly[2] = new Flight("Лондон", "B543", "Airbus-330", "18:00", "Суббота", 1800);
		fly[3] = new Flight("Ларнака", "B621", "Airbus-320", "01:00", "Среда", 100);
		fly[4] = new Flight("Ларнака", "B113", "Boeing-747", "15:00", "Среда", 1500);
		fly[5] = new Flight("Лондон", "B911", "Airbus-330", "05:00", "Среда", 500);

		System.out.println("Выберите пункт: \n" + "1.Вывести список рейсов для заданного пункта назначения\n"
				+ "2.Вывести список рейсов для заданного дня недели\n"
				+ "3.Вывести список рейсов для заданного дня недели, время\n"
				+ " вылета  для которых больше заданного");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		switch (i) {
		case 1:
			System.out.println("Выберите пункт назначения: \n" + "1.Ларнака\n" + "2.Лондон");
			int i1 = sc.nextInt();
			switch (i1) {
			case 1:
				System.out.println("Пункт назначения Номер рейса   Тип самолета Время вылета День недели");
				for (i = 0; i <= 5; i++) {
					fly[i].larnaka();
				}
				break;
			case 2:
				System.out.println("Пункт назначения Номер рейса   Тип самолета Время вылета День недели");
				for (i = 0; i <= 5; i++) {
					fly[i].london();
				}
				break;
			}
			break;
		case 2:
			System.out.println("Выберите день недели: \n" + "1.Среда\n" + "2.Суббота");
			int i2 = sc.nextInt();
			switch (i2) {
			case 1:
				System.out.println("Пункт назначения Номер рейса   Тип самолета Время вылета День недели");
				for (i = 0; i <= 5; i++) {
					fly[i].wednesday();
				}
				break;
			case 2:
				System.out.println("Пункт назначения Номер рейса   Тип самолета Время вылета День недели");
				for (i = 0; i <= 5; i++) {
					fly[i].saturday();
				}
				break;
			}
			break;
		case 3:
			System.out.println("Выберите день недели и временной промежуток: \n" + "1.Среда с 00 до 12 часов\n"
					+ "2.Среда с 12 до 24 часов\n" + "3.Суббота с 00 до 12 часов\n" + "4.Суббота с 12 до 24 часов");
			int i3 = sc.nextInt();
			switch (i3) {
			case 1:
				System.out.println("Пункт назначения Номер рейса   Тип самолета Время вылета День недели");
				for (i = 0; i <= 5; i++) {
					fly[i].wednesdayFirstHalf();
				}
				break;
			case 2:
				System.out.println("Пункт назначения Номер рейса   Тип самолета Время вылета День недели");
				for (i = 0; i <= 5; i++) {
					fly[i].wednesdaySecondHalf();
				}
				break;
			case 3:
				System.out.println("Пункт назначения Номер рейса   Тип самолета Время вылета День недели");
				for (i = 0; i <= 5; i++) {
					fly[i].saturdayFirstHalf();
				}
				break;
			case 4:
				System.out.println("Пункт назначения Номер рейса   Тип самолета Время вылета День недели");
				for (i = 0; i <= 5; i++) {
					fly[i].saturdaySecondHalf();
				}
				break;
			}
		}
		sc.close();
	}
}