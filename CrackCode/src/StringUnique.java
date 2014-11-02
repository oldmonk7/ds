

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
		
		System.out.println(findUnique("abcd"));
		
	}
	
}
