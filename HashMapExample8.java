import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample8 {
	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		map.put("1", 56);
		map.put("2", 100);
		map.put("3", 60);
		map.put("4", 70);
		map.put("5", 75);
		map.put("6", 58);
		map.put("7", 59);

		Set<Entry<String, Integer>> entries=map.entrySet();
		for(Entry<String, Integer> eachEntry:entries) {
			System.out.println(eachEntry.getKey()+" "+eachEntry.getValue());
		}
		map.replace("7", 85);
		map.put("6", 200);
		map.replace("5", 75, 95);
		//If key is not present in the map than there is no effect on map
		map.replace("8", 612);
		System.out.println("--------------------------");
		for(Entry<String, Integer> eachEntry:entries) {
			System.out.println(eachEntry.getKey()+" "+eachEntry.getValue());
		}
	}
}
