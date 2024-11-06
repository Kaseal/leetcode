package easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FindPivotIndexTest {

	private FindPivotIndex instance = new FindPivotIndex();

	@Test
	void test1() {
		Assertions.assertEquals(3, instance.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
	}

	@Test
	void test2() {
		Assertions.assertEquals(-1, instance.pivotIndex(new int[]{1, 2, 3}));
	}

	@Test
	void test3() {
		Assertions.assertEquals(0, instance.pivotIndex(new int[]{2, 1, -1}));
	}

	@Test
	void test4() {
		Assertions.assertEquals(2, instance.pivotIndex(new int[]{-1, -1, 0, 0, -1, -1}));
	}

	@Test
	void test5() {
		Assertions.assertEquals(0, instance.pivotIndex(new int[]{1, 0}));
	}

}