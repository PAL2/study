package Mobile;

public class ShortTalk extends Rate implements Internetable {

	private static final long serialVersionUID = 1L;

	public ShortTalk(Name name, int quantitySubscribers, int subscriptionFee, int costOneMinuteCall) {
		super(name, quantitySubscribers, subscriptionFee, costOneMinuteCall);
	}

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
