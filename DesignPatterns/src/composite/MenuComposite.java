package composite;

import java.util.List;
import java.util.ArrayList;

public class MenuComposite implements MenuComponent {

	
	List<MenuComponent> menu = new ArrayList<MenuComponent>();
	
	
	public void operation() {
		
	for(MenuComponent i : menu){
		
		i.operation();
		
		
	}		
	}

	public void getChild(int i) {
		System.out.println("In Get Child");
		
	}

	@Override
	public void add(MenuComponent mc) {
		
		menu.add(mc);
		
	}

	@Override
	public void remove(MenuComponent mc) {
		menu.remove(mc);
		
	}

}
