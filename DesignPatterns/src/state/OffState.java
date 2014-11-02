package state;

public class OffState implements State {

	
	private TVRemote tvr;
	
	public OffState(TVRemote tvr){
		this.tvr =tvr; 
		
	}
	@Override
	public void press() {
		
		System.out.println("Power ON");
	    tvr.setState(tvr.getOnState());
		
	}
	
	

}
