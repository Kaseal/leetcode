package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JewelsAndStonesTest {

	private final JewelsAndStones jewelsAndStones = new JewelsAndStones();

	@Test
	public void test_aA_aAAbbbb() {
		Assertions.assertEquals(3, jewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
	}

	@Test
	public void test_z_ZZ() {
		Assertions.assertEquals(0, jewelsAndStones.numJewelsInStones("z", "ZZ"));
	}

}