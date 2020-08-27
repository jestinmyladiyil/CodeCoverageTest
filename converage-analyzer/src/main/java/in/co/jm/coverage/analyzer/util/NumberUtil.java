package in.co.jm.coverage.analyzer.util;

public class NumberUtil {

	public static Long convertStringToLong(String input) {
		long result = 0L;
		try {
			result = Long.parseLong(input);
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
		}
		return result;
	}
}
