package easy.arrays;

//1528. Shuffle String (Easy)
public class ShuffleString {

	public String restoreString(String s, int[] indices) {
		char[] chars = new char[indices.length];

		for (int i = 0; i < s.length(); i++) {
			chars[i] = s.charAt(i);
		}

		char[] result = new char[chars.length];
		for (int i = 0; i < indices.length; i++) {
			result[indices[i]] = chars[i];
		}

		return new String(result);
	}

}
