package BusinessLunch;

/** "Director" */
public class Director {
	private BusinessLunchBuilder businessLunchBuilder;

	public BusinessLunch getBusinessLunch() {
		return businessLunchBuilder.getBusinessLunch();
	}

	public void setBusinessLunchBuilder(BusinessLunchBuilder businessLunchBuilder) {
		this.businessLunchBuilder = businessLunchBuilder;
	}

	public BusinessLunch constructBusinessLunch() {
		businessLunchBuilder.createNewBusinessLunch();
		businessLunchBuilder.buildFirst();
		businessLunchBuilder.buildSecond();
		businessLunchBuilder.buildCutlet();
		businessLunchBuilder.buildSalad();
		businessLunchBuilder.buildDesert();
		businessLunchBuilder.buildTea();
		return businessLunchBuilder.getBusinessLunch();
	}

}
