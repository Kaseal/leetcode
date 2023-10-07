package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class FizzBuzzTest {
	private final FizzBuzz fizzBuzz = new FizzBuzz();

	@Test
	void test1() {
		List<String> expected = Arrays.asList("1", "2", "Fizz");

		Assertions.assertEquals(expected, fizzBuzz.fizzBuzz(3));
	}

	@Test
	void test2() {
		List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz");

		Assertions.assertEquals(expected, fizzBuzz.fizzBuzz(5));
	}

	@Test
	void test3() {
		List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");

		Assertions.assertEquals(expected, fizzBuzz.fizzBuzz(15));
	}

}