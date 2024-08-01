package gravityEng;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class July31 {
	
	public static void main(String[] args) {
		
		String name = "Ashish Anarase";
		
		String given = name.toLowerCase();
		
		Map <Object, Integer> map = new HashMap<>();
		
		for (char c : given.toCharArray()) {
			
			if (Character.isLetter(c)) {
				
				map.put(c, map.getOrDefault(c, 0)+1);
			}
			
		}
		
		for (Entry<Object, Integer> entry : map.entrySet()) {
			
			System.out.println(entry.getKey()+" = "+entry.getValue());
			
		}
		
	}
	

}
