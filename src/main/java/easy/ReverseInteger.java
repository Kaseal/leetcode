package easy;

//7. Reverse Integer (Easy)
public class ReverseInteger {

	public int reverse(int x) {
		int sign = x < 0 ? -1 : 1;
		x = Math.abs(x);
		StringBuilder res = new StringBuilder();

		while (x > 0) {
			res.append(x % 10);
			x /= 10;
		}

		try {
			return Integer.parseInt(res.toString()) * sign;
		} catch (Exception ex) {
			return 0;
		}
	}

}
