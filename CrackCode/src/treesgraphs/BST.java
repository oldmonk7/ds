package treesgraphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import treesgraphs.IsBalanced;

public class BST {

	public Node root;
	//public Node left, right;

	static class Node{

		private int val;
		Node left, right;
		boolean visited;

		Node(int val, Node left, Node right){

			this.val =val;
			this.left = left;
			this.right = right;
		}

		Node(int val){

			this.val =val;
			this.left = null;
			this.right = null;
		}
	}

	public static Node insert(Node root, int val){

		if(root == null){
			root = new Node(val);

		}

		else{

			if(val >= root.val){

				root.right = insert(root.right, val);
				//System.out.println(root.val);
			}

			if(val < root.val){

				root.left = insert(root.left, val);
				//System.out.println(root.val);
			}
		}

		return root;



	}

	public static Node populateTree(int numOfNodes, Node root){

		//Node root = insert(null, (int)(Math.random() * 10));

		for(int i=0; i<numOfNodes; i++){
			insert(root, (int)(Math.random() * 100));
		}

		return root;
	}

	public static void printInorder(Node root){

		if(root == null){
			//System.out.println(root.val);
			return;
		}

		printInorder(root.left);
		System.out.print(root.val + " ");
		printInorder(root.right);


	}

	public static void printPreOrder(Node root){

		if(root == null){
			//System.out.println(root.val);
			return;
		}

		System.out.print(root.val+" ");

		printInorder(root.left);

		printInorder(root.right);



	}

	public static int size(Node root){
		if(root == null){
			return 0;
		}
		else{

			return size(root.left) + 1 + size(root.right);

		}

	}

	public static int height(Node root){

		if(root == null){
			return -1;
		}

		else{

			int ldepth = height(root.left);
			int rdepth = height(root.right);

			return Math.max(ldepth, rdepth) +1;
		}

	}

	public static int minValue(Node root){

		while(root.left != null){

			root = root.left;
		}
		return root.val;

	}

	public static int maxValue(Node root){

		while(root.right != null){

			root = root.right;
		}
		return root.val;

	}

	public static void InOrderRecursive(Node root){

		Stack<Node> stack = new Stack<Node>();
		//stack.push(root);

		while(root != null){

			stack.push(root);
			root = root.left;

		}



		while(!stack.isEmpty()){

			root = stack.pop();
			System.out.print(root.val+ " ");

			if(root.right != null){
				root = root.right;

				while(root != null){

					stack.push(root);
					root = root.left;

				}

			}


		}
	}

	static boolean hasPathSum(Node node, int sum){

		if(node == null){
			return (sum==0);
		}
		else{

			sum = sum - node.val;
			return (hasPathSum(node.left, sum) || hasPathSum(node.right, sum));

		}

	}


	private static void printPaths(Node node, int[] path, int pathLen) { 
		if (node==null) return;

		// append this node to the path array 
		path[pathLen] = node.val; 
		pathLen++;

		// it's a leaf, so print the path that led to here 
		if (node.left==null && node.right==null) { 
			printArray(path, pathLen); 
		} 
		else { 
			// otherwise try both subtrees 
			printPaths(node.left, path, pathLen); 
			printPaths(node.right, path, pathLen); 
		} 
	}

	/** 
		 Utility that prints ints from an array on one line. 
	 */ 
	private static void printArray(int[] ints, int len) { 
		int i; 
		for (i=0; i<len; i++) { 
			System.out.print(ints[i] + " "); 
		} 
		System.out.println(); 
	} 


	public static boolean isBalanced(Node root){

		if(root == null){
			return true; }

		if(Math.abs(height(root.left) - height(root.right)) > 1){
			return false;
		}
		else{

			return isBalanced(root.left) &&	isBalanced(root.right);


		}
	}

	public static boolean DFS(Node root, int target){

		Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        root.visited = true;
        
        while(!stack.isEmpty()){
         
        	if(root.left != null){
        	stack.push(root.left);
        	root.visited = true;
        	if(root.val == target){return true;}
        	root = root.left;
        	
        	}
        	else{
        		root = stack.pop();
        	}
        	
        	
        	
        	
        	
        	
        	
        	
        	
        }
        
        return false;


	}
	
	public static boolean DFSRecursive(Node root, int target){
		
		if(root == null){return false;}
		if(root.val == target){return true;}
			
			return DFSRecursive(root.left, target) || DFSRecursive(root.right, target);
			
			
		
	}

	public static void printBFS(Node root) {
		
		LinkedList<Node> q1 = new LinkedList<Node>();
		LinkedList<Node> q2 = new LinkedList<Node>();
	    q1.addLast(root);
	    
	    while((!q1.isEmpty()) ||(!q2.isEmpty())){
	    	while(!q1.isEmpty()){
	    	root = q1.removeFirst();
	    	System.out.print(root.val+ " ");
	    	
	    	if(root.left != null)
	    		q2.addLast(root.left);
	    	
	    	
	    	if(root.right != null)
	    		q2.addLast(root.right);
	    	}
	    	
	    
	  
	    while(!q2.isEmpty()){
	    	q1.addLast(q2.removeFirst());
	    }
	    }
	    
	}



	public static void main(String[] args){

		BST tree = new BST();
		tree.root = insert(null, (int)((Math.random()) * 100) );
		Node node = tree.root;
		populateTree(9, node);
		printInorder(tree.root);
		System.out.println("");
		InOrderRecursive(tree.root);
		System.out.println("");
		printPreOrder(tree.root);
		System.out.println("");
		System.out.println(size(tree.root));
		System.out.println(height(tree.root));
		System.out.println("BFS");
		printBFS(tree.root);
		//IsBalanced obj = new IsBalanced();
		//System.out.println(obj.height(tree.root));
		//System.out.println(minValue(tree.root));
		//System.out.println(maxValue(tree.root));
		/*for(int i=0; i<1000; i++){
				int sum = (int)(Math.random()*500);
				if(hasPathSum(tree.root, sum)){
					System.out.println(sum);
				}

			}*/

		if(isBalanced(tree.root)){
			int[] path = new int[1000]; 
			printPaths(tree.root, path, 0); 
			System.out.println("");

		}
		for(int i=0; i<50; i++){
		System.out.println(i + " " + DFSRecursive(tree.root, i));
	}
	}
}



