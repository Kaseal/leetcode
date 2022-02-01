package easy.bits;

//136. Single Number (Easy)
public class SingleNumber {

	public int singleNumber(int[] nums) {
		int res = 0;
		for (int num : nums) {
			res ^= num;
		}

		return res;
	}

}
