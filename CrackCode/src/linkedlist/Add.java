package linkedlist;

public class Add {
	
	
	public static Node add(Node first, Node second){
		
		int carry = 0;
		int count=1;
		Node head = new Node(0);
          
		Node sum = null;
		while(first != null && second != null){
			
			Node newNode = new Node(0);
			if(sum == null){sum = newNode;}
			else{
			sum.next = newNode;
			sum = sum.next;
			}
			if(first.data + second.data + carry >= 10){
				sum.data = (first.data + second.data + carry)%10;
				carry =1;
			}
			else{
				sum.data = (first.data + second.data + carry)%10;
				carry = 0;
			}
			
			
			if(count++ == 1){
				head = sum;
				head.data = sum.data;
			}
		first = first.next;
		second = second.next;
		//sum = sum.next;
		}
		
	
	
	if(first == null && second!=null){
		
		sum.next = second;
		sum.next.data = second.data +carry;
	}
	else
   if(second == null && first != null){
		
		sum.next = first;
		sum.next.data = first.data +carry;
	}
   else if(carry == 1){
	   sum.next = new Node(0);
	   sum.next.data = carry;
   }
   
   return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node first = Node.populateList(3);
		Node.printList(first);
		Node second = Node.populateList(3);
		Node.printList(second);
		Node sum = add(first, second);
		Node.printList(sum);

	}

}
