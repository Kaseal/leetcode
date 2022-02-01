package easy.bits;

//190. Reverse Bits (Easy)
public class ReverseBits {

	public int reverseBits(int n) {
		int[] bits = new int[32];
		int mask = 1;

		for (int i = 0; i < 32; i++) {
			if ((n & mask) != 0) {
				bits[i] = 1;
			}
			mask <<= 1;
		}

		int res = 0;
		for (int i = 31, j = 0; i >= 0; i--, j++) {
			int bit = bits[i];
			if (bit == 1) {
				res |= (1 << j);
			}
		}

		return res;
	}

}
