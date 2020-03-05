package ds.graph;

public class GraphBuilder {
	public static void main(String[] args) {
		Graph graph = new Graph(5);
		addEdge(graph, 0, 4);
		addEdge(graph, 0, 1);
		addEdge(graph, 1, 4);
		addEdge(graph, 1, 3);
		addEdge(graph, 1, 2);
		addEdge(graph, 2, 3);
		addEdge(graph, 3, 4);

		
		System.out.println(graph.vertices);
	}
	
	public static void addEdge(Graph graph, int source, int dest){
		graph.vertices.get(source).add(dest);
		graph.vertices.get(dest).add(source);

	}
}
