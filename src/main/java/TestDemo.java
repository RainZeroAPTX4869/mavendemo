/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2020/12/23 16:05
 */
public class TestDemo {
    public static void main(String[] args) {
        String s = "sfgg";
        change(s);
        System.out.println(s);
    }

    static void change(String s) {
        s = "qwer";
        System.out.println("方法里"+s);

    }
}
