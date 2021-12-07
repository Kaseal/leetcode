package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountAndSayTest {

	private final CountAndSay countAndSay = new CountAndSay();

	@Test
	public void test1() {
		Assertions.assertEquals("1", countAndSay.countAndSay(1));
	}

	@Test
	public void test2() {
		Assertions.assertEquals("11", countAndSay.countAndSay(2));
	}

	@Test
	public void test3() {
		Assertions.assertEquals("21", countAndSay.countAndSay(3));
	}

	@Test
	public void test4() {
		Assertions.assertEquals("1211", countAndSay.countAndSay(4));
	}

}