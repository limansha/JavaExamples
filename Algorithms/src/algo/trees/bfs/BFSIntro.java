package algo.trees.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import algo.trees.dfs.Node;

public class BFSIntro {

	public static void main(String[] args) {
		Node root = new Node(new Node(new Node(new Node(null,"D",null),"C",null),"B",new Node(null,"F",null)),"A",
				new Node(new Node(new Node(null,"H",null),"G" ,new Node(null,"I",null)),"E",new Node(null,"J",null)));
		printBFS(root);
	}

	private static void printBFS(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			root = q.remove();
			System.out.println(root.data);
			if(root.left != null) {
				q.add(root.left);
			}
			if(root.right != null) {
				q.add(root.right);
			}
		}
	}

}
