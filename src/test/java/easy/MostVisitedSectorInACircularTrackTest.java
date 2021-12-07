package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MostVisitedSectorInACircularTrackTest {

	private final MostVisitedSectorInACircularTrack instance = new MostVisitedSectorInACircularTrack();

	@Test
	public void test1312_4() {
		List<Integer> expectedList = new ArrayList<>();
		expectedList.add(1);
		expectedList.add(2);
		Assertions.assertEquals(expectedList, instance.mostVisited(4, new int[]{1, 3, 1, 2}));
	}

	@Test
	public void test212121212_2() {
		List<Integer> expectedList = new ArrayList<>();
		expectedList.add(2);
		Assertions.assertEquals(expectedList, instance.mostVisited(2, new int[]{2, 1, 2, 1, 2, 1, 2, 1, 2}));
	}

	@Test
	public void test1357_7() {
		List<Integer> expectedList = new ArrayList<>();
		expectedList.add(1);
		expectedList.add(2);
		expectedList.add(3);
		expectedList.add(4);
		expectedList.add(5);
		expectedList.add(6);
		expectedList.add(7);
		Assertions.assertEquals(expectedList, instance.mostVisited(7, new int[]{1, 3, 5, 7}));
	}

}