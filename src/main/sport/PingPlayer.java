/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2020/12/25 11:02
 */
public class PingPlayer extends Player implements SpeakEnglish {
    public PingPlayer() {
    }

    public PingPlayer(int age, String name) {
        super(age, name);
    }

    @Override
    public void study() {
        System.out.println("学挥拍");
    }

    @Override
    public void eat() {
        System.out.println("吃乒乓球");

    }

    /**
     * 说行为接口
     *
     * @param:
     * @return:
     * @author: RainZero
     * @date: 2020/12/25
     */
    @Override
    public void speak() {
        System.out.println("学说乒乓球语");

    }
}
