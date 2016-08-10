package Mobile;

import java.util.ResourceBundle;

public class ShortTalk extends Rate implements Internetable {

	public ShortTalk(Name name, int quantitySubscribers, int subscriptionFee, int costOneMinuteCall) {
		super(name, quantitySubscribers, subscriptionFee, costOneMinuteCall);
	}

	ResourceBundle rb = ResourceBundle.getBundle("resources/LabelsBundle", Runner.currentLocale);

	@Override
	public void internet() {
		System.out.println(rb.getString("internet"));
	}

	@Override
	public void addSubsciber() {
	}

	@Override
	public void delSubscriber() {

	}
}
