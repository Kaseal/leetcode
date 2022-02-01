package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class TriangleTest {

	private final Triangle triangle = new Triangle();

	@Test
	public void test1() {
		List<List<Integer>> list = new ArrayList<>();

		list.add(Collections.singletonList(2));
		list.add(Arrays.asList(3, 4));
		list.add(Arrays.asList(6, 5, 7));
		list.add(Arrays.asList(4, 1, 8, 3));

		Assertions.assertEquals(11, triangle.minimumTotal(list));
	}

	@Test
	public void test2() {
		List<List<Integer>> list = new ArrayList<>();

		list.add(Collections.singletonList(-10));

		Assertions.assertEquals(-10, triangle.minimumTotal(list));
	}

	@Test
	public void test3() {
		List<List<Integer>> list = new ArrayList<>();

		list.add(Collections.singletonList(-1));
		list.add(Arrays.asList(2, 3));
		list.add(Arrays.asList(1, -1, -3));

		Assertions.assertEquals(-1, triangle.minimumTotal(list));
	}

}