package medium.arrays;

//443. String Compression (Medium)
public class StringCompression {

	public int compress(char[] chars) {
		if (chars.length == 1) {
			return 1;
		} else if (chars.length == 2) {
			if (chars[0] == chars[1]) {
				chars[1] = '2';
			}
			return 2;
		}

		char prevSymbol = chars[0];
		int counter = 1;
		StringBuilder result = new StringBuilder();
		result.append(prevSymbol);
		for (int i = 1; i < chars.length; i++) {
			if (chars[i] == prevSymbol) {
				counter++;
				if (i == chars.length - 1) {
					result.append(counter);
				}
			} else {
				if (counter > 1) {
					result.append(counter);
				}
				prevSymbol = chars[i];
				result.append(prevSymbol);
				counter = 1;
			}
		}

		for (int i = 0; i < result.length(); i++) {
			chars[i] = result.charAt(i);
		}

		return result.length();
	}

}
