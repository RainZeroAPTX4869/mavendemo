/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2020/12/24 13:13
 */
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }


    @Override
    void eat() {
        System.out.println("狗吃屎");
    }

    void play(){
        System.out.println("狗贱");
    }

}
