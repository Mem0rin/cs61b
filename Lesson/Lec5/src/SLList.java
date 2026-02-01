/**
 * Created with IntelliJ IDEA
 * Description:
 * IntList的优化，通过面向对象的编程思路通过编写辅助函数实现链表的操作。
 * @author : Mem0rin
 * Date: 2026-02-01
 * Time: 15:03
 */
public class SLList {
    /** 为了防止用户使用first对链表进行不正确的操作，
     * 对first定义为private从而避免对链表的直接操作，
     * 而是使用更安全的辅助方法。
     * 如果采用public，默认这样的功能是长期有效的！
     * */
    private IntNode first;
    /** 通过SLList的封装，使得链表的创建更加简洁。
     * eg.
     * IntList L1 = new IntList(5, null);
     * SLList L2  = new SLList(5);
     * */
    public SLList(int x) {
        first = new IntNode(x, null);
    }
    /** 通过编写辅助方法，避免对IntNode链表本身的裸递归。*/
    // addFirst:在链表头部添加一项。
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }
    // getFirst:获取链表第一项。
    public int getFirst() {
        return first.item;
    }
    /** 这样我们就可以通过辅助方法作为“中介”对链表进行操作，这样使得链表的操作更加简单
     * 比如：对于SLList我们可以：
     * SLList L = new SLList(15);
     * L.addFirst(10);
     * L.addFirst(5);
     * int x = L.getFirst();
     *
     * 对比之下IntNode则是：
     * IntList L = new IntList(15, null);
     * L = new IntList(10, L);
     * L = new IntList(5, L);
     * int x = L.first;
     * */

}
