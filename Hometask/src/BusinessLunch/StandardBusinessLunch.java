package BusinessLunch;

/** "ConcreteBuilder"
 * Create the standard business lunch */
public class StandardBusinessLunch extends BusinessLunchBuilder {

	@Override
	public void buildFirst() {
		bl.setFirst("soup");
		System.out.println("Soup");
	}

	@Override
	public void buildSecond() {
		bl.setSecond("pasta");
		System.out.println("Pasta");
	}

	@Override
	public void buildDesert() {
		bl.setDesert("compote");
		System.out.println("Compote");
	}

	@Override
	public void buildCutlet() {
		bl.setCutlet(null);
	}

	@Override
	public void buildSalad() {
		bl.setSalad(null);
	}

	@Override
	public void buildTea() {
		bl.setTea(null);
	}

}
