package BusinessLunch;

/** "ConcreteBuilder"
 * Create the business lunch with the cutlet and salad */
public class BusinessLunchCutletSalad extends BusinessLunchBuilder {

	@Override
	public void buildFirst() {
		bl.setFirst("cream-soup");
		System.out.println("Cream-soup");
	}

	@Override
	public void buildSecond() {
		bl.setSecond("pasta");
		System.out.println("Pasta");
	}

	@Override
	public void buildCutlet() {
		bl.setCutlet("cutlet");
		System.out.println("Cutlet");
	}

	@Override
	public void buildDesert() {
		bl.setDesert("compote");
		System.out.println("Compote");
	}

	@Override
	public void buildSalad() {
		bl.setSalad("salad");
		System.out.println("Salad");
	}

	@Override
	public void buildTea() {
		bl.setTea(null);
	}

}
