package easy;

//771. Jewels and Stones (Easy)
public class JewelsAndStones {

	public int numJewelsInStones(String jewels, String stones) {
		int count = 0;
		for (int i = 0; i < stones.length(); i++) {
			char c = stones.charAt(i);

			if (jewels.indexOf(c) > -1) {
				count++;
			}
		}

		return count;
	}

}
