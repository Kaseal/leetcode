package medium.lists;

import common.helper_classes.ListNode;

//2. Add Two Numbers (Medium)
public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		while (l1 != null) {
			sb1.insert(0, l1.val);
			l1 = l1.next;
		}

		while (l2 != null) {
			sb2.insert(0, l2.val);
			l2 = l2.next;
		}

		StringBuilder sbr = new StringBuilder(addStrings(sb1.toString(), sb2.toString()));

		String str = sbr.reverse().toString();

		ListNode result = null;
		ListNode head = null;
		for (int i = 0; i < str.length(); i++) {
			int currentNumber = Character.getNumericValue(str.charAt(i));
			if (result == null) {
				result = new ListNode(currentNumber);
				head = result;
			} else {
				result.next = new ListNode(currentNumber);
				result = result.next;
			}
		}

		return head;
	}

	private String addStrings(String num1, String num2) {
		if (num1.length() > num2.length()) {
			num2 = fillWithZero(num2, num1.length() - num2.length());
		} else if (num2.length() > num1.length()) {
			num1 = fillWithZero(num1, num2.length() - num1.length());
		}

		StringBuilder res = new StringBuilder();
		int reminder = 0;
		for (int i = num1.length() - 1; i >= 0; i--) {
			char c1 = num1.charAt(i);
			char c2 = num2.charAt(i);

			int numericValue1 = Character.getNumericValue(c1);
			int numericValue2 = Character.getNumericValue(c2);
			int sum = numericValue1 + numericValue2;
			if (reminder == 1) {
				sum++;
				reminder = 0;
			}

			if (sum > 9) {
				reminder = 1;
			}

			res.insert(0, reminder == 1 ? String.valueOf(sum).substring(1) : sum);
		}

		if (reminder == 1) {
			res.insert(0, "1");
		}

		return res.toString();
	}

	private String fillWithZero(String str, int count) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			sb.append("0");
		}
		return sb.append(str).toString();
	}

}
