package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DesignHashSetTest {
	private final DesignHashSet designHashSet = new DesignHashSet();

	@Test
	void test1() {
		DesignHashSet.MyHashSet myHashSet = new DesignHashSet.MyHashSet();

		myHashSet.add(1);
		myHashSet.add(2);

		Assertions.assertTrue(myHashSet.contains(1));
		Assertions.assertFalse(myHashSet.contains(3));

		myHashSet.add(2);

		Assertions.assertTrue(myHashSet.contains(2));

		myHashSet.remove(2);

		Assertions.assertFalse(myHashSet.contains(2));
	}

}