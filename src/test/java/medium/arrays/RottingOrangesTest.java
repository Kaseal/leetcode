package medium.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RottingOrangesTest {

	private final RottingOranges rottingOranges = new RottingOranges();

	@Test
	public void test1() {
		Assertions.assertEquals(4, rottingOranges.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
	}

	@Test
	public void test2() {
		Assertions.assertEquals(-1, rottingOranges.orangesRotting(new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}}));
	}

	@Test
	public void test3() {
		Assertions.assertEquals(0, rottingOranges.orangesRotting(new int[][]{{0, 2}}));
	}

	@Test
	public void test4() {
		Assertions.assertEquals(-1, rottingOranges.orangesRotting(new int[][]{{1}}));
	}

}