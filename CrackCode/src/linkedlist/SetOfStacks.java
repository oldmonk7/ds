package linkedlist;

import java.util.ArrayList;
import java.util.Stack;

public class SetOfStacks {
	
   static ArrayList<Stack<Integer>> set = new ArrayList<Stack<Integer>>();
   static int index = 0;
   static int threshold = 0;
    public static void push(int value){
    	
    	if(set.isEmpty()){
        set.add(new Stack<Integer>());
    	
    	
    }
    	if(threshold <= 10){
    	set.get(index).push(value);
    	
    	}
    	else{
    	threshold = 0;
    	set.get(++index).push(value);
    	}
    	}
    
    static Integer pop(){
    	threshold--;
    	return set.get(index).pop();
    	
    	
    }
    public static void main(String[] args){
    	for(int i=0; i<20; i++){
    		push(i);
    	}
    	for(int i=0; i<20; i++){
    		System.out.println(pop());
    	}
    }
    
}
