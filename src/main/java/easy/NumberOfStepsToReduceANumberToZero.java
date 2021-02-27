package easy;

//1342. Number of Steps to Reduce a Number to Zero (Easy)
public class NumberOfStepsToReduceANumberToZero {

	public int numberOfSteps(int num) {
		int count = 0;
		while (num != 0) {
			if (num % 2 == 0) {
				num /= 2;
				count++;
			} else {
				num -= 1;
				count++;
			}
		}

		return count;
	}

}
