package easy.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

	private final ReverseString reverseString = new ReverseString();

	@Test
	public void test1() {
		char[] chars = new char[]{'h', 'e', 'l', 'l', 'o'};
		reverseString.reverseString(chars);

		Assertions.assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, chars);
	}

	@Test
	public void test2() {
		char[] chars = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
		reverseString.reverseString(chars);

		Assertions.assertArrayEquals(new char[]{'h', 'a', 'n', 'n', 'a', 'H'}, chars);
	}

}
