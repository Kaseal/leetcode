package easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfIntegerTest {

	private final AddToArrayFormOfInteger addToArrayFormOfInteger = new AddToArrayFormOfInteger();

	@Test
	void test_1200_34__1234() {
		List<Integer> expectedList = new ArrayList<>();
		expectedList.add(1);
		expectedList.add(2);
		expectedList.add(3);
		expectedList.add(4);

		Assertions.assertEquals(expectedList, addToArrayFormOfInteger.addToArrayForm(new int[]{1, 2, 0, 0}, 34));
	}

	@Test
	void test_274_181__455() {
		List<Integer> expectedList = new ArrayList<>();
		expectedList.add(4);
		expectedList.add(5);
		expectedList.add(5);

		Assertions.assertEquals(expectedList, addToArrayFormOfInteger.addToArrayForm(new int[]{2, 7, 4}, 181));
	}

	@Test
	void test_215_806__1021() {
		List<Integer> expectedList = new ArrayList<>();
		expectedList.add(1);
		expectedList.add(0);
		expectedList.add(2);
		expectedList.add(1);

		Assertions.assertEquals(expectedList, addToArrayFormOfInteger.addToArrayForm(new int[]{2, 1, 5}, 806));
	}

	@Test
	void test_9999999999_1__10000000000() {
		List<Integer> expectedList = new ArrayList<>();
		expectedList.add(1);
		expectedList.add(0);
		expectedList.add(0);
		expectedList.add(0);
		expectedList.add(0);
		expectedList.add(0);
		expectedList.add(0);
		expectedList.add(0);
		expectedList.add(0);
		expectedList.add(0);
		expectedList.add(0);

		Assertions.assertEquals(expectedList, addToArrayFormOfInteger.addToArrayForm(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 1));
	}

}