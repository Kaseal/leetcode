package easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingARuleTest {

	private final CountItemsMatchingARule instance = new CountItemsMatchingARule();

	@Test
	public void test1() {
		List<List<String>> list = new ArrayList<>();
		List<String> list1 = new ArrayList<>();
		list1.add("phone");
		list1.add("blue");
		list1.add("pixel");
		List<String> list2 = new ArrayList<>();
		list2.add("computer");
		list2.add("silver");
		list2.add("lenovo");
		List<String> list3 = new ArrayList<>();
		list3.add("phone");
		list3.add("gold");
		list3.add("iphone");
		list.add(list1);
		list.add(list2);
		list.add(list3);

		Assert.assertEquals(1, instance.countMatches(list, "color", "silver"));
	}

	@Test
	public void test2() {
		List<List<String>> list = new ArrayList<>();
		List<String> list1 = new ArrayList<>();
		list1.add("phone");
		list1.add("blue");
		list1.add("pixel");
		List<String> list2 = new ArrayList<>();
		list2.add("computer");
		list2.add("silver");
		list2.add("lenovo");
		List<String> list3 = new ArrayList<>();
		list3.add("phone");
		list3.add("gold");
		list3.add("iphone");
		list.add(list1);
		list.add(list2);
		list.add(list3);

		Assert.assertEquals(2, instance.countMatches(list, "type", "phone"));
	}

}