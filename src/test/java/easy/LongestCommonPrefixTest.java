package easy;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

	private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

	@Test
	public void testFlowerFlowFlight() {
		String[] strs = {"flower", "flow", "flight"};
		Assert.assertEquals("fl", longestCommonPrefix.longestCommonPrefix(strs));
	}

	@Test
	public void testDogRacecarCar() {
		String[] strs = {"dog", "racecar", "car"};
		Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix(strs));
	}

	@Test
	public void testA() {
		String[] strs = {"a"};
		Assert.assertEquals("a", longestCommonPrefix.longestCommonPrefix(strs));
	}

	@Test
	public void testFlowerFlowerFlowerFlower() {
		String[] strs = {"flower","flower","flower","flower"};
		Assert.assertEquals("flower", longestCommonPrefix.longestCommonPrefix(strs));
	}

	@Test
	public void testAbA() {
		String[] strs = {"ab", "a"};
		Assert.assertEquals("a", longestCommonPrefix.longestCommonPrefix(strs));
	}

}