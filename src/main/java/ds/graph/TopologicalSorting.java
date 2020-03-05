package ds.graph;

import java.util.List;
import java.util.Stack;

public class TopologicalSorting extends GraphSearch {
	public static Stack<Integer> stack= new Stack<>();

	public static void main(String[] args) {
		Graph graph = new Graph(6);
		addEdge(graph, 2, 3);
		addEdge(graph, 3, 1);
		addEdge(graph, 4, 0);
		addEdge(graph, 4, 1);
		addEdge(graph, 5, 2);
		addEdge(graph, 5, 0);
		topologicalSort(graph);
		while(!stack.isEmpty()){
			System.out.print(""+stack.pop()+" -> ");

		}
	}

	public static void topologicalSort(Graph graph) {
		boolean visited[] = new boolean[graph.totalVert];
		for (int i = 0; i < graph.totalVert; i++) {
			if (visited[i] != true)
				TopologicalSorting.DFS(graph, i, visited);
		}
	}

	public static void DFS(Graph graph, int startVertex, boolean[] visited) {
		visited[startVertex] = true;
		List<Integer> edgeVetices = graph.vertices.get(startVertex);
		for (int vertex : edgeVetices) {
            if(visited[vertex]!=true)
            	DFS(graph, vertex, visited);
		}
		stack.push(startVertex);
	}
}
