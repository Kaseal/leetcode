package easy.geometry;

//1037. Valid Boomerang (Easy)
public class ValidBoomerang {

	public boolean isBoomerang(int[][] points) {
		int[] p1 = points[0];
		int[] p2 = points[1];
		int[] p3 = points[2];

		int x1 = p1[0], x2 = p2[0], x3 = p3[0];
		int y1 = p1[1], y2 = p2[1], y3 = p3[1];

		return !((x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1));
	}

}
