import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample9 {
	public static void main(String[] args) {
		//Creating the HashMap 
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        //Getting synchronized Map
        Map<String,Integer> syncMap=Collections.synchronizedMap(map);
	}
}
