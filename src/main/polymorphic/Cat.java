/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2020/12/24 10:33
 */
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println("猫吃鱼");
    }

    void play() {
        System.out.println("猫爱玩");
    }
}
