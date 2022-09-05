package algo.trees.dfs;

import java.util.Stack;

public class DFSIntro {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(new TreeNode(new TreeNode(new TreeNode(null,"D",null),"C",null),"B",new TreeNode(null,"F",null)),"A",
				new TreeNode(new TreeNode(new TreeNode(null,"H",null),"G" ,new TreeNode(null,"I",null)),"E",new TreeNode(null,"J",null)));
		printDFS(root);
	}
	private static void printDFS(TreeNode root) {
		//preorder
		if(root == null ) {
			return;
		}
		System.out.println(root.data);
		printDFS(root.left);
		printDFS(root.right);
		
	}

}
