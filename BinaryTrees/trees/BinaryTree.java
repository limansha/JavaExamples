//Build a Tree from its Preorder traversal
package trees;

import java.util.ArrayList;

public class BinaryTree {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class CreateBinaryTree {
		static int idx = -1;

		public static Node buildTree(int nodes[]) {
			idx++;
			if (nodes[idx] == -1) {
				return null; // base condition
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			return newNode;
		}
	}

	public static Node callTree() {
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		/*
		 * representing tree in preorder traversal and it is important to give -1 left
		 * or right node is null
		 */
		CreateBinaryTree tree = new CreateBinaryTree();
		Node root = tree.buildTree(nodes);
		System.out.println(root.data);
		return root;
	}

	public static void main(String[] args) {
		Node root = callTree();
		// preorder traversal display
		ArrayList<Integer> nodes = new ArrayList<>();
		display(root, nodes);
		System.out.println(nodes.toString()); //prints in preorder
	}

	private static void display(Node root, ArrayList<Integer> nodes) {
		if (root == null)
			return;
		nodes.add(root.data);
		if (root.left != null)
			display(root.left, nodes);
		if (root.right != null)
			display(root.right, nodes);
	}
}
