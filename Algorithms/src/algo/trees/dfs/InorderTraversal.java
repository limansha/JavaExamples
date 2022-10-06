package algo.trees.dfs;

public class InorderTraversal {
	static int idx = -1;
	public static void main(String[] args) {
		int []nodes = new int[] {1,2,3,4,5,6}; //inorder left root right
		TreeNode root = createTree(nodes);
		System.out.println(root.data);
	}

	private static TreeNode createTree(int[] nodes) {
		idx++;
		if(nodes[idx] == -1) return null;
		TreeNode node = new TreeNode(null,nodes[idx]+"",null);
		node.left = createTree(nodes);
		node.right = createTree(nodes);
		
		return null;
	}

}
