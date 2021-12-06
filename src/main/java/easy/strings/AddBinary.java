package easy.strings;

//67. Add Binary (Easy)
public class AddBinary {

	public String addBinary(String a, String b) {
		int i = a.length() - 1;
		int j = b.length() - 1;
		int sum = 0;

		StringBuilder result = new StringBuilder();

		while (i >= 0 || j >= 0) {
			if (i > -1) {
				sum += a.charAt(i) - 48;
			}
			if (j > -1) {
				sum += b.charAt(j) - 48;
			}

			result.insert(0, sum % 2);

			sum /= 2;

			i--;
			j--;
		}

		return sum == 0 ? result.toString() : result.insert(0, "1").toString();
	}

}
