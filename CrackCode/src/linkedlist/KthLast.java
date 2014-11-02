package linkedlist;

public class KthLast {
	
	class IntWrapper{
		
		int i=0;
	}

	public static int kthLast(Node head, int k){
		Node n=head;
		int length=0;
		while(n!=null)
		{
			length++;
			n= n.next;
		}
		if(length < k){
			System.out.println("Length is less then K");
			return 0;
		}
       n=head;
       int current=0;
       while(n != null){
    	   if(length-current==k){
    		   return n.data;
    	   }
    	   else {
    		   n=n.next;
    		   current++;
    	   }
       }
       System.out.println("Not found");
       return 0;
		
	}
	
	public static int kthLastRecursive(Node head, int k){
		
		if(head==null){
			return 0;
		}
		 int i = kthLastRecursive(head.next, k) + 1;
		if(i==k){
			System.out.println(head.data);
		     
		}
		
		return i;
		
		
	}
	
	public static Node KthLastRecursiveRef(Node head, int k, IntWrapper i ){
		
		if(head == null){
			return null;
		}
		
		Node nd = KthLastRecursiveRef(head.next, k, i); 
		i.i = i.i + 1;
		if(i.i == k){
			return head;
		}
		
		return nd;
		
	}
	
	public static int KthLastRunner(Node head, int k){
		
		Node run = head;
		Node curr  = head;
		
		while(k > 0){
			k--;
			run = run.next;
			
		}
		
		while(run != null){
			run=run.next;
			curr = curr.next;
		}
		
		return curr.data;
		
		
	}
	
	public static void main(String[] args){
		
		KthLast k = new KthLast();
		IntWrapper i = k.new IntWrapper();
		Node head = Node.populateList(10);
        Node.printList(head);		
        System.out.println();
		System.out.println(kthLast(head, 6));
		System.out.println(kthLastRecursive(head, 6));
		System.out.println(KthLastRecursiveRef(head, 6, i).data);
		System.out.println(KthLastRunner(head, 6));
		
	}
	
}
