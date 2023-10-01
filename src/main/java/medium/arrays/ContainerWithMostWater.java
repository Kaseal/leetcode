package medium.arrays;

//11. Container With Most Water (Medium)
public class ContainerWithMostWater {

	public int maxArea(int[] height) {
		int i = 0;
		int j = height.length - 1;
		int s = 0;

		while (i < height.length - 1 && j > 0) {
			int currentS = Math.min(height[i], height[j]) * (j - i);

			if (currentS > s) {
				s = currentS;
			}

			if (height[i] < height[j]) {
				i++;
			} else {
				j--;
			}
		}

		return s;
	}

}
