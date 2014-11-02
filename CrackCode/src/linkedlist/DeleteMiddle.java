package linkedlist;

// Delete the middle node if only access to the middle node is given.

public class DeleteMiddle {

	public static boolean deleteMiddle(Node n){
		
		if(n ==null || n.next == null){
			return false;
		}
		
		Node next = n.next;
		n.data = next.data;
		n.next = next.next;
		return true;
		
		/*while(n.next!=null){
			n.data = n.next.data;
			//n.next = n.next.next;
		   n=n.next;
		   if(n.next == null){
			   
		   }
		}
		
		
		n = null;
		*/
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Node head = Node.populateList(9);
     Node.printList(head);
     Node curr = head;
     int i=0;
	 while(i < 4 ){
		 curr = curr.next;
		 i++;
	 }
     deleteMiddle(curr);
     System.out.println("");
     Node.printList(head);
     
	 
	}

	
	
}
