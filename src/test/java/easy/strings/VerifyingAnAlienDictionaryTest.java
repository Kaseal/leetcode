package easy.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VerifyingAnAlienDictionaryTest {

	private final VerifyingAnAlienDictionary verifyingAnAlienDictionary = new VerifyingAnAlienDictionary();

	@Test
	public void test_hello_leetcode() {
		Assertions.assertTrue(verifyingAnAlienDictionary.isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
	}

	@Test
	public void test_word_world_row() {
		Assertions.assertFalse(verifyingAnAlienDictionary.isAlienSorted(new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz"));
	}

	@Test
	public void test_apple_app() {
		Assertions.assertFalse(verifyingAnAlienDictionary.isAlienSorted(new String[]{"apple", "app"}, "abcdefghijklmnopqrstuvwxyz"));
	}

	@Test
	public void test_kuvp_q() {
		Assertions.assertTrue(verifyingAnAlienDictionary.isAlienSorted(new String[]{"kuvp", "q"}, "ngxlkthsjuoqcpavbfdermiywz"));
	}

	@Test
	public void test_apap_app() {
		Assertions.assertTrue(verifyingAnAlienDictionary.isAlienSorted(new String[]{"apap", "app"}, "abcdefghijklmnopqrstuvwxyz"));
	}

	@Test
	public void test_fxasxpc_dfbdrifhp_nwzgs_cmwqriv() {
		String[] arr = {"fxasxpc", "dfbdrifhp", "nwzgs", "cmwqriv", "ebulyfyve", "miracx", "sxckdwzv", "dtijzluhts", "wwbmnge", "qmjwymmyox"};
		Assertions.assertFalse(verifyingAnAlienDictionary.isAlienSorted(arr, "zkgwaverfimqxbnctdplsjyohu"));
	}

	@Test
	public void test_zirqhpfscx_zrmvtxgelh_vokopzrtc_nugfyso_rzdmvyf() {
		String[] arr = {"zirqhpfscx", "zrmvtxgelh", "vokopzrtc", "nugfyso", "rzdmvyf", "vhvqzkfqis", "dvbkppw", "ttfwryy", "dodpbbkp", "akycwwcdog"};
		Assertions.assertFalse(verifyingAnAlienDictionary.isAlienSorted(arr, "khjzlicrmunogwbpqdetasyfvx"));
	}

}