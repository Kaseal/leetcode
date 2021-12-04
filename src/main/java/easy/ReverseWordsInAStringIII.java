package easy;

//557. Reverse Words in a String III (Easy)
public class ReverseWordsInAStringIII {

	public String reverseWords(String s) {
		String[] words = s.split(" ");

		StringBuilder res = new StringBuilder();
		for (String word : words) {
			StringBuilder sb = new StringBuilder(word);
			res.append(sb.reverse()).append(" ");
		}

		return res.substring(0, res.length() - 1);
	}

}
