package medium.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringCompressionTest {

	private final StringCompression instance = new StringCompression();

	@Test
	void test1() {
		char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

		Assertions.assertEquals(6, instance.compress(chars));

		Assertions.assertEquals('a', chars[0]);
		Assertions.assertEquals('2', chars[1]);
		Assertions.assertEquals('b', chars[2]);
		Assertions.assertEquals('2', chars[3]);
		Assertions.assertEquals('c', chars[4]);
		Assertions.assertEquals('3', chars[5]);
	}

	@Test
	void test2() {
		char[] chars = {'a'};

		Assertions.assertEquals(1, instance.compress(chars));

		Assertions.assertEquals('a', chars[0]);
	}

	@Test
	void test3() {
		char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};

		Assertions.assertEquals(4, instance.compress(chars));

		Assertions.assertEquals('a', chars[0]);
		Assertions.assertEquals('b', chars[1]);
		Assertions.assertEquals('1', chars[2]);
		Assertions.assertEquals('2', chars[3]);
	}

	@Test
	void test4() {
		char[] chars = {'a', 'a'};

		Assertions.assertEquals(2, instance.compress(chars));

		Assertions.assertEquals('a', chars[0]);
		Assertions.assertEquals('2', chars[1]);
	}

	@Test
	void test5() {
		char[] chars = {'a', 'b', 'c'};

		Assertions.assertEquals(3, instance.compress(chars));

		Assertions.assertEquals('a', chars[0]);
		Assertions.assertEquals('b', chars[1]);
		Assertions.assertEquals('c', chars[2]);
	}

}