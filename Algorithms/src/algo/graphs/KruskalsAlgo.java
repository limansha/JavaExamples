package algo.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class KruskalsNode {
	int weight;
	int node1;
	int node2;

	public KruskalsNode(int weight, int KruskalsNode1, int KruskalsNode2) {
		super();
		this.weight = weight;
		this.node1 = KruskalsNode1;
		this.node2 = KruskalsNode2;
	}

	public int getWeight() {
		return weight;
	}

	public int getNode1() {
		return node1;
	}

	public int getNode2() {
		return node2;
	}

}

class KruskalsNodeComparator implements Comparator<KruskalsNode> {

	@Override
	public int compare(KruskalsNode o1, KruskalsNode o2) {
		if (o1.getWeight() > o2.getWeight())
			return 1; // swap;
		else if (o1.getWeight() < o2.getWeight())
			return -1; // no change
		return 0;
	}

}

public class KruskalsAlgo {
	static int n = 5;
	
	static int []parent = new int[n];
	static int []rank = new int[n];
	static ArrayList<KruskalsNode> mst = new ArrayList<KruskalsNode>();
	
	public static void main(String[] args) {
		ArrayList<KruskalsNode> adj = new ArrayList<KruskalsNode>();

		adj.add(new KruskalsNode(2, 0, 1));
		adj.add(new KruskalsNode(6, 0, 3));
		adj.add(new KruskalsNode(8, 1, 3));
		adj.add(new KruskalsNode(3, 1, 2));
		adj.add(new KruskalsNode(5, 1, 4));
		adj.add(new KruskalsNode(7, 2, 4));
		KruskalsAlgo obj = new KruskalsAlgo();
		
		for(int i=0;i<n;i++) {
			parent[i] = i;
			rank[i] = 0;
		}
		obj.KruskalAlgorithm(adj, n);
	}

	private void KruskalAlgorithm(ArrayList<KruskalsNode> adj, int n) {
		Collections.sort(adj, new KruskalsNodeComparator()); //sorted array
		int minCost = 0;
		for(int i =0;i<n;i++) {
			int u = adj.get(i).getNode1();
			int v = adj.get(i).getNode2();
			if(findParent(u) != findParent(v)) {
				minCost += adj.get(i).getWeight();
				System.out.println("added edge between "+ u +" -> "+ v );
				union(u,v);
			}
		}
		System.out.println(minCost);
	
	}
	
	static int findParent(int node){
		if(node == parent[node]) return node;
		return parent[node] = findParent(parent[node]);
	}
	static void union(int u,int v) {
		u = findParent(u);
		v = findParent(v);
		
		if(rank[u] < rank[v]) {
			parent[u] = v;
		}
		else if (rank[v] < rank[u]) {
			parent[v] = u;
		}
		else {
			parent[v] = u; //choosing u to be the parent so increase the rank of u
			rank[u]++;
		}
	}
}
