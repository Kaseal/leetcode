package medium;

import java.util.LinkedList;
import java.util.List;

//77. Combinations (Medium)
public class Combinations {

	private List<List<Integer>> output = new LinkedList();
	private int n;
	private int k;

	public void backtrack(int first, LinkedList<Integer> curr) {
		if (curr.size() == k) {
			output.add(new LinkedList(curr));
		}

		for (int i = first; i < n + 1; ++i) {
			curr.add(i);
			backtrack(i + 1, curr);
			curr.removeLast();
		}
	}

	public List<List<Integer>> combine(int n, int k) {
		this.n = n;
		this.k = k;
		backtrack(1, new LinkedList<Integer>());
		return output;
	}

}
