package medium.strings;

import java.util.LinkedList;

//186. Reverse Words in a String II (Medium)
public class ReverseWordsInAStringII {

	public void reverseWords(char[] s) {
		LinkedList<String> list = new LinkedList<>();

		StringBuilder buf = new StringBuilder();
		for (int i = 0; i < s.length; i++) {
			if (s[i] != ' ') {
				buf.append(s[i]);
			} else {
				list.addFirst(buf.toString());
				buf = new StringBuilder();
			}
			if (i == s.length - 1) {
				list.addFirst(buf.toString());
			}
		}

		int cursor = 0;
		for (String word : list) {
			for (int i = 0; i < word.length(); i++) {
				s[cursor++] = word.charAt(i);
			}
			if (cursor < s.length - 1) {
				s[cursor++] = ' ';
			}
		}
	}


}
