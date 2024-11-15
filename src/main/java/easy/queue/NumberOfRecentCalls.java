package easy.queue;

import java.util.LinkedList;
import java.util.Queue;

//933. Number of Recent Calls (Easy)
public class NumberOfRecentCalls {

	Queue<Integer> calls;

	public NumberOfRecentCalls() {
		calls = new LinkedList<>();
	}

	public int ping(int t) {
		calls.add(t);

		while (calls.peek() < t - 3000) {
			calls.poll();
		}

		return calls.size();
	}

}
