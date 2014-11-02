package decorator;

public class H1 extends Decorator implements Component{
	
	
		
		private String addedState;
		
		public H1(Component c){
			
			super(c);
			
			
		}
		

		public String operation(){
			addedState = super.operation();
			return addedBehavior();
			
		}
		
		public String addedBehavior(){
			
			return "<h1>"+addedState+"</h1>";
			
		}

	

}
