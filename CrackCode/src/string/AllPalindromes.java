package string;

import java.util.HashSet;
import java.util.Set;

public class AllPalindromes {
	
	public static int solution(String S) {
        // write your code in Java SE 7
    
        int total = 0;
        
        for(int i=0; i<S.length(); i++){
            
            for(int j=i+1; j< S.length(); j++){
                
                if(isPalindrome(S.substring(i,j+1)))
                    {total++;
                 System.out.println(i + "," + j);
                    }
                 }
            
            
        }
        
        return total;
        
    }
	
	public static int palindromes(final String input) {

	     //final Set<String> result = new HashSet<String>();
          int count = 0;
	     for (int i = 0; i < input.length(); i++) {
	         // expanding even length palindromes:
	         count = expandPalindromes(count,input,i,i+1);
	         // expanding odd length palindromes:
	         count = expandPalindromes(count,input,i,i);
	     } 
	     return count;
	  }

	  public static int expandPalindromes(int count, final String s, int i, int j) {
	      while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
	    	    if(s.substring(i,j+1).length() > 1) 
	               {count++;}
	    	    
	            i--; j++;
	      }
	      return count;
	  }
	  
	  
    
    public static boolean isPalindrome(String sub){
        
        for(int i = 0; i<sub.length()/2; i++){
            
            if(sub.charAt(i) != sub.charAt(sub.length()-1-i))
                return false;
        }
        
        return true;
        
        
    }
    
    public static void main(String[] args){
    	
    	//System.out.println(solution("baababa"));
    	
    	 System.out.println(palindromes("baababa"));
    	
    	
    	
    	
    }
	
	
	
	
	
	
	

}
