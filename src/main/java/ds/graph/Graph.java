package ds.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	int totalVert;
	List<List<Integer>> vertices;

	public Graph(int totalVert) {
		super();
		this.totalVert = totalVert;
		this.vertices = new ArrayList<>();
		for (int i = 0; i < totalVert; i++) {
			this.vertices.add(new ArrayList<Integer>());
		}
	}

}
