package composite;

public class MenuItem implements MenuComponent{

	private String itemName;
	
	public MenuItem(String name){
		
		itemName = name;
	}
	
	
	@Override
	public void operation() {
		System.out.println(itemName);
	}
	
	@Override
	public void getChild(int i) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void add(MenuComponent mc) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remove(MenuComponent mc) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
