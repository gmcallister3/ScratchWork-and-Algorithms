import java.util.HashMap;
import java.util.Map;


//Problem 1.1 (CCI)
//Two algorithms to check if a string has all unique characters
//The first algorithm is O(n)
//The second algorithm is O(n2)
//Where n = length of string

public class UniqueCharacters {
	
	public static boolean unique(String in) {
		Map<Character, Integer> letters = new HashMap<>();
		for (int i = 0; i < in.length();i++) {
			Integer out = letters.put(in.charAt(i), 1);
			if (out != null) {
				return false;
			}
		}
		return true;
	}


	public static boolean unique2(String in) {
		for (int i = 0; i < in.length();i++) {
			Character c1 = in.charAt(i);
			for (int j = 0; j < i;j++) {
				Character c2 = in.charAt(j);
				if (c2 == c1) {
					return false;
				}
			}
		}
		return true;
	}

	//For testing
	// public static void main(String[] args) {
	// 	String test1 = "GGGGG";
	// 	String test2 = "abcdefiz";
	// 	System.out.println("Testing a unique string in unique: " + unique(test1));
	// 	System.out.println("Testing a repeating string in unique: " + unique(test2));
	// 	System.out.println("Testing a unique string in unique2: " + unique2(test1));
	// 	System.out.println("Testing a repeating string in unique2: " + unique2(test2));

	// }
}