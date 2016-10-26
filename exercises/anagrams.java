import java.util.*;
import java.util.Arrays;

//find the amount of non common characters
//increment the first string characters
//decrement the second string characters
//why?
//when you decrement, it removes the common
//characters but provides a mark for the unique chars in the second string

//this avoids collision with duplicates between
//common chars between words and within a word.

//add up all the asolute values

public class anagrams {

	public static void main(String[] args) {

		System.out.println(anagrams("abc", "cdeffffff"));
	}

	public static int anagrams(String str1, String str2) {

		char[] str1_arr = str1.toCharArray();
		char[] str2_arr = str2.toCharArray();
		int[] markedChars = new int[26];
		int nonCommonChars = 0;

		for (char c: str1_arr) {
			markedChars[c - 'a']++;
		}

		for (char c: str2_arr) {
			markedChars[c - 'a']--;
		}

		for (int i : markedChars) {
			nonCommonChars+= Math.abs(i);
		}

       	System.out.println(Arrays.toString(markedChars));

        return nonCommonChars;

	}
}