package arraysstrings;

import com.google.common.math.BigIntegerMath;
import java.util.*;

public class ArraysStrings {
    private Permutations perms = new Permutations();


    public class Permutations {

        private String[] permutationsArray;
        private int index = 0;

        /**
         * Determines the size of the array and calls the method that collects the permutations.
         * Returns the array when it's done.
         *
         * @param  str  string
         * @return      String[] with the permutations
         */
        private String[] setAndGetPermutationsArray(String str) {
            int factorial = BigIntegerMath.factorial(str.length()).intValue();
            this.permutationsArray = new String[factorial];
            collectPermutations(str, "", permutationsArray);
            return this.permutationsArray;
        }

        /**
         * Recursively collects permutations of a string and saves it to an array.
         *
         * @param  str  string
         * @param  permutation collected permutation
         * @param  array permutations get saved here
         */
        private void collectPermutations(String str, String permutation, String[] array) {
            if (str.length() == 0) {
                array[index] = permutation;
                index++;
            }

            for (int i = 0; i < str.length(); i++) {
                char character = str.charAt(i);
                String restOfStr = str.substring(0, i) + str.substring(i + 1);
                collectPermutations(restOfStr, permutation + character, array);
            }
        }
    }

    /**
     * Determines whether any permutations of a string is a palindrome.
     *
     * @param  string  string
     * @return         <code>true</code> if there is a palindrome
     *                 <code>false</code> otherwise
     **/
    public boolean isPermutationPalindrome(String string) {
        if (string.length() < 2) {
            throw new IllegalArgumentException("String is too short");
        }

        String[] permutations = perms.setAndGetPermutationsArray(string);
        for (String perm: permutations) {
            String reversed = "";
            for (int i = perm.length()-1; i >= 0 ; i--) {
                reversed = reversed + perm.charAt(i);
            }
            if (perm.equals(reversed)) {
                return true;
            }
        }
        return false;
    }



    /**
     * Determines whether every character in a string is unique
     *
     * @param  str  string
     * @return      <code>true</code> if the characters are unique
     *              <code>false</code> otherwise
     */
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


    public static void main(String[] args)
    {
        ArraysStrings as = new ArraysStrings();
    }





}
