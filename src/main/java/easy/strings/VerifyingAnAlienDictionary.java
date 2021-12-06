package easy.strings;

//953. Verifying an Alien Dictionary (Easy)
public class VerifyingAnAlienDictionary {

	public boolean isAlienSorted(String[] words, String order) {
		if (words.length == 1) {
			return true;
		}

		String word1 = words[0];

		boolean result = true;

		for (int i = 1; i < words.length; i++) {
			String word2 = words[i];

			result = isFirstLess(word1, word2, order);
			if (!result) {
				return false;
			}
			word1 = word2;
		}

		return result;
	}

	private boolean isFirstLess(String word1, String word2, String order) {
		for (int j = 0; j < Math.min(word1.length(), word2.length()); j++) {
			if (word1.charAt(j) == word2.charAt(j)) {
				continue;
			}
			return order.indexOf(word1.charAt(j)) <= order.indexOf(word2.charAt(j));
		}

		return word1.length() <= word2.length();
	}

}
