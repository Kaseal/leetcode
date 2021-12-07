package easy.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImplementStrStrTest {

	private final ImplementStrStr implementStrStr = new ImplementStrStr();

	@Test
	public void test_hello_ll() {
		Assertions.assertEquals(2, implementStrStr.strStr("hello", "ll"));
	}

	@Test
	public void test_aaaaa_bba() {
		Assertions.assertEquals(-1, implementStrStr.strStr("aaaaa", "bba"));
	}

	@Test
	public void test_empty_empty() {
		Assertions.assertEquals(0, implementStrStr.strStr("", ""));
	}

}