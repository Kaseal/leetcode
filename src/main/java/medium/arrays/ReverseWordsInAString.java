package medium.arrays;

//151. Reverse Words in a String (Medium)
public class ReverseWordsInAString {

	public String reverseWords(String s) {
		String[] str = s.split("\\s+");

		StringBuilder result = new StringBuilder();
		for (int i = str.length - 1; i >= 0; i--) {
			result.append(str[i]).append(" ");
		}

		return result.toString().trim();
	}

}
