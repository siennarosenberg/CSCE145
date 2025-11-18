package Lab5AB;

public class StringsAndLoops {

	public static void main(String[] args) {
		System.out.println("=== STRING LOOP LAB TESTING ===\n");
		System.out.println("\nPART 1 TESTS:");
		System.out.print("Count 'l' in 'hello': ");
		System.out.println(countCharacter("hello",'l'));
		System.out.print("Vowels in 'hello world': ");
		System.out.println(countVowels("hello world"));
		System.out.print("Reverse 'hello': ");
		System.out.println(reverseString("hello"));
		
		System.out.println("\nPART 2 TESTS:");
		System.out.print("Caeser cipher 'abc' shift 1: ");
		System.out.println(caesarCipher("abc", 1));
		System.out.print("Caeser cipher 'XYZ' shift 3: ");
		System.out.println(caesarCipher("XYZ", 3));
		System.out.print("Capitalize 'hello world java': ");
		System.out.println(capitalizeWords("hello world java"));
		System.out.print("Remove duplicates 'aabbccdd': ");
		System.out.println(removeConsecutiveDuplicates("aabbccdd"));

		System.out.println("\nPART 3 TESTS:");
		System.out.print("Find 'ell' in 'hello': index ");
		System.out.println(findSubstring("hello", "ell"));
		System.out.print("Find 'xyz' in 'hello': index ");
		System.out.println(findSubstring("hello", "xyz"));
		System.out.print("Is 'racecar' a palindrome? ");
		System.out.println(isPalindrome("racecar"));
		System.out.print("Is 'hello' a palindrome? ");
		System.out.println(isPalindrome("hello"));
		System.out.print("Count 'ab' in 'ababab': ");
		System.out.println(countPattern("ababab", "ab"));

		System.out.println("\nPART 4 TESTS:");
		System.out.print("Compress 'aaabbc': ");
		System.out.println(compressString("aaabbc"));
		System.out.print("Compress 'aabbccddee': ");
		System.out.println(compressString("aabbccddee"));
		System.out.print("Are 'listen' and 'silent' anagrams: ");
		System.out.println(areAnagrams("listen", "silent"));
		System.out.print("Are 'hello' and 'bello' anagrams: ");
		System.out.println(areAnagrams("hello", "bello"));
		System.out.print("Zip 'abc' and '123': ");
		System.out.println(zipStrings("abc", "123"));
		System.out.print("Zip 'hello' and 'world!': ");
		System.out.println(zipStrings("hello", "world!"));
		
		System.out.println("\nPART 5 TESTS:");
		System.out.print("The longest common prefix of 'flower' and 'flight' is: ");
		System.out.println(longestCommonPrefix("flower", "flight"));
		System.out.print("The longest common prefix of 'calculator' and 'calculus' is: ");
		System.out.println(longestCommonPrefix("calculator", "calculus"));
		System.out.print("The longest common suffix of 'running' and 'walking' is: ");
		System.out.println(longestCommonSuffix("running", "walking"));
		System.out.print("The longest common suffix of 'biology' and 'analogy' is: ");
		System.out.println(longestCommonSuffix("biology", "analogy"));
		System.out.print("The title case of 'the lord of the rings' is: ");
		System.out.println(toTitleCase("the lord of the rings"));
		System.out.print("The title case of 'harry potter and the goblet of fire' is: ");
		System.out.println(toTitleCase("harry potter and the goblet of fire"));
		System.out.print("The title case of 'to be or not to be' is: ");
		System.out.println(toTitleCase("to be or not to be"));


	}
	
	//part 1:
	//counts how many times a specific character appears in a string using a for loop
	public static int countCharacter(String str, char target) {
		int count = 0;
		int length = (str.length())-1;
		for (int i=0; i<length; i++) {
			if (str.charAt(i) == target) {
				count++;
			}
		}
		return count;
	}
	
	//counts how many vowels there are in a string, ignoring case
	public static int countVowels(String str) {
		int count = 0;
		int length = (str.length())-1;
		for (int i=0; i<length; i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}
	
	//reverses the order of a string
	public static String reverseString(String str) {
		//keep adding the string values from front to back (make a new string and add each char in the opposite order)
		String newStr = "";
		for (int index=(str.length())-1; (newStr.length() < str.length()); index--) {
			//add the last index (which is the length-1) to newStr and reduce length each time in order to move to the next index (back to front)
			char addChar = str.charAt(index);
			newStr += addChar;
		}
		return newStr;
	}
	
	//part 2:
	//shifts each letter by a given number of positions
	public static String caesarCipher(String str, int shift) {		
		String newStr = "";
		for (int i=0; i < str.length(); i++) {
			shift = shift%26;
			char c = str.charAt(i);
			int charInt = 0;
			//if the string's character is lower case
			if (str.charAt(i)>=97 && str.charAt(i)<=122) {
				charInt = ((c-'a')+shift)%26+'a';
				newStr += (char) charInt;
			}
			//if the string's character is upper case
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				charInt = ((c-'A')+shift)%26+'A';
				newStr += (char) charInt;
			}
		}
		return newStr.toString();
	}
	
	//capitalizes the first letter of each word in a sentence
	public static String capitalizeWords(String str) {
		String[] words = str.split(" ");
		String newStr = "";
		for (int i = 0; i<words.length; i++) {
			String iWord = words[i];
			//update the individual word (words[i]) to be the first index upper case and the rest of the word to be the same it was before
			iWord = Character.toUpperCase(iWord.charAt(0)) + iWord.substring(1);
			newStr += iWord + " ";
		}
		return newStr;
	}
	
	//removes consecutive duplicate characters from a string &&
	public static String removeConsecutiveDuplicates(String str) {
		String newStr = "";
		// make sure the string has a value and that its length is more than 0
		if (str != null && str.length()>0) {
			newStr += str.charAt(0);
			for (int i = 1; i<str.length(); i++) {
				if (str.charAt(i) != str.charAt(i-1)) {
					newStr += str.charAt(i);
				}
			}
		}
		return newStr;
	}
	
	//part 3:
	//finds the first occurrence of a substring within a larger string using nested loops
	public static int findSubstring(String text, String pattern) {
		//tests to see if there are any edge cases where it definitely wouldn't be found
		if (text == null || pattern == null) {
			return -1;
		}
		if (pattern.length() == 0) {
			return -1;
		}
		for (int i = 0; i<=text.length() - pattern.length(); i++) {
			//checking if each index of text matches those of the pattern
			//also makes sure that it is possible for the pattern to be found in the text
			//by comparing lengths of the two strings
			boolean found = true;//found is true if one of the same indices has been spotted
			//found stays true until it becomes (or doesn't become false)
			for (int j=0; j<pattern.length(); j++) {
				if (text.charAt(i+j) != pattern.charAt(j)) {
					found = false;
					break;//start over to move on to the next index of text
				}
			}
			if (found) {
				return i;
			}
		}
		return -1;
	}
	
	//compares characters from both ends moving inward
	public static boolean isPalindrome(String str) {
		boolean pal = false;
		for (int i = 0; i<(str.length()/2); i++) {
			//i is the index that is either added or subtracted from the indices to go from index 0 to the last index minus 1 continuing inwards
			if (str.charAt(i) == str.charAt((str.length()-1)-i)) {
				pal=true;
			}
			else {
				pal=false;
			}
		}
		return pal;
	}
	
	//counts how many times a specific pattern appears in a string
	public static int countPattern(String text, String pattern) {
		int count = 0;
		if (text == null || pattern == null) {
			count = 0;
		}
		if (pattern.length() == 0) {
			count = 0;
		}
		for (int i = 0; i<=text.length() - pattern.length(); i++) {
			//checking if each index of text matches those of the pattern
			//also makes sure that it is possible for the pattern to be found in the text
			//by comparing lengths of the two strings
			boolean match = true;
			for (int j=0; j<pattern.length(); j++) {
				if (text.charAt(i+j) != pattern.charAt(j)) {
					match = false;
					break;//start over to move on to the next index of text
				}
			}
			if (match) {
				count++;
			}
		}
		return count;
	}

	
	//uses loops to count consecutive characters (aaabbc -> a3b2c1)
	public static String compressString(String str) {
		int frequency = 1;
		String compressed = "";
		if (str == null) {
			compressed = "";
		}
		for (int i = 1; i<str.length(); i++) {
			if (str.charAt(i) == str.charAt(i-1)) {
				//comparing current index to index before
				frequency++;
			}
			else {
				//adding the char at index (i-1) and the string version of the frequency
				compressed += str.charAt(i-1) + String.valueOf(frequency);
				//reseting the frequency for the next char
				frequency = 1;
			}
		}
		//last char + its frequency
		compressed += str.charAt(str.length()-1) + String.valueOf(frequency);
		return compressed;
	}
	
	//checks if two strings are anagrams
	public static boolean areAnagrams(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		
		String str1Copy = str1;
		
		for (int i=0; i<str1.length(); i++) {
			char c = str2.charAt(i);
			int equalIndex = str1Copy.indexOf(c); //where the char of one string matches a char of another string
			//.indexOf() is a way of testing if any index in a String is equal to a certain value (char)

			if (equalIndex == -1) {
				return false;
			}
			str1Copy = str1Copy.substring(0, equalIndex) + str1Copy.substring(equalIndex+1); //removing letters that have already been matched
		}
		return true;
	}
	
//	merges two strings by alternating characters
	public static String zipStrings(String str1, String str2) {
		String combo = "";
		int i = 0;
		
		for (i=0; i<str1.length() && i<str2.length(); i++) {//one of the strings will eventually end it (when i>= them)
			combo += str1.charAt(i);
			combo += str2.charAt(i);
		}
		
		//excess from either str1 or str2 (depending on which is longer/was first)
		if (i < str1.length()) {
			combo += str1.substring(i);
		}
		else if (i<str2.length())	{
			combo += str2.substring(i);
		}
		return combo;
	}
	
	//finds the longest common prefix between two strings
	
	//go through each index of two words
	public static String longestCommonPrefix(String str1, String str2) {
		int length = 0;
		String prefix = "";
		if (str1.length()<=str2.length()) {
			length = str1.length();
		}
		else {
			length = str2.length();
		}
		for (int i = 0; i<=length ; i++) {
			//goes through each index to the minimum length of the strings until the chars don't match anymore
			if (str1.charAt(i) == str2.charAt(i)) {
				prefix += str1.charAt(i);
				continue;
			}
			else {
				break;
			}
		}
		return prefix;	
	}
	
	//finds the longest common suffix between two strings
	public static String longestCommonSuffix(String str1, String str2) {
		int length = 0;
		String suffix = "";
		if (str1.length()<=str2.length()) {
			length = str1.length();
		}
		else {
			length = str2.length();
		}
		for (int i = length-1; i>=0 ; i--) {
			if (str1.charAt(i) == str2.charAt(i)) {
				suffix += str1.charAt(i);
				continue;
			}
			else {
				break;
			}
		}
		
		//reverse String code:
		String newSuffix = "";
		for (int index=(suffix.length())-1; (newSuffix.length() < suffix.length()); index--) {
			//add the last index (which is the length-1) to newSuffix and reduce length each time in order to move to the next index (back to front)
			char addChar = suffix.charAt(index);
			newSuffix += addChar;
		}
		return newSuffix;	
	}

	
	//convert a string to title case
	//capitalize all then convert common words back to lower case, switch case
	public static String toTitleCase(String str) {
		//normal capitalization code:
		String[] words = str.split(" ");
		String upStr = "";
		for (int i = 0; i<words.length; i++) {
			String iWord = words[i];
			//update the individual word (words[i]) to be the first index upper case and the rest of the word to be the same it was before
			iWord = Character.toUpperCase(iWord.charAt(0)) + iWord.substring(1);
			upStr += iWord + " ";
		}	
		
		//pattern finder code:
		//patterns to search for: "and" "or" "the" "a" "an" "in" "on" "at" "of" "to"
		////goal: convert these words back to all lower case
		//put if statement in a for loop to test each individual word until length (-1) (starting AFTER index 0)
		String[] upWords = upStr.split(" ");
		String titleStr = "";
		for (int j=1; j<upWords.length; j++) {
			String jWord = upWords[j];
			//if statement to avoid empty elements / out of bounds errors 
			if (jWord.length()==0) {
				continue;
			}
			//check every word (except the first) of upStr through jWord and see if it matches any common word pattern
			//if it does, convert the letter back to lower case
			switch (jWord) {
				case "And"://each case represents a different "common word"
					jWord = Character.toString(Character.toLowerCase(jWord.charAt(0))) + jWord.substring(1);
					//making the first index of the second word of the title lower case then a string to add back to the rest of the word
					titleStr += jWord + " ";
					//adding the corrected word back
					break; //exiting the switch
				case "Or":
					jWord = Character.toString(Character.toLowerCase(jWord.charAt(0))) + jWord.substring(1);
					titleStr += jWord + " ";
					break;
				case "The":
					jWord = Character.toString(Character.toLowerCase(jWord.charAt(0))) + jWord.substring(1);
					titleStr += jWord + " ";
					break;
				case "A":
					jWord = Character.toString(Character.toLowerCase(jWord.charAt(0))) + jWord.substring(1);
					titleStr += jWord + " ";
					break;
				case "An":
					jWord = Character.toString(Character.toLowerCase(jWord.charAt(0))) + jWord.substring(1);
					titleStr += jWord + " ";
					break;
				case "In":
					jWord = Character.toString(Character.toLowerCase(jWord.charAt(0))) + jWord.substring(1);
					titleStr += jWord + " ";
					break;
				case "On":
					jWord = Character.toString(Character.toLowerCase(jWord.charAt(0))) + jWord.substring(1);
					titleStr += jWord + " ";
					break;
				case "At":
					jWord = Character.toString(Character.toLowerCase(jWord.charAt(0))) + jWord.substring(1);
					titleStr += jWord + " ";
					break;
				case "Of":
					jWord = Character.toString(Character.toLowerCase(jWord.charAt(0))) + jWord.substring(1);
					titleStr += jWord + " ";
					break;
				case "To":
					jWord = Character.toString(Character.toLowerCase(jWord.charAt(0))) + jWord.substring(1);
					titleStr += jWord + " ";
					break;
				default:
					titleStr += jWord + " ";

			}
		}
		titleStr = upWords[0]+" "+titleStr;
		return titleStr;
	}
	
}