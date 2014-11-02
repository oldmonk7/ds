package string;

public class StringUnique {

	static boolean findUnique(String str){
		for(int i=0;i<(str.length()-1); i++){
			for(int j = i+1; j<str.length(); j++){
				if(str.charAt(i)==str.charAt(j))
					return false;
				
			}
		}
		return true;
		
		
	}
	public static void main(String args[]){
		long startTime = System.nanoTime();
		//code
		
		System.out.println(findUnique("abcdefghijklmnopqrstuvwxyz656752367591827634789287"));
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
		
	}
	

}
