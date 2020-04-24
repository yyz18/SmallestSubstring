import java.util.ArrayList;
import java.util.Arrays;

// Given a string and a set of characters, return the shortest substring containing all the characters in the set.
//For example, given the string “figehaeci” and the set of characters {a, e, i}, you should return “aeci”. 
//If there is no substring containing all the characters in the set, return null.

public class SmallestSubstring {

	public static void main(String[] args) {

		String str = "figehaeci";
		String[] patSet = { "a", "e", "i" };

		System.out.println(findSubstring(str, patSet));
	}

	public static String findSubstring(String string, String[] patSet) {

		ArrayList<String> subStrList = new ArrayList<String>();

		String shortestSubStr = null;

		for (int i = 0; i < string.length(); i++) {
			subStrList.add(string.substring(i));
		}

		for (int j = 0; j < subStrList.size(); j++) {

			String subStr = subStrList.get(j);
			String[] stringSet = subStr.split("");

			if (Arrays.asList(stringSet).containsAll(Arrays.asList(patSet))) {

				if (shortestSubStr == null) 
					shortestSubStr = subStr;

				if (subStr.length() < shortestSubStr.length())
					shortestSubStr = subStr;
			}
		}
		
		return shortestSubStr;
	}
}
