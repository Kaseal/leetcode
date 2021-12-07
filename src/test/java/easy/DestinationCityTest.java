package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class DestinationCityTest {

	private final DestinationCity destinationCity = new DestinationCity();

	@Test
	public void test1() {
		List<List<String>> paths = new ArrayList<>();
		List<String> list1 = new ArrayList<>();
		list1.add("London");
		list1.add("New York");
		List<String> list2 = new ArrayList<>();
		list2.add("New York");
		list2.add("Lima");
		List<String> list3 = new ArrayList<>();
		list3.add("Lima");
		list3.add("Sao Paulo");
		paths.add(list1);
		paths.add(list2);
		paths.add(list3);

		Assertions.assertEquals("Sao Paulo", destinationCity.destCity(paths));
	}

	@Test
	public void test2() {
		List<List<String>> paths = new ArrayList<>();
		List<String> list1 = new ArrayList<>();
		list1.add("B");
		list1.add("C");
		List<String> list2 = new ArrayList<>();
		list2.add("D");
		list2.add("B");
		List<String> list3 = new ArrayList<>();
		list3.add("C");
		list3.add("A");
		paths.add(list1);
		paths.add(list2);
		paths.add(list3);

		Assertions.assertEquals("A", destinationCity.destCity(paths));
	}

	@Test
	public void test3() {
		List<List<String>> paths = new ArrayList<>();
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("Z");
		paths.add(list1);

		Assertions.assertEquals("Z", destinationCity.destCity(paths));
	}

}