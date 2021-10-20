package common.helper_classes;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

	private final HashMap<Integer, GraphVertex> graph = new HashMap<>();
	private final int vertexCount;

	public Graph(final int vertexCount) {
		this.vertexCount = vertexCount;
		for (int i = 1; i <= vertexCount; i++) {
			graph.put(i, new GraphVertex());
		}
	}

	public int getVertexCount() {
		return vertexCount;
	}

	public GraphVertex get(final int vertex) {
		if (vertex > vertexCount) {
			throw new RuntimeException("Incorrect vertex");
		}
		return graph.get(vertex);
	}

	public ArrayList<Integer> getZeroWeightVertices() {
		ArrayList<Integer> zeroVertexesList = new ArrayList<>();
		for (int i = 1; i <= vertexCount; i++) {
			GraphVertex graphVertex = graph.get(i);
			if (graphVertex.getWeight() == 0) {
				zeroVertexesList.add(i);
			}
		}
		return zeroVertexesList;
	}

}
