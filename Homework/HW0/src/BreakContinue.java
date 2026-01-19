/**
 * Created with IntelliJ IDEA
 * Description:
 * Write a function windowPosSum(int[] a, int n)
 * that replaces each element a[i] with the sum of a[i] through a[i + n],
 * but only if a[i] is positive valued. If there are not enough values
 * because we reach the end of the array, we sum only as many values as we have.
 *
 * @author : Mem0rin
 * Date: 2026-01-19
 * Time: 15:14
 */
public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
        /** replaces each element a[i] with the sum of a[i] through a[i + n] */
        for (int i = 0; i < a.length; i = i + 1) {
            if (a[i] <= 0) {
                continue;
            }
            for (int j = 1; i + j < a.length && j <= n; j = j + 1) {
                a[i] = a[i] + a[i + j];
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, -1, -1, 10, 5, -1};
        int n = 2;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}