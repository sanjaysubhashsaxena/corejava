import java.util.HashMap;

public class HashMapExample4 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("1", 56);
		map.put("2", 50);
		map.put("3", 60);
		map.put("4", 59);
		
		System.out.println(map.containsKey("4"));
		System.out.println(map.containsValue(56));
		
		//Retrieving the number of key-value pairs present in map
		System.out.println(map.size());
		//Clearing the map
		map.clear();
        //Checking the number of key-value pairs after clearing the map
		System.out.println(map.size());
	}
}
