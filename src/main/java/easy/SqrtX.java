package easy;

//69. Sqrt(x) (Easy)
public class SqrtX {

	public int mySqrt(int x) {
		long l = 0;
		long r = x;
		long mid = 0;

		while (l <= r) {
			mid = l + (r - l) / 2;
			if (mid * mid == x) {
				return (int) mid;
			}
			if (mid * mid > x) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}

		return (int) l - 1;
	}

	public int _mySqrt(int x) {
		long i = x / 2;

		while (i * i > x) {
			i /= 2;
		}

		while (i * i < x) {
			i++;
		}

		return (int) (i * i > x ? --i : i);
	}

}
