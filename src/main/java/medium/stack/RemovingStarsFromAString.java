package medium.stack;

import java.util.Stack;
import java.util.stream.Collectors;

//2390. Removing Stars From a String (Medium)
public class RemovingStarsFromAString {

	public String removeStars(String s) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '*') {
				stack.pop();
			} else {
				stack.push(c);
			}
		}

		return stack.stream().map(String::valueOf).collect(Collectors.joining());
	}

}
