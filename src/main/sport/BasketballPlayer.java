/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2020/12/25 11:02
 */
public class BasketballPlayer extends Player implements SpeakEnglish {
    public BasketballPlayer() {
    }

    public BasketballPlayer(int age, String name) {
        super(age, name);
    }

    @Override
    public void study() {
        System.out.println("学球");
    }

    @Override
    public void eat() {
        System.out.println("吃篮球");
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
        System.out.println("学说篮球语");
    }
}
