package easy;

//66. Plus One (Easy)
public class PlusOne {

	public int[] plusOne(int[] digits) {
		boolean nextDigit = false;

		for (int i = digits.length - 1; i >= 0; i--) {
			if (nextDigit) {
				nextDigit = false;
				if (digits[i] < 9) {
					digits[i]++;
					break;
				}
				if (digits[i] == 9) {
					digits[i] = 0;
					nextDigit = true;
				}
				continue;
			}
			if (digits[i] < 9) {
				digits[i]++;
				break;
			}
			if (digits[i] == 9) {
				digits[i] = 0;
				nextDigit = true;
			}
		}

		if (nextDigit) {
			//9999... case
			int[] extendedDigits = new int[digits.length + 1];
			for (int i = 0; i < extendedDigits.length - 1; i++) {
				if (i == 0) {
					extendedDigits[i] = 1;
				} else {
					extendedDigits[i] = 0;
				}
			}

			return extendedDigits;
		}

		return digits;
	}

	public int[] _plusOne(int[] digits) {
		StringBuilder num = new StringBuilder();

		boolean hasLeadingZeros = true;
		int leadingZerosCount = 0;
		for (int digit : digits) {
			if (digit != 0) {
				hasLeadingZeros = false;
			}
			leadingZerosCount++;
			num.append(digit);
		}

		if (hasLeadingZeros) {
			int[] result = new int[leadingZerosCount];
			for (int i = result.length - 1; i >= 0; i--) {
				if (i == result.length - 1) {
					result[i] = 1;
				} else {
					result[i] = 0;
				}
			}

			return result;
		}

		long resultNum = Long.parseLong(num.toString()) + 1;

		int[] result = new int[String.valueOf(resultNum).length()];

		int i = result.length - 1;
		while (resultNum > 0) {
			int digit = (int) (resultNum % 10);
			resultNum /= 10;
			result[i] = digit;
			i--;
		}

		return result;
	}

}
