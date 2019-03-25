import arraysstrings.ArraysStrings;
import org.junit.*;


public class ArrayStringsTest {

    ArraysStrings arraysStrings = new ArraysStrings();

        @Test
        public void isUniqueTrueIfAllUniqueCharacters(){
            Assert.assertTrue(arraysStrings.isUnique("Hkapr,lte493"));
        }

        @Test
        public void isUniqueFalseIfNotUniqueCharacters() {
            Assert.assertFalse(arraysStrings.isUnique("458d8"));
        }


}
