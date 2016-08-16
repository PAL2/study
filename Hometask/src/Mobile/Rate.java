package Mobile;

import java.text.NumberFormat;
import java.util.ResourceBundle;

public abstract class Rate implements Comparable<Rate> {

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

	ResourceBundle rb = ResourceBundle.getBundle("resources/LabelsBundle", Runner.currentLocale);
	NumberFormat rubFormat = NumberFormat.getCurrencyInstance(Runner.currentLocale);

	@Override
	public String toString() {
		return rb.getString("rate") + getName() + rb.getString("numberSub") + getQuantitySubscribers()
				+ rb.getString("subscriptionFee") + rubFormat.format(subscriptionFee) + rb.getString("callCost")
				+ rubFormat.format(costOneMinuteCall);
	}

	public abstract void addSubsciber();

	public abstract void delSubscriber();

	@Override
	public int compareTo(Rate r) {
		return new Integer(subscriptionFee).compareTo(new Integer(r.getSubscriptionFee()));
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