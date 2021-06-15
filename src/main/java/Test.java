/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/6/5
 */
public class Test {

    static {
        int b = 1;
    }
    int a;
    static int b;
    public static void main(String[] args) {
        System.out.println(new Test().a + b);
    }
    void fu(){
       b= a+b;
    }
}
