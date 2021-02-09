package easy;

//28. Implement strStr() (Easy)
public class ImplementStrStr {

	public int strStr(String haystack, String needle) {
		if (haystack.equals("") && needle.equals("")) {
			return 0;
		}

		if (needle.length() > haystack.length()) {
			return -1;
		}

		int cursor = 0;

		while (cursor + needle.length() <= haystack.length()) {
			boolean flag = true;

			for (int i = 0; i < needle.length(); i++) {
				if (haystack.charAt(cursor + i) != needle.charAt(i)) {
					flag = false;
					break;
				}
			}

			if (flag) {
				return cursor;
			}

			cursor++;
		}

		return -1;
	}

}
