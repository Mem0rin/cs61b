/**
 * Created with IntelliJ IDEA
 * Description:
 * 博客的示例
 * @author : Mem0rin
 * Date: 2026-01-20
 * Time: 20:17
 */
public class Group {

    public String name;

    public int age;

    public Group(String n, int a){
        name = n;
        age = a;
    }
    public void hello(){
        System.out.println(name + " is older");
    }

    public Group older(Group p){
        if (age > p.age) {
            return this;
        }
        return p;
    }

    public static Group staticOlder(Group p1, Group p2) {
        if (p1.age > p2.age) {
            return p1;
        }
        return p2;
    }

}
