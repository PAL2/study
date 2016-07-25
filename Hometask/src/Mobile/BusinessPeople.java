package Mobile;

public class BusinessPeople extends Rates implements Roamingable, Internetable {

	public BusinessPeople(String name, int quantitySubscribers, int subscriptionFee, int costOneMinuteCall,
			int costOneMB) {
		super(name, quantitySubscribers, subscriptionFee, costOneMinuteCall, costOneMB);
	}

	// public BusinessPeople(String name, int quantitySubscribers, int
	// subscriptionFee, int costOneMinuteCall,
	// int costOneMB) {
	// super.name = name;
	// super.quantitySubscribers = quantitySubscribers;
	// super.subscriptionFee = subscriptionFee;
	// super.costOneMinuteCall = costOneMinuteCall;
	// super.costOneMB = costOneMB;
	// }

	@Override
	public void roaming() {
		System.out.println("Наличие роуминга");
	}

	@Override
	public void internet() {
		System.out.println("Наличие интернета");
	}

	@Override
	public void addSubsciber() {
		// quantitySubscribers += 1;
	}

	@Override
	public void delSubscriber() {
		// quantitySubscribers -= 1;
	}

}
