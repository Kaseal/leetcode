package easy.strings;

//58. Length of Last Word (Easy)
public class LengthOfLastWord {

	public int lengthOfLastWord(String s) {
		int len = 0;
		s = s.trim();

		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				len++;
			} else {
				break;
			}
		}

		return len;
	}

}
