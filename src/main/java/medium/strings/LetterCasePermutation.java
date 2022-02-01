package medium.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//784. Letter Case Permutation (Medium)
public class LetterCasePermutation {

	public List<String> letterCasePermutation(String s) {
		List<StringBuilder> res = new ArrayList<>();
		res.add(new StringBuilder());

		char[] chars = s.toCharArray();

		for (Character c : chars) {
			if (Character.isLetter(c)) {
				int size = res.size();
				for (int i = 0; i < size; i++) {
					res.add(new StringBuilder(res.get(i)));
					res.get(i).append(Character.toLowerCase(c));
					res.get(res.size() - 1).append(Character.toUpperCase(c));
				}

			} else {
				for (StringBuilder re : res) {
					re.append(c);
				}
			}
		}

		return res.stream().map(StringBuilder::toString).collect(Collectors.toList());
	}

}
