package easy;

//392. Is Subsequence (Easy)
public class IsSubsequence {

	public boolean isSubsequence(String s, String t) {
		int i = 0;
		int j = 0;
		int counter = s.length();

		while (i < s.length() && j < t.length()) {
			char sc = s.charAt(i);
			char tc = t.charAt(j);

			if (sc == tc) {
				counter--;
				i++;
				j++;
			} else {
				j++;
			}
		}

		return counter == 0;
	}

}
