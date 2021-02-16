package easy;

import org.junit.Assert;
import org.junit.Test;

public class DefangingAnIPAddressTest {

	private final DefangingAnIPAddress defangingAnIPAddress = new DefangingAnIPAddress();

	@Test
	public void test1_1_1_1() {
		Assert.assertEquals("1[.]1[.]1[.]1", defangingAnIPAddress.defangIPaddr("1.1.1.1"));
	}

	@Test
	public void test255_100_50_0() {
		Assert.assertEquals("255[.]100[.]50[.]0", defangingAnIPAddress.defangIPaddr("255.100.50.0"));
	}

}