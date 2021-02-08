package easy;

//9. Palindrome Number (Easy)
public class PalindromeNumber {

	public boolean isPalindrome(int x) {
		String number = String.valueOf(x);

		StringBuilder sb = new StringBuilder(number);

		return number.equals(sb.reverse().toString());
	}

}
