package easy.arrays;

import java.util.Stack;

//345. Reverse Vowels of a String (Easy)
public class ReverseVowelsOfAString {

	public String reverseVowels(String s) {
		String vowels = "aeiouAEIOU";

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (vowels.contains("" + c)) {
				stack.push(c);
			}
		}

		StringBuilder result = new StringBuilder();
		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			if (vowels.contains("" + c)) {
				result.append(stack.pop());
			} else {
				result.append(c);
			}
		}

		return result.toString();
	}

}
