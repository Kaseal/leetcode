package easy;

//14. Longest Common Prefix (Easy)
public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		if (strs.length > 200) {
			return "";
		}

		if (strs.length == 1) {
			return strs[0];
		}

		if (strs.length == 0) {
			return "";
		}

		int maxLength = 200;

		for (String str : strs) {
			if (str.length() > 200) {
				return "";
			}
			if (str.length() < maxLength) {
				maxLength = str.length();
			}
		}

		String pref = "";
		boolean shouldStop = false;

		for (int i = 1; i <= maxLength; i++) {
			for (int j = 1; j < strs.length; j++) {
				if (!strs[j - 1].substring(0, i).equals(strs[j].substring(0, i))) {
					shouldStop = true;
					break;
				}
				pref = strs[j].substring(0, i);
			}
			if (shouldStop) {
				return pref.substring(0, i - 1);
			}
		}

		return pref;
	}

}
