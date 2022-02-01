package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class CombinationsTest {

	private final Combinations combinations = new Combinations();

	@Test
	public void test1() {
		List<Integer> list1 = Arrays.asList(1, 2);
		List<Integer> list2 = Arrays.asList(1, 3);
		List<Integer> list3 = Arrays.asList(1, 4);
		List<Integer> list4 = Arrays.asList(2, 3);
		List<Integer> list5 = Arrays.asList(2, 4);
		List<Integer> list6 = Arrays.asList(3, 4);

		List<List<Integer>> lists = new LinkedList<>();
		lists.add(list1);
		lists.add(list2);
		lists.add(list3);
		lists.add(list4);
		lists.add(list5);
		lists.add(list6);

		Assertions.assertEquals(lists, combinations.combine(4, 2));
	}

	@Test
	public void test2() {
		List<Integer> list1 = Collections.singletonList(1);

		List<List<Integer>> lists = new LinkedList<>();
		lists.add(list1);

		Assertions.assertEquals(lists, combinations.combine(1, 1));
	}

}