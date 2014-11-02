package linkedlist;

import java.util.Date;
import java.util.LinkedList;

public class AnimalShelter {
	
   LinkedList<Animal> animals = new LinkedList<Animal>();
	
	class Animal{
		
		String type;
		Date time;
		
		public Animal(String type){
			
			this.type = type;
			time = new Date();
		}
	}
	
     void enqueue(String type){
    	 
		
		animals.addLast(this.new Animal(type));
		
	}
	
	Animal dequeueAny(){
		
		return animals.removeFirst();
	}
	
	Animal dequeuDog(){
		
		for(Animal s : animals){
			if(s.type.equalsIgnoreCase("Dog")){
				animals.remove(s);
				return s;
			}
			
		}
		return null;
	}
	
Animal dequeuCat(){
		
		for(Animal s : animals){
			if(s.type.equalsIgnoreCase("Cat")){
				animals.remove(s);
				return s;
			}
			
		}
		return null;
	}
	
 void printList(){
	 
	 for( Animal s : animals){
		 System.out.print(s.type +" "+s.time.getDate()+ "->");
	 } 
	 System.out.println("");
 }

	public static void main(String[] args) {
		
		AnimalShelter ani = new AnimalShelter();
		
		ani.enqueue("Dog");
		ani.enqueue("Cat");
		ani.enqueue("Cat");
		ani.enqueue("Dog");
		ani.enqueue("Cat");
		ani.enqueue("Cat");
		
		ani.enqueue("Cat");
		ani.enqueue("Dog");
		ani.enqueue("Cat");
		
		ani.printList();
		
		ani.dequeueAny();
		
		ani.printList();
		
		ani.dequeuDog();
		
		ani.printList();
		

	}

}
