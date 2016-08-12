package BusinessLunch;
/** "ConcreteBuilder"
 * Create the business lunch with the cutlet*/
public class BusinessLunchCutlet extends BusinessLunchBuilder {

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
		bl.setSalad(null);
	}

	@Override
	public void buildTea() {
		bl.setTea(null);
	}

}