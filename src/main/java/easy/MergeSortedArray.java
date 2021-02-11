package easy;

//88. Merge Sorted Array (Easy)
public class MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		int c = m + n - 1;

		while (i >= 0 || j >= 0) {
			if (c < 0) {
				break;
			}
			if (i < 0) {
				nums1[c] = nums2[j];
				c--;
				j--;
				continue;
			}
			if (j < 0) {
				nums1[c] = nums1[i];
				c--;
				i--;
				continue;
			}

			if (nums1[i] >= nums2[j]) {
				nums1[c] = nums1[i];
				c--;
				i--;
			} else {
				nums1[c] = nums2[j];
				j--;
				c--;
			}
		}
	}

}
