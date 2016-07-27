package Mobile;

import java.io.Serializable;

public abstract class Rate implements Comparable<Rate>, Serializable {

	private static final long serialVersionUID = 1L;
	private Name name;
	private int quantitySubscribers;
	private int subscriptionFee;
	private int costOneMinuteCall;

	public Rate(Name name, int quantitySubscribers, int subscriptionFee, int costOneMinuteCall) {
		this.name = name;
		this.quantitySubscribers = quantitySubscribers;
		this.subscriptionFee = subscriptionFee;
		this.costOneMinuteCall = costOneMinuteCall;
	}

	public abstract void addSubsciber();

	public abstract void delSubscriber();

	@Override
	public int compareTo(Rate r) {
		return new Integer(subscriptionFee).compareTo(new Integer(r.getSubscriptionFee()));
	}

	@Override
	public String toString() {
		return "Тариф: " + name + ", количество абонентов: " + quantitySubscribers + ", абонплата: " + subscriptionFee
				+ ", стоимость вызова: " + costOneMinuteCall;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
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

}

/*
 * 
 */