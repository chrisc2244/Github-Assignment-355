/*
What it does: This program takes in a string and returns and integer representing the length of the longest substring
without repeating characters.

How it works: First, the string is checked to see if it is empty. If it is, 0 is returned. If not, it converts
the string to an array of characters called currentSubstring to store the characters of the current
substring being evaluated. An arrayList called counterList is also created to store the lengths of all the
substrings encountered so far.
The function iterates through the char array, checking to see if the current character 'c' is already present in
the currentSubstring. If it isn't, the character is added to the currentSubstring. If it is,
the function adds the current size of currentSubstring to the counterList, then removes all characters
in the currentSubstring up to and including the first occurrence of the 'c'.
After the loop is complete, the maximum value in the counterList is called,
which represents the longest substring without repeating characters.
 */

import java.util.ArrayList;
import java.util.Collections;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {

        if (!s.isEmpty()) {
            char[] stringToCharacters = s.toCharArray();
            ArrayList<Character> currentSubstring = new ArrayList<>();
            ArrayList<Integer> counterList = new ArrayList<>();
            for (char c : stringToCharacters) {
                if (currentSubstring.contains(c)) {
                    counterList.add(currentSubstring.size());
                    currentSubstring.subList(0, currentSubstring.indexOf(c) + 1).clear();
                    currentSubstring.add(c);
                } else {
                    currentSubstring.add(c);
                }
            }
            counterList.add(currentSubstring.size());
            return Collections.max(counterList);
        } else {
            return 0;
        }
    }
}


