/**
 * Created with IntelliJ IDEA.
 * 多态实例演示
 *
 * @author RainZero
 * @date 2020/12/24 10:33
 */
public class AnimalDemo {
    public static void main(String[] args) {

//      多态，父类引用指向子类对象
//      向上转型
        Animal animal = new Cat();
        animal.setAge(2);
        animal.setName("短尾");
        animal.eat();

//      不新建对象，又可以用子类的方法
//      向下转型
        Cat cat = (Cat) animal;
        cat.play();
//      ((Cat) animal).play();

        Animal ag = new Dog();
        ag.setAge(3);
        ag.setName("土狗");
        ag.eat();

        ((Dog) ag).play();


    }
}
