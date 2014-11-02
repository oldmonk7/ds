package dynamicP;

import java.util.ArrayList;

public class Permutations {

	public static ArrayList<String> getPerms(String str){
		
		if(str == null){ return null;}
		
		ArrayList<String> perms = new ArrayList<String>();
		//base case
		if(str.length() == 0){
		
			perms.add("");
			return perms;
			
		}
		
		char singleChar = str.charAt(0);
		
		String remaining = str.substring(1);
		
		ArrayList<String> words = getPerms(remaining);
		
		for(String word : words){
			
			for(int i=0; i<=word.length(); i++){
				
				String temp = insertCharAt(word,i, singleChar);
				perms.add(temp);
				
			}
			
			
			
		}
		
		return perms;
		
	}
	
	public static String insertCharAt(String word, int i, char c){
		
		return word.substring(0,i) + c + word.substring(i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> perms = getPerms("abcderfgh");
		
		for(String str : perms){
			System.out.println(str);
		}

	}

}
