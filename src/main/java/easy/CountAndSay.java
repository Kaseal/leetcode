package easy;

//38. Count and Say (Easy)
public class CountAndSay {

	public String countAndSay(int n) {
		if (n == 1) {
			return "1";
		}

		String result = say("1");

		for (int i = 1; i < n - 1; i++) {
			result = say(result);
		}

		return result;
	}

	public String say(String str) {
		char c = str.charAt(0);
		int count = 1;
		StringBuilder res = new StringBuilder();

		for (int i = 1; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				count++;
			} else {
				res.append(count);
				res.append(c);
				c = str.charAt(i);
				count = 1;
			}
		}

		res.append(count);
		res.append(c);

		return res.toString();
	}

}
