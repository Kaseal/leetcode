package easy.binary_search;

//278. First Bad Version (Easy)
public class FirstBadVersion {

	public boolean isBadVersion(int version) {
		return false;
	}

	public int firstBadVersion(int n) {
		if (n == 1 && isBadVersion(1)) {
			return 1;
		}

		int left = 1;
		int right = n;
		int mid = n / 2;

		while (left < right) {
			if (!isBadVersion(mid)) {
				left = mid + 1;
			} else {
				right = mid;
			}
			mid = left + (right - left) / 2;
		}

		return mid;
	}

}
