package decorator;

public class Client {

	public static void main(String[] args) {
		
		Component obj = new H1(new Emphasis(new Text()));
		String result = obj.operation();
		System.out.println(result);
		
		

	}

}
