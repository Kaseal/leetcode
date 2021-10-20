package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParallelCoursesTest {

	private final ParallelCourses parallelCourses = new ParallelCourses();

	@Test
	void test3__1_3___2_3() {
		Assertions.assertEquals(2, parallelCourses.minimumSemesters(3, new int[][]{{1, 3}, {2, 3}}));
	}

	@Test
	void test3__1_2___2_3___3_1() {
		Assertions.assertEquals(-1, parallelCourses.minimumSemesters(3, new int[][]{{1, 3}, {2, 3}, {3, 1}}));
	}

	@Test
	void test() {
		Assertions.assertEquals(5, parallelCourses.minimumSemesters(6, new int[][]{{1, 3}, {2, 4}, {3, 4}, {3, 5}, {4, 5}, {4, 6}, {5, 6}}));
	}

}