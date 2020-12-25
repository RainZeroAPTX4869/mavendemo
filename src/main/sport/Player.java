/**
 * Created with IntelliJ IDEA.
 * 抽象运动员类
 *
 * @author RainZero
 * @date 2020/12/25 09:46
 */
public abstract class Player extends Person {
    public Player() {
    }

    public Player(int age, String name) {
        super(age, name);
    }

    public abstract void study();
}
