package algo.graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;


 class MSTNode {
    protected int v;
    protected int weight;
    MSTNode(int _v, int _w) { v = _v; weight = _w; }
    
    MSTNode() { }
    int getV() { return v; }
    int getWeight() { return weight; }
  
}
 class MSTNodeComparator implements Comparator<MSTNode>{

	    public int compare(MSTNode node1, MSTNode node2) 
	    { 
	        if (node1.weight < node2.weight) 
	            return -1; 
	        if (node1.weight > node2.weight) 
	            return 1; //swap 
	        return 0; //no swap
	    }

}
 
public class PrimsAlgoMinimumSpanningTree {

	public static void main(String[] args) {
		// convert a graph to tree (i.e n MSTNodes n-1 edges) such that where every MSTNode is reacheable by every other MSTNode and the tree has nodeimum edges
		//Algo of prims
		//from MSTNode 0 find the nodeimum adjacent edge and and select the MSTNode which has the nodeimum adjacent edge and add the MSTNode to the check list
		//now check for the other nodeimum edge with in the checklist MSTNodes, select the edge such that it should not form a cycle
		 int n = 5;
	        ArrayList<ArrayList<MSTNode> > adj = new ArrayList<ArrayList<MSTNode> >();
			
			for (int i = 0; i < n; i++) 
				adj.add(new ArrayList<MSTNode>());
				
			adj.get(0).add(new MSTNode(1, 2));
			adj.get(1).add(new MSTNode(0, 2));
			
			adj.get(1).add(new MSTNode(2, 3));
			adj.get(2).add(new MSTNode(1, 3));
			
			adj.get(0).add(new MSTNode(3, 6));
			adj.get(3).add(new MSTNode(0, 6));
			
			adj.get(1).add(new MSTNode(3, 8));
			adj.get(3).add(new MSTNode(1, 8));
			
			adj.get(1).add(new MSTNode(4, 5));
			adj.get(4).add(new MSTNode(1, 5));
			
			adj.get(2).add(new MSTNode(4, 7));
			adj.get(4).add(new MSTNode(2, 7));
			
			primsAlgoBruteForce(n,adj);
			System.out.println("############################");
			primsAlgoOptimised(n,adj);
			
		
		
	}

	private static void primsAlgoOptimised(int n, ArrayList<ArrayList<MSTNode>> adj) {
		int []parent = new int[n];
		int []dist = new int[n];
		boolean []inMst = new boolean[n];
		
		for(int i=0;i<n;i++) {
			parent[i] = -1;
			inMst[i] = false;
			dist[i] = Integer.MAX_VALUE;
		}
		inMst[0] = true;
		dist[0] = 0;
		PriorityQueue<MSTNode> pq = new PriorityQueue<MSTNode>(n,new MSTNodeComparator());
		pq.add(new MSTNode(0,dist[0]));
		  while(!pq.isEmpty())  {
			int node =  pq.poll().getV();
			
			for(MSTNode a : adj.get(node)) {
				if(inMst[a.getV()] ==  false && dist[a.getV()] > a.getWeight()) {
					dist[a.getV()] = a.getWeight();
					parent[a.getV()] = node;
					pq.add(new MSTNode(a.getV(),dist[a.getV()]));
				}
			} 
		}
		for(int i=1;i<n;i++) {
			System.out.println(parent[i]  +" -> "+i);
		}
	}

	private static void primsAlgoBruteForce(int n, ArrayList<ArrayList<MSTNode>> adj) {
		//initialise inMst array, parent and dist
		int []parent = new int[n];
		int []dist = new int[n];
		boolean []inMst = new boolean[n];
		
		for(int i=0;i<n;i++) {
			parent[i] = -1;
			inMst[i] = false;
			dist[i] = Integer.MAX_VALUE;
		}
		inMst[0] = true;
		dist[0] = 0;
		for(int e=0;e<n-1;e++) {
			//find the nodeimum value from distance such that that node is explored
			int nodeValue =Integer.MAX_VALUE;
			int node =0;
			for(int v=0;v<n-1;v++) {
				//nodeValue is used to compare each values and get the minimum out of it in this  v loop
				if(inMst[v] == false && dist[v] < nodeValue) {
					nodeValue = dist[v];
					node = v;
				}
			}
			
			inMst[node] = true;
			
			for(MSTNode a: adj.get(node)) {
				if(inMst[a.getV()] == false && a.getWeight() < dist[a.getV()]) {
					dist[a.getV()] = a.getWeight();
					parent[a.getV()] = node;
				}
			}
		}
		for(int i=1;i<n;i++) {
			System.out.println(parent[i]  +" -> "+i);
		}
	}
	
	

}
