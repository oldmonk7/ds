package treesgraphs;

public class IsBalanced {

	public class Node{
		
		int val;
		Node left, right;
		
	}
	
	public static boolean isBalanced(Node root){
		
		if(Math.abs(height(root.left) - height(root.right))>1){
			return false;
		}
		else{
		return isBalanced(root.left) && isBalanced(root.right);
		}
	}
	
	public static int height(Node root){
		
		if(root==null){return -1;}
		
		int ldepth = height(root.left);
		int rdepth = height(root.right);
		
		return 1 + Math.max(height(root.left),height(root.right));
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
