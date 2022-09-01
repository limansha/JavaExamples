package algo.trees.dfs;

import java.util.Stack;

public class DFSIntro {

	public static void main(String[] args) {
		Node root = new Node(new Node(new Node(new Node(null,"D",null),"C",null),"B",new Node(null,"F",null)),"A",
				new Node(new Node(new Node(null,"H",null),"G" ,new Node(null,"I",null)),"E",new Node(null,"J",null)));
		printDFS(root);
	}
	private static void printDFS(Node root) {
		//preorder
		if(root == null ) {
			return;
		}
		System.out.println(root.data);
		printDFS(root.left);
		printDFS(root.right);
		
	}

}
