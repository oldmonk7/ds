package string;

/* Insert character and shift the whole string by n using char array*/

public class InsertChars {

	
	
	public static void main(String[] args) {
	
		char[] string = "It seems like it should be simpler than it is to get a method's execution time. Is there a Timer utility class for things like timing how long a task takes, etc? Most of the searches on Google return results for timers that schedule threads and tasks, which is not what I want.                                                                                                                                ".toCharArray();
		
		 //System.out.println();
		int trueLength = "It seems like it should be simpler than it is to get a method's execution time. Is there a Timer utility class for things like timing how long a task takes, etc? Most of the searches on Google return results for timers that schedule threads and tasks, which is not what I want.".lastIndexOf('.')+1;
		
		long startTime = System.nanoTime();
		string = insert(string, trueLength);
		long endTime = System.nanoTime();

	    System.out.println(endTime - startTime);
		
	    startTime = System.nanoTime();
	    string = insertOptimized(string, trueLength);
		endTime = System.nanoTime();

	    System.out.println(endTime - startTime);
		
		
		for(int i=0; i<string.length; i++){
			System.out.print(string[i]);
		}
		
	}
	
	
	
	
	
	



 public static char[] insert(char[] string, int trueLength){
	 for(int i=0; i<trueLength; i++){
			
			if(string[i] == ' '){
				
				
				trueLength+=2;
				
				for(int j=trueLength-1; j>=i+1; j-- ){
					
					string[j] = string[j-2];
				}
			
				string[i++]='%';
				string[i++]='2';
				string[i++]='0';
			
				
			}
			 
		} 
	 return string;
    }
 

    public static char[] insertOptimized(char[] str, int trueLength ){
	
    	int spaceCount=0;
    	for(int i=0; i<trueLength; i++){
    		if(str[i]==' '){
    			spaceCount++;
    		}
    	}
    	
    	 //int newLength = trueLength + spaceCount*2;
    	for(int i=trueLength-1;i>spaceCount*2; i-- ){
    		if(str[i]==' '){
    			--spaceCount;
    			str[i+spaceCount*2] =  '%';
    			str[i+1+spaceCount*2]= '2';
    			str[i+2+spaceCount*2] ='0';
    		}
    		else{
    		str[i+spaceCount*2]=str[i];
    		}
    	}
    	
	return str;
   }
}
