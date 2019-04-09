import arraysstrings.ArraysStrings;
import org.junit.*;


public class ArrayStringsTest {

    private ArraysStrings arraysStrings = new ArraysStrings();

        @Test
        public void isUniqueTrueIfAllUniqueCharacters(){
            Assert.assertTrue(arraysStrings.isUnique("Hkapr,lte493"));
        }

        @Test
        public void isUniqueFalseIfNotUniqueCharacters() {
            Assert.assertFalse(arraysStrings.isUnique("458d8"));
        }

        @Test
        public void isPermutationTrueIfPermutation() {
            Assert.assertTrue(arraysStrings.isPermutation("Kmdukkr tyG", "gRkt      mKydkU"));
        }

        @Test
        public void isPermutationFalseIfNotPermutation() {
            Assert.assertFalse(arraysStrings.isPermutation("Khddjkytgn", "Khdjrkyto"));
        }

        @Test
        public void isPalindromePermutationFalseIfNotPalindrome() {
            Assert.assertFalse(arraysStrings.isPermutationPalindrome("nem"));
        }

        @Test
        public void isPalindromePermutationTrueIfPalindrome(){
            Assert.assertTrue(arraysStrings.isPermutationPalindrome("gnunug"));
        }


}
