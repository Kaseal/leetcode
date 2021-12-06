package medium.strings;

//3. Longest Substring Without Repeating Characters (Medium)
public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
		int[] chars = new int[128];

		int left = 0;
		int right = 0;
		int maxLen = 0;

		while (right < s.length()) {
			char c = s.charAt(right);
			chars[c]++;

			while (chars[c] > 1) {
				chars[s.charAt(left)]--;
				left++;
			}

			maxLen = Math.max(maxLen, right - left + 1);

			right++;
		}

		return maxLen;
	}

}
