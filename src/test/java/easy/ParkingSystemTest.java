package easy;

import org.junit.Assert;
import org.junit.Test;

public class ParkingSystemTest {

	@Test
	public void test_1_1_0__1__2__3__1() {
		ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);

		Assert.assertTrue(parkingSystem.addCar(1));
		Assert.assertTrue(parkingSystem.addCar(2));
		Assert.assertFalse(parkingSystem.addCar(3));
		Assert.assertFalse(parkingSystem.addCar(1));
	}

	@Test
	public void test_0_0_2__1__2__3() {
		ParkingSystem parkingSystem = new ParkingSystem(0, 0, 2);
		Assert.assertFalse(parkingSystem.addCar(1));
		Assert.assertFalse(parkingSystem.addCar(2));
		Assert.assertTrue(parkingSystem.addCar(3));
	}

}