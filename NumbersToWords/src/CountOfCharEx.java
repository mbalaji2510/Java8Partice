import java.util.HashMap;
import java.util.Map;

public class CountOfCharEx {
	
	public static void main(String[] args) {
		
		String input = "hello";
		
		Map<Character, Integer> countMap = new HashMap<>();
		
		
		
		for(int i=0; i<input.length(); i++) {
			
			
			
			if(countMap.containsKey(input.charAt(i))) {
				
				countMap.put(input.charAt(i), countMap.get(input.charAt(i))+1 );
			}
			
			else{
				
				countMap.put(input.charAt(i),1);
				
			}
			
		}
		
		System.out.println("map data "+countMap);
		
	}

}
