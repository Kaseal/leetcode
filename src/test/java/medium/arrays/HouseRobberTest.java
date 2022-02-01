package medium.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HouseRobberTest {

	private final HouseRobber houseRobber = new HouseRobber();

	@Test
	public void test1() {
		Assertions.assertEquals(4, houseRobber.rob(new int[]{1, 2, 3, 1}));
	}

	@Test
	public void tes2() {
		Assertions.assertEquals(12, houseRobber.rob(new int[]{2, 7, 9, 3, 1}));
	}

}