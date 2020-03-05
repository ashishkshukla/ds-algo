package algo.ms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CurrencyConvertor {
	static Graph graph;

	public static void main(String[] args) {
		graph = new Graph(4);

		graph.addEdge("USD", "INR", 70);
		graph.addEdge("INR", "USD", 0.014);
		graph.addEdge("AUD", "USD", 2);
		graph.addEdge("USD", "AUD", 0.50);
		graph.addEdge("EUR", "AUD", 2);
		graph.addEdge("AUD", "EUR", 0.5);
		graph.addEdge("EUR", "USD", 1.5);
		graph.addEdge("USD", "EUR", 0.667);
		
		CurrencyConvertor cc = new CurrencyConvertor();
		System.out.println(cc.convert("INR", "INR",1));
	

	}

	public double convert(String sCurr, String dCurr, double unit) {
		int source = Graph.getID(sCurr);
		int dest = Graph.getID(dCurr);
		List<Double> sumList = new ArrayList<Double>();
		
		boolean[] visit = new boolean[4];
		for (int i = 0; i < 4; i++)
			visit[i] = false;
		
		convertLogic(source, dest, sumList, 1, visit);
		Collections.sort(sumList);
		return unit*sumList.get(sumList.size()-1);
	}

	
	public void convertLogic(int source, int dest, List<Double> sumList, double sum, boolean[] visit) {
		visit[source] = true;
		List<Edge> edges = graph.vertices.get(source);
		for (int i = 0; i < edges.size(); i++) {
			if (edges.get(i).vertex == dest)
				sumList.add(sum * edges.get(i).weight);
			else if (visit[edges.get(i).vertex] != true) {

				convertLogic(edges.get(i).vertex, dest, sumList, sum * edges.get(i).weight, visit.clone());
			}
		}
	}
}
