package easy;

import java.util.List;

//1773. Count Items Matching a Rule (Easy)
public class CountItemsMatchingARule {

	public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int count = 0;
		int index = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;

		for (List<String> list: items) {
			String value = list.get(index);
			if (value.equals(ruleValue)) {
				count++;
			}
		}

		return count;
	}

}
