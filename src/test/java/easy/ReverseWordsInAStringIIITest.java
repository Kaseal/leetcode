package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseWordsInAStringIIITest {

	private final ReverseWordsInAStringIII reverseWordsInAStringIII = new ReverseWordsInAStringIII();

	@Test
	public void test1() {
		Assertions.assertEquals("s'teL ekat edoCteeL tsetnoc",
				reverseWordsInAStringIII.reverseWords("Let's take LeetCode contest"));
	}

	@Test
	void test2() {
		Assertions.assertEquals("God Ding",
				reverseWordsInAStringIII.reverseWords("doG gniD"));
	}

}