package easy.binary_search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class FirstBadVersionTest {

	@Spy
	private FirstBadVersion firstBadVersion;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void test1() {
		Mockito.doReturn(true).when(firstBadVersion).isBadVersion(4);
		Assertions.assertEquals(4, firstBadVersion.firstBadVersion(5));
	}

	@Test
	void test2() {
		Mockito.doReturn(true).when(firstBadVersion).isBadVersion(1);
		Assertions.assertEquals(1, firstBadVersion.firstBadVersion(1));
	}

}