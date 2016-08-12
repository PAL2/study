package BusinessLunch;

/** The creation of standard business lunches and lunches with extra dishes */

public class BuilderExample {

	public static void main(String[] args) {

		Director director = new Director();

		System.out.println("Стандартный комплексный обед:");
		BusinessLunchBuilder standardBusinessLunch = new StandardBusinessLunch();
		director.setBusinessLunchBuilder(standardBusinessLunch);
		director.constructBusinessLunch();

		BusinessLunch bl = director.getBusinessLunch();

		System.out.println("\nНестандартные комплексные обеды:");
		BusinessLunchBuilder businessLunchCutlet = new BusinessLunchCutlet();
		director.setBusinessLunchBuilder(businessLunchCutlet);
		director.constructBusinessLunch();

		System.out.println();
		BusinessLunchBuilder businessLunchCutletSalad = new BusinessLunchCutletSalad();
		director.setBusinessLunchBuilder(businessLunchCutletSalad);
		director.constructBusinessLunch();

		System.out.println();
		BusinessLunchBuilder businessLunchTea = new BusinessLunchTea();
		director.setBusinessLunchBuilder(businessLunchTea);
		director.constructBusinessLunch();
	}

}
