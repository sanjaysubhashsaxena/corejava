import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExample5 {
	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		map.put("1", 500);
		map.put("2", 401);
		map.put("3", 601);
		//System.out.println("Values :"+map.values());
		Collection<Integer> values = map.values();
		//Retrieving the Collection view of values present in map
        for (Integer value : values) 
        {
            System.out.println(value);
        }

		Set<String> keySet=map.keySet();
		//Retrieving the Key Set
		for(String value:keySet) {
			System.out.println(value);
		}
		
		//Removing the mapping for the key 'ONE'
        System.out.println("Size before :"+map.size());
        map.remove("3");
        System.out.println("Size after :"+map.size());
	}
}
