package easy;

//13. Roman to Integer (Easy)
public class RomanToInteger {

	public int romanToInt(String s) {
		int result = 0;

		int[] ints = {1, 2, 3, 5, 4, 6, 7, 8, 10, 9, 50, 40, 100, 90, 500, 400, 1000, 900};
		String[] romans = {"I", "II", "III", "V", "IV", "VI", "VII", "VIII", "X", "IX",
				"L", "XL", "C", "XC", "D", "CD", "M", "CM"};

		while (s.length() > 0) {
			for (int i = ints.length - 1; i >= 0; i--) {
				if (s.startsWith(romans[i])) {
					result += ints[i];
					s = s.substring(romans[i].length());
					break;
				}
			}
		}

		return result;
	}

}
