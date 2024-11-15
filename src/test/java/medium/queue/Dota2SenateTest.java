package medium.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Dota2SenateTest {

	private final Dota2Senate instance = new Dota2Senate();

	@Test
	void test1() {
		Assertions.assertEquals("Radiant", instance.predictPartyVictory("RD"));
	}

	@Test
	void test2() {
		Assertions.assertEquals("Dire", instance.predictPartyVictory("RDD"));
	}

	@Test
	void test3() {
		Assertions.assertEquals("Dire", instance.predictPartyVictory("D"));
	}

	@Test
	void test4() {
		Assertions.assertEquals("Dire", instance.predictPartyVictory("DDRRR"));
	}

	@Test
	void test5() {
		Assertions.assertEquals("Radiant", instance.predictPartyVictory("RRDRDDRDRRDDDDDRDRDR"));
	}

}