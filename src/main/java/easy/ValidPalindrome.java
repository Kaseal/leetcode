package easy;

//125. Valid Palindrome (Easy)
public class ValidPalindrome {

	public boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (isAlfaNumeric(c)) {
				sb.append(c);
			}
		}

		String res = sb.toString().toLowerCase();
		String revRes = sb.reverse().toString().toLowerCase();

		return res.equals(revRes);
	}

	private boolean isAlfaNumeric(char c) {
		return c >= 48 && c <= 57 || c >= 65 && c <= 90 || c >= 97 && c <= 122;
	}

}
