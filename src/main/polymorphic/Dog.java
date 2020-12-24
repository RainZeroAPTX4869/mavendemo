/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2020/12/24 13:13
 */
public class Dog extends Animal implements Jumpping {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }


    @Override
    void eat() {
        System.out.print("吃屎");
    }

    void play() {
        System.out.print("狗贱");
    }

    @Override
    public void jump() {
        System.out.print("狗可以跳远了");
    }
}
