package easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeStringsAlternatelyTest {

	private MergeStringsAlternately instance = new MergeStringsAlternately();

	@Test
	void test1() {
		Assertions.assertEquals("apbqcr", instance.mergeAlternately("abc", "pqr"));
	}

	@Test
	void test2() {
		Assertions.assertEquals("apbqrs", instance.mergeAlternately("ab", "pqrs"));
	}

	@Test
	void test3() {
		Assertions.assertEquals("apbqcd", instance.mergeAlternately("abcd", "pq"));
	}

}