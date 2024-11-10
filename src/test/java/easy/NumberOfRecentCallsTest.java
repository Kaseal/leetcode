package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class NumberOfRecentCallsTest {

	private final NumberOfRecentCalls instance = new NumberOfRecentCalls();

	@Test
	void test1() {
		Assertions.assertEquals(1, instance.ping(1));
	}

	@Test
	void test2() {
		Assertions.assertEquals(2, instance.ping(100));
	}

	@Test
	void test3() {
		Assertions.assertEquals(3, instance.ping(3001));
	}

	@Test
	void test4() {
		Assertions.assertEquals(3, instance.ping(3002));
	}

}