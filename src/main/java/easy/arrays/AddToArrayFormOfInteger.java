package easy.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//989. Add to Array-Form of Integer (Easy)
public class AddToArrayFormOfInteger {

	public List<Integer> addToArrayForm(int[] A, int K) {
		String num1 = Arrays.toString(A).replaceAll("\\[|\\]|,|\\s", "");
		String num2 = String.valueOf(K);

		String sum = addStrings(num1, num2);

		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < sum.length(); i++) {
			res.add(Character.getNumericValue(sum.charAt(i)));
		}

		return res;
	}

	private String addStrings(String num1, String num2) {
		if (num1.length() > num2.length()) {
			num2 = fillWithZero(num2, num1.length() - num2.length());
		} else if (num2.length() > num1.length()) {
			num1 = fillWithZero(num1, num2.length() - num1.length());
		}

		StringBuilder res = new StringBuilder();
		int reminder = 0;
		for (int i = num1.length() - 1; i >= 0; i--) {
			char c1 = num1.charAt(i);
			char c2 = num2.charAt(i);

			int numericValue1 = Character.getNumericValue(c1);
			int numericValue2 = Character.getNumericValue(c2);
			int sum = numericValue1 + numericValue2;
			if (reminder == 1) {
				sum++;
				reminder = 0;
			}

			if (sum > 9) {
				reminder = 1;
			}

			res.insert(0, reminder == 1 ? String.valueOf(sum).substring(1) : sum);
		}

		if (reminder == 1) {
			res.insert(0, "1");
		}

		return res.toString();
	}

	private String fillWithZero(String str, int count) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			sb.append("0");
		}
		return sb.append(str).toString();
	}

}
