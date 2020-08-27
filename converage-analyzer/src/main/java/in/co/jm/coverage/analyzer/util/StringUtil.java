package in.co.jm.coverage.analyzer.util;

public class StringUtil {

	public static boolean isEmpty(String input) {
		return input == null || "".equals(input.trim());
	}

	public static boolean isNotEmpty(String input) {
		return !isEmpty(input);
	}

}
