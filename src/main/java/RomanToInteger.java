//13. Roman to Integer (Easy)
public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println(new RomanToInteger().romanToInt("MMCCCXCIX"));
	}

	public int romanToInt(String s) {
		return getIntegerDigit(s);
	}

	private int getIntegerDigit(String roman) {
		int result = 0;

		int[] ints = {1, 2, 3, 5, 4, 6, 7, 8, 10, 9, 50, 40, 100, 90, 500, 400, 1000, 900};
		String[] romans = {"I", "II", "III", "V", "IV", "VI", "VII", "VIII", "X", "IX",
				"L", "XL", "C", "XC", "D", "CD", "M", "CM"};

		while (roman.length() > 0) {
			for (int i = ints.length - 1; i >= 0; i--) {
				if (roman.startsWith(romans[i])) {
					result += ints[i];
					roman = roman.substring(romans[i].length());
					break;
				}
			}
		}

		return result;
	}

}
