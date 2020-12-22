import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * 字符串的反转
 *
 * @author RainZero
 * @date 2020/12/22 09:11
 */
public class ExchangeStringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();
//        StringBuilder提供了字符串反转的方法
        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println("String:" + stringBuilder.reverse().toString());

        s = exchange(s);
        System.out.println("s:" + s);

    }

    private static String exchange(String s) {
//        定义一个空字符串用于接收反转的字符拼接
        String ss = "";

        StringBuilder stringBuilder = new StringBuilder(s);

        for (int i = s.length() - 1; i >= 0; i--) {
            //也可以用StingBuilder的字符串拼接方法
            ss = stringBuilder.append(s.charAt(i)).toString();

           /*倒叙遍历字符串，将每个字符拼接起来
            ss += s.charAt(i);*/


        }

        return ss;
    }

}
