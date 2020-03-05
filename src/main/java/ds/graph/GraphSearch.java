package ds.graph;

import java.util.LinkedList;
import java.util.List;

public class GraphSearch {
	public static void main(String[] args) {
		Graph graph = new Graph(4);
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 2);
		addEdge(graph, 1, 2);
		addEdge(graph, 2, 0);
		addEdge(graph, 2, 3);
		addEdge(graph, 3, 3);
		System.out.println(graph.vertices);
		//BFS(graph, 1);
		boolean visited[] = new boolean[graph.totalVert];
		DFS(graph, 2,visited);
	}

	public static void addEdge(Graph graph, int source, int dest) {
		graph.vertices.get(source).add(dest);
	}

	public static void BFS(Graph graph, int startVertex) {
		boolean visited[] = new boolean[graph.totalVert];
		visited[startVertex] = true;
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(startVertex);

		while (!queue.isEmpty()) {
			startVertex = queue.poll();
			System.out.println(startVertex + " -> ");
			List<Integer> connectedVetices = graph.vertices.get(startVertex);
			for (int i = 0; i < connectedVetices.size(); i++) {
				if (visited[connectedVetices.get(i)] != true) {
					queue.add(connectedVetices.get(i));
					visited[connectedVetices.get(i)] = true;
				}
			}
		}
	}
	
	
	public static void DFS(Graph graph, int startVertex,boolean[] visited){
		
		visited[startVertex] = true;
		System.out.println(startVertex + " -> ");
		List<Integer> connectedVertices = graph.vertices.get(startVertex);
		for(int i=0; i<connectedVertices.size();i++){
			if(visited[connectedVertices.get(i)]!=true){
				DFS(graph, connectedVertices.get(i),visited);
			}
		}
		
	}
}
