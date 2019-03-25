package arraysstrings;

import java.util.Arrays;

public class ArraysStrings {

    public boolean isUnique(String str) {
        if (str.length() == 0) {
            throw new IllegalArgumentException();
        }
        if (str.length() == 1) {
            return true;
        }
        for (int i = 0; i < str.length() - 1; i++) {
            String currentChar = Character.toString(str.charAt(i));
            String restOfStr = str.substring(i + 1);
            if (restOfStr.contains(currentChar)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Determines whether two strings are permutations of each other.
     * Case insensitive, whitespace insensitive.
     *
     * @param  str1 first string
     * @param  str2 second string
     * @return      <code>true</code> if the strings are permutations of each other
     *              <code>false</code> otherwise
     */
    public boolean isPermutation(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        }
        char[] str1Array = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] str2Array = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
        if (str1Array.length != str2Array.length) {
            return false;
        }
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        return Arrays.equals(str1Array, str2Array);

    }


}
