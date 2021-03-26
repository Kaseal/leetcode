package easy;

//680. Valid Palindrome II (Easy)
public class ValidPalindromeII {

	public boolean validPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return isPalindrome(new StringBuilder(s).deleteCharAt(i).toString()) ||
						isPalindrome(new StringBuilder(s).deleteCharAt(j).toString());
			}
			i++;
			j--;
		}

		return true;
	}

	private boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.toString().equals(sb.reverse().toString());
	}

}
