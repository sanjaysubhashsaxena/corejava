import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample3 {
	public static void main(String[] args) {
		// How do you add given key-value pair to HashMap if and only if it is not
		// present in the HashMap?
		HashMap<String, String> map = new HashMap<>();
		map.put("Hi", "Sam");
		map.put("How", "me");

		// Adds key-value pair only if it is not present in map
		String key = "Work";
		if (!map.containsKey(key)) {
			map.put("Work", "Ops");
		}

		// Adds key-value pair only if it is not present in map

		map.putIfAbsent("ifAbsent", "working");

		Set<Entry<String, String>> records = map.entrySet();
		for (Entry<String, String> eachEntry : records) {
			System.out.println(eachEntry.getKey() + " " + eachEntry.getValue());
		}
	}
}
