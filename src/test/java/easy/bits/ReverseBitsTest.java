package easy.bits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseBitsTest {

	private final ReverseBits reverseBits = new ReverseBits();

	@Test
	public void test1() {
		Assertions.assertEquals(964176192, reverseBits.reverseBits(43261596));
	}

}