/**
 * Created with IntelliJ IDEA
 * Description:
 * Lec4:linked list(链表)。
 * @author : Mem0rin
 * Date: 2026-01-24
 * Time: 17:49
 */

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Return the size of the list using... recursion! */
    public int size() {
        if (this.rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /** Return the size of the list using no recursion! */
    public int iterativeSize() {
        int count = 0;
        IntList p = this;
        while (p != null) {
            count += 1;
            p = p.rest;
        }
        return count;
    }

    /** Returns the ith value in this list.*/
    public int get(int i) {
        if (i == 0) {
            return this.first;
        }
        return this.rest.get(i - 1);
    }

    public static IntList incrList(IntList L, int x) {
        IntList Q = new IntList(L.first + x, null);
        if (L.rest == null) {
            return Q;
        }
        Q.rest = incrList(L.rest, x);
        return Q;
    }

    /** Return an IntList L with all values incremented by x.*/

    public static void addList(IntList L, int x){
        L.first += x;
        if (L.rest == null) {
            return;
        }
        addList(L.rest, x);
    }

    /** Return an IntList identical to L, but with all values incremented by x.*/
    public static IntList dincrList(IntList L, int x) {
        addList(L, x);
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        System.out.println(L.iterativeSize());
        System.out.println(L.get(1));
        System.out.println(incrList(L, 3));
        System.out.println(dincrList(L, 3));
    }
}
