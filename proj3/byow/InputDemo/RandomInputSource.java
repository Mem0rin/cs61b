<<<<<<< HEAD
package byow.InputDemo;

import edu.princeton.cs.introcs.StdDraw;

import java.util.Random;

/**
 * Created by hug.
 */
public class RandomInputSource implements InputSource {
    Random r;

    public RandomInputSource(Long seed) {
        r = new Random(seed);
    }

    /** Returns a random letter between a and z.*/
    public char getNextKey() {
        return (char) (r.nextInt(26) + 'A');
    }

    public boolean possibleNextInput() {
        return true;
    }
}
=======
package byow.InputDemo;

import edu.princeton.cs.introcs.StdDraw;

import java.util.Random;

/**
 * Created by hug.
 */
public class RandomInputSource implements InputSource {
    Random r;

    public RandomInputSource(Long seed) {
        r = new Random(seed);
    }

    /** Returns a random letter between a and z.*/
    public char getNextKey() {
        return (char) (r.nextInt(26) + 'A');
    }

    public boolean possibleNextInput() {
        return true;
    }
}
>>>>>>> 4a87fd2036aa5d906d7f1c8bdda2844be55c14bd
