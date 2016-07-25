package Mobile;

public class ShortTalk extends Rates implements Internetable {

	public ShortTalk(String name, int quantitySubscribers, int subscriptionFee, int costOneMinuteCall, int costOneMB) {
		super(name, quantitySubscribers, subscriptionFee, costOneMinuteCall, costOneMB);
	}

	// public ShortTalk(String name, int quantitySubscribers, int
	// subscriptionFee, int costOneMinuteCall,
	// int costOneMB) {
	// super.name = name;
	// super.quantitySubscribers = quantitySubscribers;
	// super.subscriptionFee = subscriptionFee;
	// super.costOneMinuteCall = costOneMinuteCall;
	// super.costOneMB = costOneMB;
	// }

	@Override
	public void internet() {
		System.out.println("Наличие интернета");
	}

	@Override
	public void addSubsciber() {
	}

	@Override
	public void delSubscriber() {
	}

}
