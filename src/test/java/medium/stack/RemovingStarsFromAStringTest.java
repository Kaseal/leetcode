package medium.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemovingStarsFromAStringTest {

	private final RemovingStarsFromAString instance = new RemovingStarsFromAString();

	@Test
	void test1() {
		Assertions.assertEquals("lecoe", instance.removeStars("leet**cod*e"));
	}

	@Test
	void test2() {
		Assertions.assertEquals("", instance.removeStars("erase*****"));
	}

}