package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClimbingStairsTest {

	private final ClimbingStairs climbingStairs = new ClimbingStairs();

	@Test
	public void test2() {
		Assertions.assertEquals(2, climbingStairs.climbStairs(2));
	}

	@Test
	public void test3() {
		Assertions.assertEquals(3, climbingStairs.climbStairs(3));
	}

	@Test
	public void test4() {
		Assertions.assertEquals(5, climbingStairs.climbStairs(4));
	}

}