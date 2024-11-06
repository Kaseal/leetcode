package easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindTheHighestAltitudeTest {

	private final FindTheHighestAltitude instance = new FindTheHighestAltitude();

	@Test
	void test1() {
		Assertions.assertEquals(1, instance.largestAltitude(new int[]{-5, 1, 5, 0, -7}));
	}

	@Test
	void test2() {
		Assertions.assertEquals(0, instance.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
	}

}