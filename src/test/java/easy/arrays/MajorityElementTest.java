package easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MajorityElementTest {

	private final MajorityElement majorityElement = new MajorityElement();

	@Test
	void test1() {
		Assertions.assertEquals(3, majorityElement.majorityElement(new int[]{3, 2, 3}));
	}

	@Test
	void test2() {
		Assertions.assertEquals(2, majorityElement.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
	}

	@Test
	void test3() {
		Assertions.assertEquals(5, majorityElement.majorityElement(new int[]{6, 5, 5}));
	}

}