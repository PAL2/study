package Homework4;

public class Task5 {

	public static boolean isAllCharUnique(String input) {
		return isAllCharUnique(input, false);
	}

	public static boolean isAllCharUnique(String input, boolean isCaseSense) {
		int length = input.length();
		if (length > 256) {
			return false;
		}
		if (isCaseSense) {
			input = input.toLowerCase();
		}
		for (int i = 0; i < length; i++) {
			Character symbol = input.charAt(i);
			for (int j = i + 1; j < length; j++) {
				if (symbol == input.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
}