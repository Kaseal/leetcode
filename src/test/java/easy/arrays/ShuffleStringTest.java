package easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShuffleStringTest {

	private final ShuffleString shuffleString = new ShuffleString();

	@Test
	public void test_codeleet_45670213() {
		int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

		Assertions.assertEquals("leetcode", shuffleString.restoreString("codeleet", indices));
	}

	@Test
	public void test_abc_012() {
		int[] indices = {0, 1, 2};

		Assertions.assertEquals("abc", shuffleString.restoreString("abc", indices));
	}

	@Test
	public void test_aiohn_31420() {
		int[] indices = {3, 1, 4, 2, 0};

		Assertions.assertEquals("nihao", shuffleString.restoreString("aiohn", indices));
	}

	@Test
	public void test_aaiougrt_40267315() {
		int[] indices = {4, 0, 2, 6, 7, 3, 1, 5};

		Assertions.assertEquals("arigatou", shuffleString.restoreString("aaiougrt", indices));
	}

	@Test
	public void test_art_102() {
		int[] indices = {1, 0, 2};

		Assertions.assertEquals("rat", shuffleString.restoreString("art", indices));
	}

}