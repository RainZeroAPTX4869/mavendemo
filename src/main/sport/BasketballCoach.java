/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2020/12/25 10:10
 */
public class BasketballCoach extends Coach implements SpeakEnglish{
    public BasketballCoach() {
    }

    public BasketballCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("教球");
    }

    @Override
    public void eat() {
        System.out.println("吃吃喝喝");
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
        System.out.println("说篮球语");
    }
}
