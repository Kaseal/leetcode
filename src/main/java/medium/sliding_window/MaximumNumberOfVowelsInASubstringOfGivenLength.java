package medium.sliding_window;

//1456. Maximum Number of Vowels in a Substring of Given Length (Medium)
public class MaximumNumberOfVowelsInASubstringOfGivenLength {

	public int maxVowels(String s, int k) {

		class Vowel {
			final char[] vowels = {'a', 'e', 'i', 'o', 'u'};

			public boolean isVowel(char c) {
				return c == vowels[0] || c == vowels[1] || c == vowels[2]
						|| c == vowels[3] || c == vowels[4];
			}

			public int getCountOfVowels(String s, int maxNeeded) {
				int count = 0;
				for (int i = 0; i < s.length(); i++) {
					if (isVowel(s.charAt(i))) {
						count++;
						if (count == maxNeeded) {
							return count;
						}
					}
				}
				return count;
			}
		}

		String substring = s.substring(0, k);

		Vowel vowel = new Vowel();
		int countOfVowels = vowel.getCountOfVowels(substring, k);
		if (countOfVowels == k) {
			return k;
		}

		int i = 1;
		int currentCountOfVowels = countOfVowels;
		while (i + k - 1 < s.length()) {
			if (vowel.isVowel(s.charAt(i + k - 1))) {
				currentCountOfVowels++;
			}
			if (vowel.isVowel(s.charAt(i - 1))) {
				currentCountOfVowels--;
			}

			countOfVowels = Math.max(countOfVowels, currentCountOfVowels);

			i++;
			if (countOfVowels == k) {
				return k;
			}
		}

		return countOfVowels;
	}

}
