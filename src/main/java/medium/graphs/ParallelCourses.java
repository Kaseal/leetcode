package medium.graphs;

import common.helper_classes.Graph;
import common.helper_classes.GraphVertex;

import java.util.ArrayList;
import java.util.List;

//1136. Parallel Courses (Medium)
public class ParallelCourses {

	public int minimumSemesters(int n, int[][] relations) {
		Graph graph = new Graph(n);

		for (int[] relation : relations) {
			int prev = relation[0];
			int next = relation[1];

			graph.get(prev).addVertex(next);
			graph.get(next).increaseWeight();
		}

		ArrayList<Integer> zeroVerticesList = graph.getZeroWeightVertices();

		int step = 0;
		int count = 0;
		while (!zeroVerticesList.isEmpty()) {
			step++;
			for (Integer zeroVertex : zeroVerticesList) {
				count++;
				GraphVertex graphVertex = graph.get(zeroVertex);
				graphVertex.decreaseWeight();
				List<Integer> vertexes = graphVertex.getVertexes();
				for (Integer vertex : vertexes) {
					graph.get(vertex).decreaseWeight();
				}
			}
			zeroVerticesList = graph.getZeroWeightVertices();
		}

		return count == n ? step : -1;
	}

}
