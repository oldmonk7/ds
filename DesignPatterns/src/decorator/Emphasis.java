package decorator;

public class Emphasis extends Decorator implements Component{
	
	private String addedState;
	
	public Emphasis(Component c){
		
		super(c);
		
		
	}
	
	public String operation(){
		addedState = super.operation();
		return addedBehavior();
		
	}
	
	public String addedBehavior(){
		
		return "<em>"+addedState+"</em>";
		
	}

}
