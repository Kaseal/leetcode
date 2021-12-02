package easy.binary_search;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FirstBadVersionTest {

	@Spy
	private FirstBadVersion firstBadVersion;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test1() {
		Mockito.doReturn(true).when(firstBadVersion).isBadVersion(4);
		Assert.assertEquals(4, firstBadVersion.firstBadVersion(5));
	}

	@Test
	public void test2() {
		Mockito.doReturn(true).when(firstBadVersion).isBadVersion(1);
		Assert.assertEquals(1, firstBadVersion.firstBadVersion(1));
	}

}