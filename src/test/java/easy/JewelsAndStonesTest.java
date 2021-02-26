package easy;

import org.junit.Assert;
import org.junit.Test;

public class JewelsAndStonesTest {

	private final JewelsAndStones jewelsAndStones = new JewelsAndStones();

	@Test
	public void test_aA_aAAbbbb() {
		Assert.assertEquals(3, jewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
	}

	@Test
	public void test_z_ZZ() {
		Assert.assertEquals(0, jewelsAndStones.numJewelsInStones("z", "ZZ"));
	}

}