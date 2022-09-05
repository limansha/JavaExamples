package algo.trees.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import algo.trees.dfs.TreeNode;

public class BFSIntro {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(new TreeNode(new TreeNode(new TreeNode(null,"D",null),"C",null),"B",new TreeNode(null,"F",null)),"A",
				new TreeNode(new TreeNode(new TreeNode(null,"H",null),"G" ,new TreeNode(null,"I",null)),"E",new TreeNode(null,"J",null)));
		printBFS(root);
	}

	private static void printBFS(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
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
