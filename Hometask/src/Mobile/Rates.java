package Mobile;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public abstract class Rates implements Comparable<Rates> {
	private String name;
	private int quantitySubscribers;
	private int subscriptionFee;
	private int costOneMinuteCall;
	private int costOneMB;

	public Rates(String name, int quantitySubscribers, int subscriptionFee, int costOneMinuteCall, int costOneMB) {
		this.name = name;
		this.quantitySubscribers = quantitySubscribers;
		this.subscriptionFee = subscriptionFee;
		this.costOneMinuteCall = costOneMinuteCall;
		this.costOneMB = costOneMB;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getQuantitySubscribers() {
		return quantitySubscribers;
	}


	public void setQuantitySubscribers(int quantitySubscribers) {
		this.quantitySubscribers = quantitySubscribers;
	}


	public int getSubscriptionFee() {
		return subscriptionFee;
	}


	public void setSubscriptionFee(int subscriptionFee) {
		this.subscriptionFee = subscriptionFee;
	}


	public int getCostOneMinuteCall() {
		return costOneMinuteCall;
	}


	public void setCostOneMinuteCall(int costOneMinuteCall) {
		this.costOneMinuteCall = costOneMinuteCall;
	}


	public int getCostOneMB() {
		return costOneMB;
	}


	public void setCostOneMB(int costOneMB) {
		this.costOneMB = costOneMB;
	}


	public abstract void addSubsciber();

	public abstract void delSubscriber();

	@Override
	public String toString() {
		return "Тариф: " + name + ", абонентская плата: " + subscriptionFee;
	}

	@Override
	public int compareTo(Rates r) {
		return new Integer(subscriptionFee).compareTo(new Integer(r.getSubscriptionFee()));
	}

	public static void main(String[] args) {
		SortedSet<Rates> rates = new TreeSet<>();
		rates.add(new BusinessPeople("Бизнес+", 50000, 130000, 200, 400));
		rates.add(new BusinessPeople("БизнесPro", 30000, 180000, 150, 300));
		rates.add(new ShortTalk("Все говорят", 350000, 75000, 250, 500));
		rates.add(new ShortTalk("Лето зовет", 230000, 60000, 300, 600));
		System.out.println("Сортировка тарифов на основе размера абонентской платы:");

		Iterator<Rates> iterator = rates.iterator();
		int quantity = 0;
		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		//	System.out.println(rates);
		//	quantity += getQuantitySubscribers();
		}
		System.out.println(quantity);
	}
}