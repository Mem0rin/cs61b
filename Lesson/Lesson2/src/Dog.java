/**
 * Created with IntelliJ IDEA
 * Description:
 *
 * @author : Mem0rin
 * Date: 2026-01-19
 * Time: 19:54
 */
public class Dog {
    public int weightInPounds;

    public Dog(int w) {
        weightInPounds = w;
    }
    /** 实例方法，需要创建实例，相当于给狗发号牌*/
    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yipyipyip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark. bark.");
        } else {
            System.out.println("woof!");
        }
    }
    /** 创建静态方法，相当于有一个客观的裁判进行方法处理
     *  不需要创建实例。
     *  被类自身调用
     *  应用场景：不需要对内容进行更改，仅进行运算时
     *  eg：Math库sqrt函数，当我们调用sqrt的时候，
     *  我们通常会直接用Math.sqrt而不是先创建实例再调用，这样也太别扭了。
     * */
    public static Dog maxDog1(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        }
        return d2;
    }
    /** 创建实例方法，需要创建实例之后以实例进行方法调用
     *  只能被实例调用
     *  相当于是裁判是狗狗其中之一，它在以自己为标准进行比较。
     *  eg：d.maxDog2(d2)
     * */
    public Dog maxDog2(Dog d2) {
        if (this.weightInPounds > d2.weightInPounds) {
            return this;//表示当前的实例，也就是裁判
        }
        return d2;
    }
}
