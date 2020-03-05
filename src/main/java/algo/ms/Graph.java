package algo.ms;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	int totalver;

	List<List<Edge>> vertices;

	public Graph(int totalver) {
		this.totalver = totalver;
		vertices = new ArrayList<List<Edge>>();
		for (int i = 0; i < totalver; i++) {
			vertices.add(new ArrayList<Edge>());
		}
     
	}
	
  void addEdge(String source, String dest, double weight){
		vertices.get(getID(source)).add(new Edge(getID(dest), weight));
	}
  
  public static int getID(String s) {
		if (s == "USD")
			return 0;
		if (s == "INR")
			return 1;
		if (s == "AUD")
			return 2;
		else
			return 3;
	}

}
