/**
 * Created with IntelliJ IDEA
 * Description:Draw a triangle of *.
 *
 * @author : Mem0rin
 * Date: 2026-01-18
 * Time: 21:13
 */
public class DrawTriangle {
    /**
     * Creative Exercise 1a: Drawing a Triangle
    public static void printStar(int n){
        int col = 0;
        while (col <= n) {
            System.out.print("*");
            col = col + 1;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int row = 0;
        int SIZE = 5;
        while (row < SIZE) {
            printStar(row);
            row = row + 1;
        }
    }
     */
    public static void drawTriangle(int N){
        int col = 0;
        int row = 0;
        while (col < N){
            while (row <= col){
                System.out.print("*");
                row = row + 1;
            }
            System.out.println();
            row = 0;
            col = col + 1;
        }
    }

    public static void main(String[] args){
        int SIZE = 10;
        drawTriangle(SIZE);
    }
}
