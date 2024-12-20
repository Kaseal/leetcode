package easy.bits;

//338. Counting Bits (Easy)
public class CountingBits {

	public int[] countBits(int n) {
		int[] result = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				result[i]++;
			}

			int next = i << 1;
			int nextP1 = next + 1;

			if (nextP1 <= n) {
				result[nextP1] += result[i];
			}

			if (next <= n) {
				result[next] += result[i];
			}
		}

		return result;
	}

}
