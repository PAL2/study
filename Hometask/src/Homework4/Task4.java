package Homework4;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;
public class Task4 {

	public static void main(String[] args) {
		String s = ("An Independence Day is an annual event commemorating the anniversary of a nation's independence or statehood, usually after ceasing to be a group or part of another nation.");
		//s = s.replaceAll("^[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]&&(\\b\\w{5}\\b)", "");
		//s = s.replaceAll("\\b\\w{5}\\b", "");
		ArrayList<String> str = new ArrayList<String>(Arrays.asList(s.split(" ")));
		//String[] str1 = s.split(" ");
		//System.out.println(s);
		String result = "";
		for (int i = 0; i < str.size(); i++) {
			//System.out.print(str[i] + " ");
			result += str.get(i) + " ";
			System.out.print(result);

		}
	//	editResult.setText("Все коты: " + result);
	}

}

// ^[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]