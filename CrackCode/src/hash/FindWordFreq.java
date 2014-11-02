package hash;

import java.util.HashMap;

public class FindWordFreq {
	
	
	public static HashMap<String,Integer> preProcess(String text){
		
	  HashMap<String, Integer> map = new HashMap<String, Integer>();	
	  String[] array = text.toLowerCase().split(" ");
	  
	  for(String word : array){
		  
		  if(!map.containsKey(word)){
			  map.put(word, 1);
		  }
		  else { 
			  map.put(word, map.get(word)+1);
			  }
		  
	  }
		
		return map;		
	}
	

	public static void main(String[] args) {
		
		HashMap<String, Integer> preProcessed = preProcess("I am am a very good coder not true in a good case");
		
		System.out.println("Frequency of good = "+ preProcessed.get("a"));
		
		// TODO Auto-generated method stub

	}

}
