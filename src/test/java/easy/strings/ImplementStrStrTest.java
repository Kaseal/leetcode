package easy.strings;

import org.junit.Assert;
import org.junit.Test;

public class ImplementStrStrTest {

	private final ImplementStrStr implementStrStr = new ImplementStrStr();

	@Test
	public void test_hello_ll() {
		Assert.assertEquals(2, implementStrStr.strStr("hello", "ll"));
	}

	@Test
	public void test_aaaaa_bba() {
		Assert.assertEquals(-1, implementStrStr.strStr("aaaaa", "bba"));
	}

	@Test
	public void test_empty_empty() {
		Assert.assertEquals(0, implementStrStr.strStr("", ""));
	}

}