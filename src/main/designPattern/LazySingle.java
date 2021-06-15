/**
 * Created with IntelliJ IDEA.
 * 懒汉式单例
 * https://www.cnblogs.com/xz816111/p/8470048.html
 *
 * @author RainZero
 * @date 2021/4/12
 */
public class LazySingle {
    private LazySingle() {
    }

    //暂时不new对象
    //volatile禁止指令重排，以防在第一个线程加锁还未初始化完成时，另一个线程获取到这个还未初始化完成的对象
    private volatile static LazySingle lazySingle;

    public static LazySingle getInstance() {
        //如果没有new一个单例对象，new，否则返回存在的对象
        //如果多线程并发访问，就会多次实例化，加锁保证单例
        //synchronized加在方法上,每次调用都要加锁，性能低，在锁外再加一层判断，这样就只在初始化加锁，提高性能
        if (lazySingle == null) {
            synchronized (LazySingle.class) {
                //double-checked locking双重锁校验DCL懒汉式，保证线程安全以及高性能
                if (lazySingle == null) {
                    return new LazySingle();
                }
            }
        }
        return lazySingle;
    }
}
