package BusinessLunch;

/** "Abstract Builder" */

public abstract class BusinessLunchBuilder {

	protected BusinessLunch bl;

	public BusinessLunch getBusinessLunch() {
		return bl;
	}

	public void createNewBusinessLunch() {
		bl = new BusinessLunch();
	}

	public abstract void buildFirst();

	public abstract void buildSecond();

	public abstract void buildCutlet();

	public abstract void buildSalad();

	public abstract void buildDesert();

	public abstract void buildTea();

}
