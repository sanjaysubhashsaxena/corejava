import java.util.HashMap;

public class HashMapExample1 {
	public static void main(String[] args) {
		// 4 different methods for creating HashMap
		
		//1. Creating HashMap with default initial capacity and load factor
		HashMap<String,Integer> map1=new HashMap<>();
		
		//2. Creating HashMap with 30 as initial capacity
		HashMap<String,Integer> map2=new HashMap<>(30);

		 //3. Creating HashMap with 30 as initial capacity and 0.5 as load factor
		HashMap<String,Integer> map3=new HashMap<>(30,0.5f);

		//4. Creating HashMap by copying another HashMap
		HashMap<String,Integer> map4=new HashMap<>(map1);

	}
}
