/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2020/12/25 10:25
 */
public class PingCoach extends Coach implements SpeakEnglish{
    public PingCoach() {
    }

    public PingCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("教挥拍");
    }

    @Override
    public void eat() {
        System.out.println("喝喝吃吃");
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
        System.out.println("说乒乓球语");
    }
}
