package Inhertitance;

public class FatherSon extends Son{



	 public static void main(String[] args) throws CloneNotSupportedException {

	        Father father = new Son();
	        System.out.println(father.i); //why 1?
	        System.out.println(father.getI());  //2
	        System.out.println(father.j);  //why 10?
	        System.out.println(father.getJ()); //why 10?

	        System.out.println();

	        Son son = new Son();
	      
	        System.out.println(son.i);  //2 
	        System.out.println(son.getI()); //2
	        System.out.println(son.j); //20
	        System.out.println(son.getJ()); //why 10?
	        Father f = (Father)father.clone();
	        System.out.println(f.toString());
	        System.out.println(f.i); //why 1?
	        System.out.println(f.getI());  //2
	        System.out.println(f.j);  //why 10?
	        System.out.println(f.getJ()); //why 10?
	        System.out.println(son.getClass().getName().toLowerCase());
	        System.out.println(son.getClass().getSimpleName());
	      System.out.println(f.toString());
	      System.out.println(father.toString());
	 
	 }  
	
}