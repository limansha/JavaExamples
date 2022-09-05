package algo.graphs.pojo;

import java.util.Comparator;


public class WeightedNode {

	int v;
	int weight;

	public WeightedNode(int _v, int _w) {
		v = _v;
		weight = _w;
	}

	WeightedNode() {
	}

	int getV() {
		return v;
	}

	int getWeight() {
		return weight;
	}

}
class WeightedNodeComparator implements Comparator<WeightedNode>{

    public int compare(WeightedNode node1, WeightedNode node2) 
    { 
        if (node1.weight < node2.weight) 
            return -1; //no change
        if (node1.weight > node2.weight) 
            return 1;  //swap
        return 0; //equal
    }

}