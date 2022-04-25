import java.util.HashMap;

public class HashMapExample7 {
	public static void main(String[] args) {

		String name="Sanjay";
		char[] charName=name.toCharArray();
		HashMap<Character, Integer> map=new HashMap<>();
		char firstRepeatedChar = 0;
		for(char letter:charName) {
			if(map.containsKey(letter)) {				
				map.put(letter, map.get(letter)+1);
				firstRepeatedChar=letter;
				break;
			} else {
				map.put(letter, 1);
			}
		}
	
		for(char letter:charName) {
			
			if(map.get(letter)==1) {
				System.out.println("First Non Repeated Character : "+letter);
				break;
			}
		}
		System.out.println("First Repeated Character : "+firstRepeatedChar);
		
		
		
	}
}
