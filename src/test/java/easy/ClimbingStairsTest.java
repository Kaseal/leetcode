package easy;

import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairsTest {

	private final ClimbingStairs climbingStairs = new ClimbingStairs();

	@Test
	public void test2() {
		Assert.assertEquals(2, climbingStairs.climbStairs(2));
	}

	@Test
	public void test3() {
		Assert.assertEquals(3, climbingStairs.climbStairs(3));
	}

	@Test
	public void test4() {
		Assert.assertEquals(5, climbingStairs.climbStairs(4));
	}

}