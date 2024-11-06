package easy.arrays;

//1732. Find the Highest Altitude (Easy)
public class FindTheHighestAltitude {

	public int largestAltitude(int[] gain) {
		int result = 0;
		int current = 0;

		for (int i = 0; i < gain.length; i++) {
			current += gain[i];
			result = Math.max(result, current);
		}

		return result;
	}

}
