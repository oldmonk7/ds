package linkedlist;

//Partition  a list along a node.

public class PartitionList {
	
	public static Node partitionList(Node head, int val){

		Node begin = null;
		Node beginfixed = null;
		Node end = null;
		Node endfixed = null;
		Node pivot = head;
		Node curr = head;
		
		while(pivot.data != val){
			pivot=pivot.next;
		}
		
		while(curr!=null){
			
			if(curr.data < val){
				if(begin == null){
					begin = curr;
					beginfixed = begin;
				}
				else{
				begin.next = curr;
				begin = curr;
				}
			}
				
			else {
				if(end==null){
					end = curr;
					endfixed = end;
				}
				else{
					end.next = curr;
					end = curr;
				}
				 
				
			}
			
			curr = curr.next;
			
		}
			
		
	 if(begin == null){
		 pivot.next = endfixed;
		 return pivot;
	 }
	 else{
		 begin.next = pivot;
		 pivot.next = endfixed;
		 return beginfixed;
	 }
		
	}
	
	public static void main(String[] args){
		
		Node head = Node.populateList(8);
		Node.printList(head);
		System.out.println("");
		Node.printList(partitionList(head, 4));
		
	}

}
