package decorator;

public class Decorator implements Component{

	public Component decorator;
	
	public Decorator(Component c){
		
		decorator = c;
		
		
	}

	@Override
	public String operation() {
		
		return decorator.operation();
		
	}
	
	
	
	
	
}
