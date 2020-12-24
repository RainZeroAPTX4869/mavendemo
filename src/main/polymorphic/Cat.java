/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2020/12/24 10:33
 */
public class Cat extends Animal implements Jumpping {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.print("吃鱼");
    }

    void play() {
        System.out.print("爱玩");
    }

    @Override
    public void jump() {
        System.out.print("跳高了");

    }
}
