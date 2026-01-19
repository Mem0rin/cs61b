/**
 * Created with IntelliJ IDEA
 * Description:Exercise 2 & 3: Find the max number in array;
 *
 * @author : Mem0rin
 * Date: 2026-01-18
 * Time: 21:47
 */
public class MaxNumberInArray {
    /** Returns the maximum value from m. */
    
    public static int max(int[] m) {
        int i = 0;
        int maximum = -1;
        while (i < m.length) {
            if (maximum < m[i]) {
                maximum = m[i];
            }
            i = i + 1;
        }
        return maximum;
    }
    
    /** Use a for loop to rewrite the solution. */
    public static int forMax(int[] arr){
        int max = -1;
        for (int i = 0; i < arr.length; i = i + 1) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(forMax(numbers));
    }
}
