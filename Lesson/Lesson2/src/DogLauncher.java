/**
 * Created with IntelliJ IDEA
 * Description:
 *
 * @author : Mem0rin
 * Date: 2026-01-19
 * Time: 19:54
 */
public class DogLauncher {
    public static void main(String[] args) {
        Dog d;
        d = new Dog(10);//创建实例（变量），变量是狗的这个整体
        d.makeNoise();
        Dog d2 = new Dog(100);
        Dog.maxDog1(d, d2).makeNoise();
        d.maxDog2(d2).makeNoise();
    }

}
