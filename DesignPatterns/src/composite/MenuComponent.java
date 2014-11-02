package composite;

public interface MenuComponent {

	void operation();
	
	void add(MenuComponent mc);
	
	void remove(MenuComponent mc);
	
	void getChild(int i);
	
	
}
