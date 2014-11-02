package string;
/* Compress a string by writing its frequency after each character
 * e.g aaabbcccccde will be a3b2c4d1e1s
 */
import java.util.ArrayList;
import java.util.List;

public class Compress {
	
	public static String compressBest(String str){
		
		int size = calcSize(str);
		if(size > str.length())
			return str;
		
		char[] array = new char[size];
		int count = 1, j=0;
		for(int i=1; i<str.length(); i++){
        
			if(str.charAt(i)==str.charAt(i-1)){
				count++;
			}
			else{
				array[j++]=str.charAt(i-1);
				j = setChar(array,count,j);
				count = 1;
				
			}
			
		}
		array[j++] = str.charAt((str.length()-1));
		setChar(array, count, j);
		return String.valueOf(array);
		
		
	}
		public static int setChar(char array[], int count, int j){
			
			String countString = String.valueOf(count);
			for(int i=0; i<countString.length(); i++){
				array[j++] = countString.charAt(i);
				
			}
			return j;
			
		}
	
	public static int calcSize(String str){
		int size=0, count=1;
		for(int i=1;i<str.length() ;i++){
			
			if(str.charAt(i)==str.charAt(i-1)){
				count++;
			}
			else{
				size=(int) (size + 1+ Math.floor(Math.log10((double)count))+1);
				count=1;		
				
			}
			
		}
		return (int) (size + 1+ Math.floor(Math.log10((double)count))+1);
		
		
	}
	
	public static String compressBetter(String str){
		
		StringBuffer compressed = new StringBuffer();
		int count=1;
		for(int i=1; i<str.length(); i++){
			
			if(str.charAt(i)==str.charAt(i-1)){
				count++;
			}
			else{
				compressed.append(str.charAt(i-1));
				compressed.append(count);
				count=1;
			}
			
			
			
			
		}
		compressed.append(str.substring(str.length()-1));
		compressed.append(count);
		if(compressed.length() < str.length())
		   return compressed.toString();
		   return str;
		
	}
	
	public static String compressBad(String toCompress){
		String compressed="";
	
		int count=1;
		for(int i=1; i < toCompress.length(); i++){
			
			if(toCompress.charAt(i) == toCompress.charAt(i-1)){
				count++;
			}
			else{
				compressed = compressed + toCompress.charAt(i-1) + count;
			
				count=1;
				
			}
						
		}
		if(compressed.length() < toCompress.length())
		   return compressed + toCompress.substring(toCompress.length()-1) + count;
		  return toCompress;
		
	} 
	
	

	public static void main(String[] args) {
		
		
		long startTime = System.nanoTime();
		String compressed = compressBetter("kkkklhffgfgffdddddddddddddddqqqwaadjgggggggghfrrtryyeeeee");
		long endTime = System.nanoTime();
		 System.out.println(endTime - startTime);
		 
		startTime = System.nanoTime();
		compressed = compressBad("kkkklhffgfgffdddddddddddddddqqqwaadjgggggggghfrrtryyeeeee");
		endTime = System.nanoTime();
		 System.out.println(endTime - startTime);
		 
		 startTime = System.nanoTime();
			compressed = compressBest("kkkklhffgddqqqwaadjggggggggggggggggggghfrrtryyee");
			endTime = System.nanoTime();
			 System.out.println(endTime - startTime);
		
		System.out.print(compressed);
		// TODO Auto-generated method stub
		
		
		

	}

}
