/**
 * Created with IntelliJ IDEA
 * Description:
 * 类似于IntList的实现方式，并通过SLList进行包装。
 * @author : Mem0rin
 * Date: 2026-02-01
 * Time: 14:59
 */
public class IntNode {
    public int item;
    public IntNode next;
    public IntNode(int i, IntNode n) {
        item = i;
        next = n;
    }
}
