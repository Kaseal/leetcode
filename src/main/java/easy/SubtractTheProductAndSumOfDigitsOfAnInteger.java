package easy;

//1281. Subtract the Product and Sum of Digits of an Integer (Easy)
public class SubtractTheProductAndSumOfDigitsOfAnInteger {

	public int subtractProductAndSum(int n) {
		int prod = 1;
		int sum = 0;

		while (n > 0) {
			int curr = n % 10;
			prod *= curr;
			sum += curr;
			n /= 10;
		}

		return prod - sum;
	}

}
