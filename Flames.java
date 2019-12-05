
import java.util.Scanner;

public class Flames {

	public static int find_length(String obj1, String obj2) {

		String checker = "";
		String non_checker = "";
		//System.out.println(obj1 + " " + obj2);

		if (obj1.length() > obj2.length()) {
			checker = obj2;
			non_checker = obj1;
		} else {
			checker = obj1;
			non_checker = obj2;
		}

		for (int i = 0; i < checker.length(); i++) {
			String temp = new String(new char[] { checker.charAt(i) });
			if (non_checker.contains(temp)) {
				checker = checker.replaceFirst(temp, "");
				non_checker = non_checker.replaceFirst(temp, "");
				i = i - 1;
			}
		}

		//System.out.println(checker + " " + non_checker);

		return checker.length() + non_checker.length();
	}

	public static String answer(int n) {

		int count = 1;
		String str = "flames";
		//System.out.println(n);

		for (int i = 0; str.length() != 1; i++) {
			if (i == str.length()) {
				i = 0;
			}
			if (count == n) {
				str = str.replace(new String(new char[] { str.charAt(i) }), "");
				i = i - 1;
				//System.out.println("String value = " + str);
				//System.out.println("String length= " + str.length());
			}
			count++;
			//System.out.println("increment value " + i);
			//System.out.println("count value " + count);

			if (count > n) {
				count = 1;
			}
		}
		//System.out.println(str);

		return str;
	}

	public static String ret_flames(String var) {
		String ret_value = "";
		switch (var) {
		case "f":
			ret_value = "you each other are good Friends";
			break;
		case "l":
			ret_value = "you each other are lovely lovers";
			break;
		case "a":
			ret_value = "you each other are affectionate partners";
			break;
		case "m":
			ret_value = "you're going to marry each other";
			break;
		case "e":
			ret_value = "you both are enemies";
			break;
		case "s":
			ret_value = "you guys are lovely sibilings";
			break;
		}

		return ret_value;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String obj1 = in.nextLine().toLowerCase().replace(" ", "").trim();
		System.out.println(obj1);
		String obj2 = in.nextLine().toLowerCase().replace(" ", "").trim();
		System.out.println(obj2);
		System.out.println(ret_flames(answer(find_length(obj1, obj2))));

	}

}
