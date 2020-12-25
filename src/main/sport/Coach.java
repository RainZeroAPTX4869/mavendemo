/**
 * Created with IntelliJ IDEA.
 *抽象教练类
 * @author RainZero
 * @date 2020/12/25 09:47
 */
public abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(int age, String name) {
        super(age, name);
    }

    public abstract void teach();
}
