package easy;

//705. Design HashSet (Easy)
public class DesignHashSet {

	static class MyHashSet {

		boolean[] arr = new boolean[10000001];

		public MyHashSet() {

		}

		public void add(int key) {
			arr[key] = true;
		}

		public void remove(int key) {
			arr[key] = false;
		}

		public boolean contains(int key) {
			return arr[key];
		}

	}

}
