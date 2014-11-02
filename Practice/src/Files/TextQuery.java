package Files;

import java.util.ArrayList;


public class TextQuery{
	
	public static void main(String args[]){

	
		
		ArrayList<String> data= DataTool.getContentsAsArrayList("/Users/shankey/apps/workspace/ActualInput.txt"); 
		
		System.out.println(data.get(0));
		
		for(int i=1;i<2*Integer.parseInt(data.get(0));i=i+2)
		{
		  if(checkSubstring(data.get(i),data.get(i+1)))	
		  {System.out.println("1");}
		  else
		  {System.out.println("0");}	
			
		}
	
	
	
}
public static boolean checkSubstring(String to, String in){
	
	String tos=to.toLowerCase();
	String ins = in.toLowerCase();
	String[] parts = ins.split(" ");
	
	for (String part : parts) {
		if (part.contains(tos))
		 return true;
		
			
		}
	return false;
	}
	
	
	
	
		
		
		
		
		
		
	}
