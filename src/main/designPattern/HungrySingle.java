import sun.security.jca.GetInstance;

/**
 * Created with IntelliJ IDEA.
 * 饿汉式单例模式
 *
 * @author RainZero
 * @date 2021/4/12
 */
public class HungrySingle {

    /**
     * 因为早早地new了对象，类中所有的内容都会被加载到内存，有时候就会造成资源的浪费
     */
    private byte[] bytes = new byte[1024*1024];

    private HungrySingle() {
    }

    //类加载时就new对象，体现“饿”
    private final static HungrySingle HUNGRY_SINGLE = new HungrySingle();


    private static HungrySingle getInstance() {
        //构造方法私有了，只能用过getInstance()调用构造方法，返回的是同一个对象，保证单例
        return HUNGRY_SINGLE;
    }


}
