package common;

public class Utils {

	public static int getNumberLength(long number) {
		return (int) Math.ceil(Math.log10((double) Math.abs(number) + 0.5D));
	}

	public static int getFibonacciNumber(int n) {
		if (n <= 2) {
			return n;
		}
		return getFibonacciNumber(n - 2) + getFibonacciNumber(n - 1);
	}

}
