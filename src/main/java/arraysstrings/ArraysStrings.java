package arraysstrings;

public class ArraysStrings {

public boolean isUnique(String str) {
    if (str.length() == 0) {
        throw new IllegalArgumentException();
    }
    if (str.length() == 1) {
        return true;
    }
    for (int i = 0; i < str.length()-1; i++) {
        String currentChar = Character.toString(str.charAt(i));
        String restOfStr = str.substring(i+1);
        if (restOfStr.contains(currentChar)) {
            return false;
        }
    }
    return true;
}


}
