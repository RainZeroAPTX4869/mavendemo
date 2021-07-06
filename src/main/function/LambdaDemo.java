import java.util.Comparator;
import java.util.function.LongSupplier;

/**
 * Created with IntelliJ IDEA.
 * lambda表达式的本质：作为函数式接口的实例，接口只能有一个抽象方法
 *
 * @author RainZero
 * @date 2021/6/13
 */
public class LambdaDemo {
    public static void main(String[] args) {
        //匿名内部类
        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        System.out.println(c1.compare(21, 13));

        //lamdba表达式改进
        //(o1, o2) -> Integer.compare(o1, o2)
        //左边是抽象方法的形参列表，右边是重写方法的方法体
        //形参不加类型，因为可以类型推断
        //如果只有一个参数，小括号也可以省略，其他情况皆不可省略
        Comparator<Integer> c2 = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println(c2.compare(13, 21));

        Runnable runnable = () -> System.out.println("线程启动");
        runnable.run();

        //方法引用改进
        Comparator<Integer> c3 = Integer::compare;
        System.out.println(c3.compare(12, 31));
        System.out.println();

    }

}
