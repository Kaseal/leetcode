package medium.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TernaryExpressionParserTest {

	private final TernaryExpressionParser ternaryExpressionParser = new TernaryExpressionParser();

	@Test
	void test1() {
		Assertions.assertEquals("2", ternaryExpressionParser.parseTernary("T?2:3"));
	}

	@Test
	void test2() {
		Assertions.assertEquals("4", ternaryExpressionParser.parseTernary("F?1:T?4:5"));
	}

	@Test
	void test3() {
		Assertions.assertEquals("F", ternaryExpressionParser.parseTernary("T?T?F:5:3"));
	}

	@Test
	void test4() {
		Assertions.assertEquals("T", ternaryExpressionParser.parseTernary("T?T:F?T?1:2:F?3:4"));
	}

	@Test
	void test5() {
		Assertions.assertEquals("F", ternaryExpressionParser.parseTernary("F?F?3:8:T?F:T?0:F?8:T"));
	}

}