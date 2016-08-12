package BusinessLunch;
/** "ConcreteBuilder"
 * Create the business lunch with tea and a bun */
public class BusinessLunchTea extends BusinessLunchBuilder {

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
		bl.setCutlet(null);
	}

	@Override
	public void buildDesert() {
		bl.setDesert(null);
	}

	@Override
	public void buildSalad() {
		bl.setSalad(null);
	}

	@Override
	public void buildTea() {
		bl.setTea("tea");
		System.out.println("Tea and a bun");
	}

}
