package easy;

import org.junit.Assert;
import org.junit.Test;

public class CountAndSayTest {

	private final CountAndSay countAndSay = new CountAndSay();

	@Test
	public void test1() {
		Assert.assertEquals("1", countAndSay.countAndSay(1));
	}

	@Test
	public void test2() {
		Assert.assertEquals("11", countAndSay.countAndSay(2));
	}

	@Test
	public void test3() {
		Assert.assertEquals("21", countAndSay.countAndSay(3));
	}

	@Test
	public void test4() {
		Assert.assertEquals("1211", countAndSay.countAndSay(4));
	}

}