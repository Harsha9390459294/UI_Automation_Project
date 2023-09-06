package PageObjects;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class testQ {
	public static void main(String args[]) {
		
		HashMap<String,Integer> test = new HashMap<>();
		test.put("one", 1);
		test.put("two", 2);
		
		Set<String> keyt = test.keySet();
		
		for(HashMap.Entry<String, Integer> e : test.entrySet()) {
			System.out.println("Key: " + e.getKey()+ " Value: " + e.getValue());
		}
		
		
		
	}

}
