package Mobile;

public class BusinessPeople extends Rate implements Roamingable, Internetable {

	private static final long serialVersionUID = 1L;

	public BusinessPeople(Name name, int quantitySubscribers, int subscriptionFee, int costOneMinuteCall) {
		super(name, quantitySubscribers, subscriptionFee, costOneMinuteCall);
	}

	@Override
	public void internet() {
		System.out.println("Наличие интернета");
	}

	@Override
	public void roaming() {
		System.out.println("Наличие роуминга");
	}

	@Override
	public void addSubsciber() {

	}

	@Override
	public void delSubscriber() {

	}

}