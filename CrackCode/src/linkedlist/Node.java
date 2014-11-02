package linkedlist;

public class Node {

	Node next = null;
	int data;
	
	public Node(int data){
		this.data = data;
		this.next = null;
	}
	
	void appendToTail(int data){
		Node end = new Node(data);
		Node n = this;
		
		while(n.next != null){
			n = n.next;
			
		}
		
		n.next = end;
		
		
	}
	
	public Node deleteNode(Node head, int data){
		
		Node n = head;
		
		if(n.data == data){
			return head.next;
		}
		
		while(n.next != null){
			if(n.next.data == data){
				n.next = n.next.next;
				return head;
			}
			
			n=n.next;
		}
		
		return head;
	}
	
	public static Node populateList(int n){
		
		Node head = new Node((int)(Math.random()*10));
		Node node=head;
		for(int i=0; i<n-1; i++){
			
		   Node newNode = new Node((int)(Math.random()*10));
		   	node.next = newNode;
		   	node = newNode;
			
		}
		return head;
	}
	
	public static void printList(Node head){
		Node n = head;
		while(n != null){
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println("");
	}
}
