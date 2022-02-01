package easy.bits;

//231. Power of Two (Easy)
public class PowerOfTwo {

	public boolean isPowerOfTwo(int n) {
		long x = n;

		return x != 0 && (x & ~x + 1) == x;
	}

}
