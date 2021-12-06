package easy.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddStringsTest {

	private final AddStrings addStrings = new AddStrings();

	@Test
	void test_11_133__134() {
		Assertions.assertEquals("134", addStrings.addStrings("11", "123"));
	}

	@Test
	void test_456_77__533() {
		Assertions.assertEquals("533", addStrings.addStrings("456", "77"));
	}

	@Test
	void test_0_0__0() {
		Assertions.assertEquals("0", addStrings.addStrings("0", "0"));
	}

	@Test
	void test_637_19837643__19838280() {
		Assertions.assertEquals("19838280", addStrings.addStrings("637", "19837643"));
	}

}