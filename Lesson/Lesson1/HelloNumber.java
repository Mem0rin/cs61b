/**
 * @author Memo
 */

public class HelloNumber {
    /**输出从零到N的累加求和，即0 + 1 + 2 + 3 + ... + N。*/
    public static void main(String[] args){
        int x = 0;
        int sum = 0;
        while (x < 10){
            sum += x;
            x = x + 1;
            System.out.print(sum + " ");
        }
    }
}
