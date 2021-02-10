package easy;

import org.junit.Assert;
import org.junit.Test;

public class AddBinaryTest {

	private final AddBinary addBinary = new AddBinary();

	@Test
	public void test11_1() {
		Assert.assertEquals("100", addBinary.addBinary("11", "1"));
	}

	@Test
	public void test1010_1011() {
		Assert.assertEquals("10101", addBinary.addBinary("1010", "1011"));
	}

}