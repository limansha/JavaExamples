package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import trees.BinaryTree.Node;

public class BFSTraversal {
    public static void main(String[] args) {
        trees.BinaryTree bt = new BinaryTree();
        Node tree = BinaryTree.callTree();
        ArrayList<ArrayList<Integer>> levelOrder = new ArrayList<ArrayList<Integer>>();
        bfsTraversal(tree, levelOrder);
        System.out.println(levelOrder);
    }

    private static void bfsTraversal(Node root, ArrayList<ArrayList<Integer>> levelOrder) {
        if(root == null) return;
        Queue<Node> q = new ArrayList<Node>();


        
    }

}
