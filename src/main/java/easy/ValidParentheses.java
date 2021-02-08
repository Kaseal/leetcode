package easy;

import java.util.Stack;

//20. Valid Parentheses (Easy)
public class ValidParentheses {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			}
			if (c == ')' && !stack.isEmpty() && stack.lastElement() == '(') {
				stack.pop();
			} else if (c == ']' && !stack.isEmpty() && stack.lastElement() == '[') {
				stack.pop();
			} else if (c == '}' && !stack.isEmpty() && stack.lastElement() == '{') {
				stack.pop();
			} else if (c == ')' || c == ']' || c == '}') {
				return false;
			}
		}

		return stack.isEmpty();
	}

}
