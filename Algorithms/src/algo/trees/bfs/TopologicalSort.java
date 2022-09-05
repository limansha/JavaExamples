package algo.trees.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {

	static int numNodes = 6;
//Topological sort is not possible with DAG (Directed Acyclic graph)
	//450231
	static int[] seq = new int[numNodes];
	static int[] indegree = new int[numNodes];

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

//					for(ArrayList<Integer> i: graph) {
//						System.out.println(i.toString());
//					}
		//write the in degree of all the nodes
		for (int i = 0; i < numNodes; i++) {
			for(Integer adj : graph.get(i)) {
				indegree[adj]++;
			}
		}
		//for(int i : indegree) System.out.print(i);
		bfsTopo(graph,indegree);
		System.out.println("Topological sort using BFS traversal");
		for(int i:seq) {
			System.out.println(i+" ");
		}
	}

	private static void bfsTopo(ArrayList<ArrayList<Integer>> graph, int[] indegree) {
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i =0;i<indegree.length;i++) {
			if(indegree[i] == 0) q.add(i);
		}
		int idx =0;
		while(!q.isEmpty()) {
			int node = (int) q.poll();
			seq[idx++] = node;
			for(int adj : graph.get(node)) {
				indegree[adj]--;
				if(indegree[adj] == 0) q.add(adj);
			}
		}
	}

}
