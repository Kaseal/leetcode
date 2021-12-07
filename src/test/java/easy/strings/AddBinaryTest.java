package easy.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddBinaryTest {

	private final AddBinary addBinary = new AddBinary();

	@Test
	public void test11_1() {
		Assertions.assertEquals("100", addBinary.addBinary("11", "1"));
	}

	@Test
	public void test1010_1011() {
		Assertions.assertEquals("10101", addBinary.addBinary("1010", "1011"));
	}

}