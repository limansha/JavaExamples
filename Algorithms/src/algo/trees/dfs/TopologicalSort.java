package algo.trees.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class TopologicalSort {
	static int numNodes = 6;

	static boolean[] visited = new boolean[numNodes];
	static Stack stack = new Stack();
	public static void main(String[] args) {
		// i/p graph
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < numNodes; i++) {
			graph.add(new ArrayList<Integer>());
		}

		graph.get(2).add(3);

		graph.get(3).add(1);

		graph.get(4).add(0);
		graph.get(4).add(1);

		graph.get(5).add(0);
		graph.get(5).add(2);

//				for(ArrayList<Integer> i: graph) {
//					System.out.println(i.toString());
//				}
		Arrays.fill(visited, false);
		ArrayList<Integer> seq = new ArrayList<Integer>();
		for (int i = 0; i < numNodes; i++) {
			if (!visited[i]) {
				dfsTopo(i, graph, visited);
			}
		}
		System.out.println("Topological sort using DFS traversl");
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+ " ");
		}
	}

	private static void dfsTopo(int n, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {
		visited[n] = true;
		for(int adj:graph.get(n)) {
			if(!visited[adj]) {
				dfsTopo(adj,graph,visited);
			}
		}
		stack.push(n);
	}

}
