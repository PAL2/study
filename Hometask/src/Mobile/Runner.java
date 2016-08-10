package Mobile;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Runner {
	static Locale currentLocale = Locale.getDefault();

	public static void main(String[] args) throws ParseException {

		Date currentDate = new Date();
		System.out.println("Choose language:\n1. English\n2. Russian");
		Scanner in = new Scanner(System.in);

		try {
			int lang = in.nextInt();
			switch (lang) {
			case 1:
				Locale locEn = new Locale("en", "IE");
				currentLocale = locEn;
				break;
			case 2:
				Locale locRu = new Locale("ru", "RU");
				currentLocale = locRu;
				break;
			default:
				System.out.println("Invalid value entered!");
				in.close();
				return;
			}
		} catch (InputMismatchException e) {
			System.out.println("An incorrect type of value!");
			return;
		}

		ResourceBundle rb = ResourceBundle.getBundle("resources/LabelsBundle", currentLocale);
		NumberFormat numFormat = NumberFormat.getNumberInstance(currentLocale);
		NumberFormat rubFormat = NumberFormat.getCurrencyInstance(currentLocale);
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, currentLocale);
		System.out.println(df.format(currentDate));

		System.out.println(new BusinessPeople(Name.BusinessPlus, 50000, 130000, 200));
		System.out.println(new BusinessPeople(Name.BusinessPro, numFormat.parse("100000").intValue(), 180000, 150));

		new BusinessPeople(Name.BusinessPlus, numFormat.parse("50000").intValue(), 130000, 200);
		new BusinessPeople(Name.BusinessPro, numFormat.parse("100000").intValue(), 180000, 150);
		new ShortTalk(Name.AllSpeak, numFormat.parse("95000").intValue(), 110000, 250);
		new ShortTalk(Name.SummerCall, numFormat.parse("230000").intValue(), 100000, 300);

		int quantity = 0;
		SortedSet<Rate> rate = new TreeSet<>();
		rate.add(new BusinessPeople(Name.BusinessPlus, numFormat.parse("50000").intValue(), 130000, 200));
		rate.add(new BusinessPeople(Name.BusinessPro, numFormat.parse("100000").intValue(), 180000, 150));
		rate.add(new ShortTalk(Name.AllSpeak, numFormat.parse("95000").intValue(), 110000, 250));
		rate.add(new ShortTalk(Name.SummerCall, numFormat.parse("230000").intValue(), 100000, 300));

		System.out.println(rubFormat.format(10000));
		System.out.println(numFormat.parse("50000.1").doubleValue());
		
		System.out.println(rb.getString("ListOfRates"));
		Iterator<Rate> iterator4 = rate.iterator();
		while (iterator4.hasNext()) {
			System.out.println(iterator4.next());
		}

		System.out.println(rb.getString("menu"));

		try {
			int a = in.nextInt();
			switch (a) {
			case 1:

				System.out.println(rb.getString("sort"));
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
				System.out.println(rb.getString("number") + quantity);
				break;

			case 3:
				System.out.println(rb.getString("menu3"));
				System.out.println(rb.getString("fMin"));
				int feeMin = in.nextInt();
				if (feeMin < 0) {
					System.out.println(rb.getString("feeMinus"));
				}
				System.out.println(rb.getString("fMax"));
				int feeMax = in.nextInt();
				if (feeMax < 0) {
					System.out.println(rb.getString("feeMinus"));
				}
				System.out.println(rb.getString("cMin"));
				int costMin = in.nextInt();
				if (costMin < 0) {
					System.out.println(rb.getString("costMinus"));
				}
				System.out.println(rb.getString("cMax"));
				int costMax = in.nextInt();
				if (costMax < 0) {
					System.out.println(rb.getString("costMinus"));
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
					System.out.println(rb.getString("noRates"));
				}
				break;
			default:
				System.out.println(rb.getString("invalidValue"));
			}
		} catch (InputMismatchException e) {
			System.out.println(rb.getString("incorrectType"));
		}
		in.close();
	}
}
