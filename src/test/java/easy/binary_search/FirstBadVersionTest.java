package easy.binary_search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extension;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

@ExtendWith(FirstBadVersionTest.class)
public class FirstBadVersionTest implements Extension {

	@Spy
	private FirstBadVersion firstBadVersion;

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void test1() {
		Mockito.doReturn(true).when(firstBadVersion).isBadVersion(4);
		Assertions.assertEquals(4, firstBadVersion.firstBadVersion(5));
	}

	@Test
	public void test2() {
		Mockito.doReturn(true).when(firstBadVersion).isBadVersion(1);
		Assertions.assertEquals(1, firstBadVersion.firstBadVersion(1));
	}

}