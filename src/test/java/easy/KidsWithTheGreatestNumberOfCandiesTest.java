package easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandiesTest {

	private final KidsWithTheGreatestNumberOfCandies kidsWithTheGreatestNumberOfCandies =
			new KidsWithTheGreatestNumberOfCandies();

	@Test
	public void test23513__3() {
		int[] nums = {2, 3, 5, 1, 3};
		List<Boolean> expectedList = new ArrayList<>();
		expectedList.add(true);
		expectedList.add(true);
		expectedList.add(true);
		expectedList.add(false);
		expectedList.add(true);

		Assert.assertEquals(expectedList, kidsWithTheGreatestNumberOfCandies.kidsWithCandies(nums, 3));
	}

	@Test
	public void test42112__1() {
		int[] nums = {4, 2, 1, 1, 2};
		List<Boolean> expectedList = new ArrayList<>();
		expectedList.add(true);
		expectedList.add(false);
		expectedList.add(false);
		expectedList.add(false);
		expectedList.add(false);

		Assert.assertEquals(expectedList, kidsWithTheGreatestNumberOfCandies.kidsWithCandies(nums, 1));
	}

	@Test
	public void test12_1_12__10() {
		int[] nums = {12, 1, 12};
		List<Boolean> expectedList = new ArrayList<>();
		expectedList.add(true);
		expectedList.add(false);
		expectedList.add(true);

		Assert.assertEquals(expectedList, kidsWithTheGreatestNumberOfCandies.kidsWithCandies(nums, 10));
	}

}