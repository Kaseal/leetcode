package common.helper_classes;

import java.util.ArrayList;
import java.util.List;

public class GraphVertex {

	private final List<Integer> vertexes;
	private int weight;

	public GraphVertex() {
		vertexes = new ArrayList<>();
		weight = 0;
	}

	public void addVertex(int i) {
		vertexes.add(i);
	}

	public void increaseWeight() {
		weight++;
	}

	public void decreaseWeight() {
		weight--;
	}

	public int getWeight() {
		return weight;
	}

	public List<Integer> getVertexes() {
		return vertexes;
	}

}
