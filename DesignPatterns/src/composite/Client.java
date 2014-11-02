package composite;

public class Client {

	public static void main(String args[]){
		
		MenuItem cheese = new MenuItem("cheese");
		MenuItem org = new MenuItem("oregano");
		MenuItem butter = new MenuItem("butter");
		MenuItem garlic = new MenuItem("garlic");
		
        MenuComposite menu = new MenuComposite();
        MenuComposite menu1 = new MenuComposite();
        
        menu.add(cheese);
        menu.add(org);
        menu.add(butter);
        //menu.add(menu);
        menu.remove(butter);
        menu1.add(cheese);
        menu1.add(org);
        menu1.add(butter);
        menu.add(menu1);
        
        menu.operation();
		
        
		
		
	}
	
	
	
	
	
}
