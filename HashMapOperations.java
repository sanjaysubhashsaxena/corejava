package poi;

import java.util.*;

public class HashMapOperation {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "Sanjay");
		hm.put(102, "Saxena");
		hm.put(103, "BLR");
		//EntryElementInHashMap(hm);
		//RemovingElementFromHashMap(hm);
		ReplacingElementInHashMap(hm);
	}

	private static void ReplacingElementInHashMap(HashMap<Integer, String> hm) {
		//hm.replace(101, "Sam");
		//hm.replace(101, "Sanjay", "Sanjaya");
		hm.replaceAll((k,v)->"TEST");
		PrintHashMap(hm);
	}

	private static void RemovingElementFromHashMap(HashMap<Integer, String> hm) {
		//hm.remove(101);
		hm.remove(101, "Sanjay");
		PrintHashMap(hm);
	}

	private static void EntryElementInHashMap(HashMap<Integer, String> hm) {

		System.out.println("Element Present in the HashMap");
		PrintHashMap(hm);

		hm.putIfAbsent(104, "Karnataka");
		System.out.println("After add new Element in the hashmap");
		PrintHashMap(hm);
		System.out.println("Created new HashMap");
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
		hm2.putIfAbsent(105, "College");
		hm2.putAll(hm);
		PrintHashMap(hm2);
	}
	
	private static void PrintHashMap(HashMap<Integer, String> hm) {
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
