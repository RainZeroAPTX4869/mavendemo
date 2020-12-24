/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2020/12/24 15:52
 */
public class JumpDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("懒猫", 2);
        System.out.print(cat.getName() + "已经" + cat.getAge());
        System.out.print("岁了，每天");
        cat.eat();
        System.out.print("，会");
        cat.play();
        System.out.print("，现在学会");
        Jumpping jumpping = new Cat();
        jumpping.jump();
    }

}
