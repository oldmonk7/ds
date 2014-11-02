package linkedlist;

import java.util.Stack;

public class StackWithMin extends Stack<NodeWithMin>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5324813505959099309L;

	public void push(int value){
		
		int newMin = Math.min(value, getMin());
		super.push(new NodeWithMin(value, newMin));
		
	}
	
	public int getMin(){
		if(this.isEmpty()){
			return 0;
		}
		else
		return this.peek().min;
		
	}
	
	
	
}
