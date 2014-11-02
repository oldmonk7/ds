import java.util.HashMap;
import java.util.Map;


public class HashMapTest {
	
	static HashMap<String,Integer> map = new HashMap<String, Integer>();
	
	
	
	 Boolean findRepeat(String word){
		if(map.containsKey(word) && map.get(word) == 1){
			return true;
		}
		else map.put(word, map.containsKey(word) ?  map.get(word)+1:1);
		return false;
	}
	

	public static void main(String[] args) throws SecurityException, NoSuchMethodException {
		// TODO Auto-generated method stub
		HashMapTest hash = new HashMapTest();
		hash.map.put("word", 1);
		for(Map.Entry<String, Integer> entry : hash.map.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
		//System.out.println(hash.getClass().getMethod("findRepeat", String.class));
		
		String[] arr = "I am a disco dancer you are not a dancer".split(" ");
		
		for (String word : arr){
			
			if(hash.findRepeat(word)) System.out.println(word);
		}
          
	}

}
