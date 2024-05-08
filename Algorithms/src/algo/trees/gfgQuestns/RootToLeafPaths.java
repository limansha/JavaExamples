package algo.trees.gfgQuestns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//https://www.geeksforgeeks.org/problems/root-to-leaf-paths/1

public class RootToLeafPaths {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            Node root = Node.inputTree(br);
            
            Solution obj = new Solution();
            ArrayList<ArrayList<Integer>> res = Solution.Paths(root);
            
            IntMatrix.print(res);
            
        }
    }
}

    class Node
    {
        int data;
        Node left;
        Node right;
    
        Node(int data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    
        public static Node buildTree(String str)
        {
            // Corner Case
            if(str.length()==0 || str.charAt(0)=='N')
                return null;
    
            // Creating array of Strings from input
            // String after spliting by space
            String ip[] = str.split(" ");
    
            // Create the root of the tree
            Node root = new Node(Integer.parseInt(ip[0]));
    
            // Push the root to the queue
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
    
            // Starting from the second element
            int i = 1;
            while(queue.size()>0 && i < ip.length)
            {
    
                // Get and remove the front of the queue
                Node currNode = queue.peek();
                queue.remove();
    
                // Get the current node's value from the string
                String currVal = ip[i];
    
                // If the left child is not null
                if(!currVal.equals("N"))
                {
    
                    // Create the left child for the current node
                    currNode.left = new Node(Integer.parseInt(currVal));
                    // Push it to the queue
                    queue.add(currNode.left);
                }
    
                // For the right child
                i++;
                if(i >= ip.length)
                    break;
    
                currVal = ip[i];
    
                // If the right child is not null
                if(!currVal.equals("N"))
                {
    
                    // Create the right child for the current node
                    currNode.right = new Node(Integer.parseInt(currVal));
    
                    // Push it to the queue
                    queue.add(currNode.right);
                }
                i++;
            }
    
            return root;
        }
    
        public static Node inputTree(BufferedReader br) throws IOException
        {
            return buildTree(br.readLine().trim());
        }
    
        public static void inorder(Node root)
        {
            if (root == null)
               return;
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    
    
    class IntMatrix
    {
        public static int[][] input(BufferedReader br, int n, int m) throws IOException
        {
            int[][] mat = new int[n][];
    
            for(int i = 0; i < n; i++)
            {
                String[] s = br.readLine().trim().split(" ");
                mat[i] = new int[s.length];
                for(int j = 0; j < s.length; j++)
                    mat[i][j] = Integer.parseInt(s[j]);
            }
    
            return mat;
        }
    
        public static void print(int[][] m)
        {
            for(var a : m)
            {
                for(int e : a)
                    System.out.print(e + " ");
                System.out.println();
            }
        }
    
        public static void print(ArrayList<ArrayList<Integer>> m)
        {
            for(var a : m)
            {
                for(int e : a)
                    System.out.print(e + " ");
                System.out.println();
            }
        }
    }
    
    // } Driver Code Ends
    //main solution starts here 
    class Solution {
        public static ArrayList<ArrayList<Integer>> Paths(Node root) {
            ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
            Stack<Integer> s = new Stack<Integer>();
            dfs(root,ans,s);
            return ans;
        }
        public static void dfs(Node root,ArrayList<ArrayList<Integer>> ans,Stack<Integer> s){
            if(root.left == null && root.right == null){ //checking leaf node
                s.push(root.data);
                ArrayList<Integer> a = new ArrayList<Integer>(s);
                ans.add(a);
                if(!s.isEmpty()) s.pop(); //removing leaf node added
                return;
            }
            if(root != null){
                s.push(root.data);
                if(root.left != null) dfs(root.left,ans,s);
                if(root.right != null) dfs(root.right,ans,s);
                s.pop(); //removing non leaf node after processing all the leaf nodes
            }
        }
    }
            
    
