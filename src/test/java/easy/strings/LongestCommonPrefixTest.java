package easy.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

	private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

	@Test
	public void testFlowerFlowFlight() {
		String[] strs = {"flower", "flow", "flight"};
		Assertions.assertEquals("fl", longestCommonPrefix.longestCommonPrefix(strs));
	}

	@Test
	public void testDogRacecarCar() {
		String[] strs = {"dog", "racecar", "car"};
		Assertions.assertEquals("", longestCommonPrefix.longestCommonPrefix(strs));
	}

	@Test
	public void testA() {
		String[] strs = {"a"};
		Assertions.assertEquals("a", longestCommonPrefix.longestCommonPrefix(strs));
	}

	@Test
	public void testFlowerFlowerFlowerFlower() {
		String[] strs = {"flower","flower","flower","flower"};
		Assertions.assertEquals("flower", longestCommonPrefix.longestCommonPrefix(strs));
	}

	@Test
	public void testAbA() {
		String[] strs = {"ab", "a"};
		Assertions.assertEquals("a", longestCommonPrefix.longestCommonPrefix(strs));
	}

}