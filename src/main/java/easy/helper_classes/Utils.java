package easy.helper_classes;

public class Utils {

	public static boolean compareFirstExpectedNumsLengthDigits(int[] expectedNums, int[] nums) {
		for (int i = 0; i < expectedNums.length; i++) {
			if (expectedNums[i] != nums[i]) {
				return false;
			}
		}
		return true;
	}

}
