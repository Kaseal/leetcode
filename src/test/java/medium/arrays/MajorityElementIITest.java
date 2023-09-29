package medium.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class MajorityElementIITest {

	private final MajorityElementII majorityElementII = new MajorityElementII();

	@Test
	void test1() {
		List<Integer> expected = Collections.singletonList(3);

		Assertions.assertEquals(expected, majorityElementII.majorityElement(new int[]{3, 2, 3}));
	}

	@Test
	void test2() {
		List<Integer> expected = Collections.singletonList(1);

		Assertions.assertEquals(expected, majorityElementII.majorityElement(new int[]{1}));
	}

	@Test
	void test3() {
		List<Integer> expected = Arrays.asList(1, 2);

		Assertions.assertEquals(expected, majorityElementII.majorityElement(new int[]{1, 2}));
	}

}