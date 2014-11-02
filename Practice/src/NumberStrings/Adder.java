package NumberStrings;

public class Adder {
	
	public static void main(String args[])
	
	{
		int sum=0;
		if (args.length<=1)
		{System.out.println("Enter atleast two dude!");}
		else{
		for(int i=0; i<args.length; i++)
			
		{
			sum+=Integer.parseInt(args[i]);
			
			
		}
		
		System.out.println(sum);
		}
	}
	
	
	

}
