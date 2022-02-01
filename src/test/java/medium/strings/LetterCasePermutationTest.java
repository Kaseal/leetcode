package medium.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class LetterCasePermutationTest {

	private final LetterCasePermutation letterCasePermutation = new LetterCasePermutation();

	@Test
	public void test1() {
		List<String> list = new ArrayList<>();

		list.add("a1b2");
		list.add("A1b2");
		list.add("a1B2");
		list.add("A1B2");

		List<String> a1b2 = letterCasePermutation.letterCasePermutation("a1b2");
		Assertions.assertEquals(list, letterCasePermutation.letterCasePermutation("a1b2"));
	}

	@Test
	public void test2() {
		List<String> list = new ArrayList<>();

		list.add("3z4");
		list.add("3Z4");

		Assertions.assertEquals(list, letterCasePermutation.letterCasePermutation("3z4"));
	}

	@Test
	public void test3() {
		List<String> list = new ArrayList<>();

		list.add("12345");

		Assertions.assertEquals(list, letterCasePermutation.letterCasePermutation("12345"));
	}

	@Test
	public void test4() {
		List<String> list = new ArrayList<>();

		list.add("0");

		Assertions.assertEquals(list, letterCasePermutation.letterCasePermutation("0"));
	}

	@Test
	public void test5() {
		List<String> list = new ArrayList<>();

		list.add("c");
		list.add("C");

		Assertions.assertEquals(list, letterCasePermutation.letterCasePermutation("C"));
	}

}