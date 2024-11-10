package medium.hash_map_set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

class EqualRowAndColumnPairsTest {

	private final EqualRowAndColumnPairs instance = new EqualRowAndColumnPairs();

	@Test
	void test1() {
		Assertions.assertEquals(1, instance.equalPairs(new int[][]{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}}));
	}

	@Test
	void test2() {
		Assertions.assertEquals(3, instance.equalPairs(new int[][]{{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}}));
	}

	@Test
	void test3() {
		Assertions.assertEquals(2, instance.equalPairs(new int[][]{{11, 1}, {1, 11}}));
	}

	@Test
	void test4() {
		Assertions.assertEquals(3, instance.equalPairs(new int[][]{{3, 1, 2, 2}, {1, 4, 4, 4}, {2, 4, 2, 2}, {2, 5, 2, 2}}));
	}

	@Test
	void test5() {
		Assertions.assertEquals(0, instance.equalPairs(new int[][]{{2, 1}, {3, 32}}));
	}

	@Test
	void testHash() {
		int hash = 0;
		System.out.println("2,1:  " + Objects.hash(hash, 2, 1)); //29854  <<==
		System.out.println("3,32: " + Objects.hash(hash, 3, 32)); //29916
		System.out.println("2,3:  " + Objects.hash(hash, 2, 3)); //29856
		System.out.println("1,32: " + Objects.hash(hash, 1, 32)); //29854 <<==
	}

}