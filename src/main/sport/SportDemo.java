/**
 * Created with IntelliJ IDEA.
 * 测试类
 *
 * @author RainZero
 * @date 2020/12/25 11:09
 */
public class SportDemo {
    public static void main(String[] args) {
        BasketballCoach bbc = new BasketballCoach(38, "bbc");
        System.out.println(bbc.getAge() + "," + bbc.getName());
        bbc.eat();
        bbc.speak();
        bbc.teach();

        BasketballPlayer bbp = new BasketballPlayer(20, "bbp");
        System.out.println(bbp.getAge() + "," + bbp.getName());
        bbp.eat();
        bbp.speak();
        bbp.study();

    }
}
