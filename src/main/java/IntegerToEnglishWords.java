import java.util.HashMap;

//#273. Integer to English Words (Hard)
public class IntegerToEnglishWords {
	public static void main(String[] args) {
		System.out.println(new IntegerToEnglishWords().numberToWords(1_000_000_000));
	}

	public String numberToWords(int num) {
		String result = "";

		String stringDigit = String.valueOf(num);
		int length = stringDigit.length();

		if (length < 4) {
			return get3DigitString(num);
		}

		if (length < 7) {
			String thousands = stringDigit.substring(0, stringDigit.length() - 3);
			String hundreds = stringDigit.substring(stringDigit.length() - 3);

			result += get3DigitString(Integer.parseInt(thousands)) + " Thousand";
			if (Integer.parseInt(hundreds) > 0) {
				result += " " + get3DigitString(Integer.parseInt(hundreds));
			}

			return result;
		}

		if (length < 10) {
			String millions = stringDigit.substring(0, length - 6);
			String thousands = stringDigit.substring(millions.length(), length - 3);
			String hundreds = stringDigit.substring(millions.length() + thousands.length());

			result += get3DigitString(Integer.parseInt(millions)) + " Million";
			if (Integer.parseInt(thousands) > 0) {
				result += " " + get3DigitString(Integer.parseInt(thousands)) + " Thousand";
			}
			if (Integer.parseInt(hundreds) > 0) {
				result += " " + get3DigitString(Integer.parseInt(hundreds));
			}

			return result;
		}
		if (length == 10) {
			String millions = stringDigit.substring(1, length - 6);
			String thousands = stringDigit.substring(millions.length() + 1, length - 3);
			String hundreds = stringDigit.substring(millions.length() + thousands.length() + 1);
			String billions = stringDigit.substring(0, 1);

			result += get3DigitString(Integer.parseInt(billions)) + " Billion";
			if (Integer.parseInt(millions) > 0) {
				result += " " + get3DigitString(Integer.parseInt(millions)) + " Million";
			}
			if (Integer.parseInt(thousands) > 0) {
				result += " " + get3DigitString(Integer.parseInt(thousands)) + " Thousand";
			}
			if (Integer.parseInt(hundreds) > 0) {
				result += " " + get3DigitString(Integer.parseInt(hundreds));
			}
		}

		return result;
	}

	private String get3DigitString(int num) {
		String result = "";

		HashMap<Integer, String> map = new HashMap<>();
		map.put(0, "Zero");
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map.put(9, "Nine");
		map.put(10, "Ten");
		map.put(11, "Eleven");
		map.put(12, "Twelve");
		map.put(13, "Thirteen");
		map.put(14, "Fourteen");
		map.put(15, "Fifteen");
		map.put(16, "Sixteen");
		map.put(17, "Seventeen");
		map.put(18, "Eighteen");
		map.put(19, "Nineteen");
		map.put(20, "Twenty");
		map.put(30, "Thirty");
		map.put(40, "Forty");
		map.put(50, "Fifty");
		map.put(60, "Sixty");
		map.put(70, "Seventy");
		map.put(80, "Eighty");
		map.put(90, "Ninety");

		if (map.containsKey(num)) {
			return map.get(num);
		}

		String numAsString = String.valueOf(num);
		if (numAsString.length() == 3) {
			result += map.get(Integer.parseInt(numAsString.substring(0, 1))) + " Hundred";

			String numAsString1 = numAsString.substring(1);

			if (numAsString1.charAt(0) != '0') {
				if (map.containsKey(Integer.parseInt(numAsString1))) {
					result += " " + map.get(Integer.parseInt((numAsString1)));
					return result;
				} else {
					result += " " + map.get(Integer.parseInt(numAsString1.substring(0, 1)) * 10);
				}
			}

			String numAsString3 = numAsString.substring(2);
			if (numAsString3.charAt(0) != '0') {
				result += " " + map.get(Integer.parseInt(numAsString3));
			}
		} else if (numAsString.length() == 2) {
			if (numAsString.charAt(0) != '0') {
				if (map.containsKey(Integer.parseInt(numAsString))) {
					result += map.get(Integer.parseInt((numAsString)));
					return result;
				} else {
					result += map.get(Integer.parseInt(numAsString.substring(0, 1)) * 10);
				}
			}

			String numAsString2 = numAsString.substring(1);
			if (numAsString2.charAt(0) != '0') {
				result += " " + map.get(Integer.parseInt(numAsString2));
			}
		}

		return result;
	}

}
