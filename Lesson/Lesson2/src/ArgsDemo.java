/**
 * Created with IntelliJ IDEA
 * Description:
 *用命令行指令判断String[] args的作用。
 * eg.$ java ArgsDemo 1 2 3 4 5 10
 * >>>25
 * @author : Mem0rin
 * Date: 2026-01-20
 * Time: 19:11
 */
public class ArgsDemo {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 0; i < args.length; i = i + 1){
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
}
