import java.util.HashMap;

public class HashMapExample6 {

//	How do you remove a key-value pair from a HashMap if and only if the specified key is currently mapped to given value?
//			Another version of remove() method which takes two arguments – one is key and another one is value, removes the mapping for the specified key only if it is currently mapped to given value.
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("1", 123);
		map.put("2", 54);
		map.put("3", 985);
		map.put("4", 256);
		map.put("5", 47);
		map.put("6", 85);
		System.out.println("Size Before " + map.size());
        //Removes the mapping for the key '6' only if it is currently mapped to '85'
		map.remove("6", 85);
		System.out.println("Size After " + map.size());

	}
}
