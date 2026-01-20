/**
 * Created with IntelliJ IDEA
 * Description:
 * 博客的示例，实现的功能为比较年龄并输出谁是更大的
 * @author : Mem0rin
 * Date: 2026-01-20
 * Time: 20:17
 */
public class GroupLauncher {
    public static void main(String[] args){
        Group jack = new Group("Jack", 20);
        Group kitty = new Group("Kitty", 18);
        Group p1 = Group.staticOlder(jack, kitty);
        Group p2 = jack.older(kitty);
        p1.hello();
        p2.hello();
    }

}
