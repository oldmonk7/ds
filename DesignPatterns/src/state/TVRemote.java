package state;

public class TVRemote {

	State current;
	State ons;
	State off;
	
	public TVRemote(){
		 
		ons = new OnState(this);
		off = new OffState(this);
		current = off;
		
	}
	
	
	public void tvOn(){
		System.out.println("Powering On.........");
		current.press();
		setState(ons);
		
		
	}
	
	public void tvOff(){
		System.out.println("Powering Off..........");
		current.press();
		setState(off);
	}
	
	void setState(State state){
		
		current = state;
		//System.out.println(current.getClass().getName());
		
		
		
	}
	
	State getOnState(){
		
		return ons;
	}
	
    State getOffState(){
		
		return off;
	}
	
	
}
