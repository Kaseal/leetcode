package easy.geometry;

import org.junit.Assert;
import org.junit.Test;

public class ValidBoomerangTest {

	private final ValidBoomerang validBoomerang = new ValidBoomerang();

	@Test
	public void test11_23_32() {
		Assert.assertTrue(validBoomerang.isBoomerang(new int[][]{{1, 1}, {2, 3}, {3, 2}}));
	}

	@Test
	public void test11_22_33() {
		Assert.assertFalse(validBoomerang.isBoomerang(new int[][]{{1, 1}, {2, 2}, {3, 3}}));
	}

	@Test
	public void test00_02_21() {
		Assert.assertTrue(validBoomerang.isBoomerang(new int[][]{{0, 0}, {0, 2}, {2, 1}}));
	}

}