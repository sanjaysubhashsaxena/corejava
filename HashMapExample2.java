import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample2 {
	public static void main(String[] args) {
//		How do you add key-value pairs to HashMap?

		// Creating HashMap with default initial capacity and load factor.
		HashMap<String, String> map = new HashMap<>();
		// Inserting key-value pairs to map using put() method
		map.put("Name", "xyz");
		map.put("College", "clg");
		map.put("Year", "1st Year");

		// Printing key-value pairs
		Set<Entry<String, String>> records = map.entrySet();

		for (Entry<String, String> singleEntry : records) {

			System.out.println("singleEntry==>" + singleEntry.getKey() + " " + singleEntry.getValue());

		}
		System.out.println("-------------------------");

		// Creating another HashMap
		HashMap<String, String> anotherMap = new HashMap<>(map);
		anotherMap.put("More", "Adding more details");
		anotherMap.put("Extra", "Adding extra details");

		Set<Entry<String, String>> records2 = anotherMap.entrySet();
		for (Entry<String, String> eachEntry : records2) {
			System.out.println("anotherEntry==>" + eachEntry.getKey() + " " + eachEntry.getValue());
		}
		System.out.println("-------------------------");
		
	}
}
