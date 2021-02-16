package medium;

//1513. Number of Substrings With Only 1s (Medium)
public class NumberOfSubstringsWithOnly1s {

	public int numSub(String s) {
		int count = 0;
		long cur = 0;
		long mod = 1_000_000_007;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '1') {
				cur += 1;
			}
			if (c == '0' || i == s.length() - 1){
				if (cur > 0) {
					count = (int) (count + ((cur + 1) * cur / 2) % mod);
				}
				cur = 0;
			}
		}

		return count;
	}

}
