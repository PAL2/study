package Mobile;

import java.util.ResourceBundle;

public enum Name {
	BusinessPlus("businessPlus"), BusinessPro("businessPro"), AllSpeak("allSpeak"), SummerCall("summerCall");

	String value;

	ResourceBundle rb = ResourceBundle.getBundle("resources/LabelsBundle", Runner.currentLocale);

	Name(String value) {
		this.value = rb.getString(value);
	}

	@Override
	public String toString() {
		return value;
	}
}