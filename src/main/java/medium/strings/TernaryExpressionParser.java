package medium.strings;

//439. Ternary Expression Parser (Medium)
public class TernaryExpressionParser {

	public String parseTernary(String expression) {
		String[][] split = split(expression);
		String result = getResult(split);

		while (result.contains("?")) {
			split = split(result);
			result = getResult(split);
		}

		return result;
	}

	private String getResult(String[][] split) {
		String expression = split[0][1];
		int position = isCondition(expression) ? findPosition(expression) : expression.indexOf(":");
		if (isTrue(split[0][0])) {
			return expression.substring(0, position);
		} else {
			return expression.substring(position + 1);
		}
	}

	private int findPosition(String expression) {
		int q = 1;
		int c = 0;
		for (int i = 0; i < expression.length(); i++) {
			if (c == q) {
				return --i;
			}
			if (expression.charAt(i) == '?') {
				q++;
			} else if (expression.charAt(i) == ':') {
				c++;
			}
		}
		return 0;
	}

	private boolean isCondition(String expression) {
		String substring = expression.substring(0, 2);
		return substring.equals("T?") || substring.equals("F?");
	}

	private boolean isTrue(String expression) {
		return expression.equals("T");
	}

	private String[][] split(String expression) {
		int position = expression.indexOf('?');
		String[][] result = new String[1][2];
		result[0][0] = expression.substring(0, position);
		result[0][1] = expression.substring(position + 1);
		return result;
	}

}
