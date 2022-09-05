package algo.graphs;

public class DisjointSetDS {
	static int n = 6;
	static int parent [] = new int[n];
	static int rank[] = new int[n];
    public static void main(String[] args) {
    	//tc order(1) SC Order(n)
		storeInDisjointDS();
		
		if(findParent(2) != findParent(3)) {
			System.out.println("different component");
		}
		else {
			System.out.println("same component");
		}
		
		union(3,5);
		if(findParent(3) != findParent(5)) {
			System.out.println("different component");
		}
		else {
			System.out.println("same component");
		}
	}

	private static void storeInDisjointDS() {
		//initialise parent and rank array;
	
		for(int i =0;i<n;i++) {
			parent[i] = i;
			rank[i] =0;
		}
	
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
