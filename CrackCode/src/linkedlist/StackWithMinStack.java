package linkedlist;

import java.util.Stack;

public class StackWithMinStack extends Stack<Integer>{
	
	public Stack<Integer> stack;
	
	void push(int value){
		
		super.push(value);
		if(value < stack.peek()){
			stack.push(value);
		}
	}
		
		public Integer pop(){
			
			if(this.peek() == stack.peek()){
				return stack.pop();
			}
			return this.pop();
			
			
		}
	}
	

	
	
	
	

