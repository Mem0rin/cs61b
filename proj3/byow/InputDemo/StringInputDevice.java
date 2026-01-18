<<<<<<< HEAD
package byow.InputDemo;

/**
 * Created by hug.
 */
public class StringInputDevice implements InputSource  {
    private String input;
    private int index;

    public StringInputDevice(String s) {
        index = 0;
        input = s;
    }

    public char getNextKey() {
        char returnChar = input.charAt(index);
        index += 1;
        return returnChar;
    }

    public boolean possibleNextInput() {
        return index < input.length();
    }
}
=======
package byow.InputDemo;

/**
 * Created by hug.
 */
public class StringInputDevice implements InputSource  {
    private String input;
    private int index;

    public StringInputDevice(String s) {
        index = 0;
        input = s;
    }

    public char getNextKey() {
        char returnChar = input.charAt(index);
        index += 1;
        return returnChar;
    }

    public boolean possibleNextInput() {
        return index < input.length();
    }
}
>>>>>>> 4a87fd2036aa5d906d7f1c8bdda2844be55c14bd
