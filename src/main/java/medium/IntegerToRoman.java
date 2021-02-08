package medium;

//12. Integer to Roman (Medium)
public class IntegerToRoman {

	public String intToRoman(int num) {
		if (num < 1 || num > 3999) {
			throw new NumberFormatException();
		}

		StringBuilder romanString = new StringBuilder();
		int numberSize, zeroCountNumber, firstDigit, addNumber;

		while (num != 0) {
			numberSize = getNumberSize(num);
			zeroCountNumber = getZeroCountNumber(numberSize);
			firstDigit = num / zeroCountNumber;
			addNumber = firstDigit * zeroCountNumber;
			num = num % zeroCountNumber;

			romanString.append(getRomanDigit(addNumber));
		}

		return romanString.toString();
	}

	private int getZeroCountNumber(int num) {
		int result = 1;
		for (int i = 0; i < num; i++) {
			result *= 10;
		}
		return result;
	}

	private int getNumberSize(int num) {
		int divider = 10;
		int k = 0;
		while (num % divider != num) {
			divider *= 10;
			k++;
		}
		return k;
	}

	private String getRomanDigit(int num) {
		int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
		String[] romans = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
				"XL", "L", "XC", "C", "CD", "D", "CM", "M"};
		StringBuilder result = new StringBuilder();

		while (num != 0) {
			for (int i = ints.length - 1; i >= 0; i--) {
				if (num < ints[i]) {
					continue;
				}
				if (num == ints[i]) {
					result.append(romans[i]);
					num = 0;
					break;
				}
				if (num > ints[i]) {
					num = num - ints[i];
					result.append(romans[i]);
					break;
				}
			}
		}

		return result.toString();
	}

}
