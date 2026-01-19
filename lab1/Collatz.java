/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {

    /** Buggy implementation of nextNumber! */
    public static int nextNumber(int n) {
        /**
         * Description:
         * 实现洛谷猜想的运算，奇数则* 3 + 1，偶数则/ 2, 最终结果必定为1。
         * 示例：
         * {@code nextNumber(5)} 返回 16
         * {@code nextNumber(16)} 返回 8
         *
         * @source cs61b
         * @param n 原数字
         */
        if (n % 2 == 1) {
            return 3 * n + 1;
        } else {
            return n / 2;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

