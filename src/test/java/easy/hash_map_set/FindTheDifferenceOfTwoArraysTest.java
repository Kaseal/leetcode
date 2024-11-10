package easy.hash_map_set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class FindTheDifferenceOfTwoArraysTest {

	private FindTheDifferenceOfTwoArrays instance = new FindTheDifferenceOfTwoArrays();

	@Test
	void test1() {
		List<List<Integer>> expected = new ArrayList<>();
		expected.add(Arrays.asList(1, 3));
		expected.add(Arrays.asList(4, 6));

		List<List<Integer>> result = instance.findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6});

		Assertions.assertEquals(expected, result);
	}

	@Test
	void test2() {
		List<List<Integer>> expected = new ArrayList<>();
		expected.add(Collections.singletonList(3));
		expected.add(Collections.emptyList());

		List<List<Integer>> result = instance.findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2});

		Assertions.assertEquals(expected, result);
	}

}