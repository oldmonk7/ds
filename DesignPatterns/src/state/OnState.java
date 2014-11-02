package state;

public class OnState implements State{
	
private TVRemote tvr;
	
	public OnState(TVRemote tvr){
		this.tvr =tvr; 
		
	}
	
	public void press(){
		
		System.out.println("Power OFF");
	    tvr.setState(tvr.getOffState());
		
		
	}
	
	

}
