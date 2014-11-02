package linkedlist;

import java.util.ArrayList;
//Remove duplicates from an unsorted linked list
import java.util.List;

public class RemoveDuplicate {
	
	public static Node removeDuplicate(Node head){
		
		Node n = head;
		Node previous = head;
		List<Integer> track = new ArrayList<Integer>();
		//track.add(n.data);
		
		while(n != null){
			
		if(track.contains(n.data)){
			previous.next = n.next;
			
		}	
		else{
		track.add(n.data);
		
		
		previous = n;
		
		}
		n = n.next;
		}
		return previous;
		
		
		
	}
	
	public static Node removeDuplicateNoBuffer(Node head){
		
		Node current= head;
		while(current != null){
			
			Node runner = current;
			while(runner.next != null){
				
				if(runner.next.data == current.data){
					runner.next = runner.next.next;
				}
				else{
					runner = runner.next;
				}
			}
			current = current.next;
		}
		return head;
	}
	
	public static void main(String[] args){
		
		Node head = Node.populateList(5);
		Node newHead = head;
		Node.printList(head);
		long start = System.nanoTime(); 
		removeDuplicate(head);
		long end = System.nanoTime();
		System.out.println(end-start);
		start = System.nanoTime(); 
		removeDuplicateNoBuffer(newHead);
		end = System.nanoTime();
		System.out.println(end-start);
		System.out.println("");
		Node.printList(head);
	}
	

}
