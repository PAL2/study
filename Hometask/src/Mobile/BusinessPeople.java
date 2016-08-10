package Mobile;

import java.util.ResourceBundle;

public class BusinessPeople extends Rate implements Roamingable, Internetable {

	public BusinessPeople(Name name, int quantitySubscribers, int subscriptionFee, int costOneMinuteCall) {
		super(name, quantitySubscribers, subscriptionFee, costOneMinuteCall);
	}

	ResourceBundle rb = ResourceBundle.getBundle("resources/LabelsBundle", Runner.currentLocale);
	
	@Override
	public void internet() {
		System.out.println(rb.getString("internet"));
	}

	@Override
	public void roaming() {
		System.out.println(rb.getString("roaming"));
	}

	@Override
	public void addSubsciber() {

	}

	@Override
	public void delSubscriber() {

	}
}