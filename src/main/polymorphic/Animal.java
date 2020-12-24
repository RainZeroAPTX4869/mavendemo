/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2020/12/24 10:33
 */
public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void eat() {
        System.out.println("动物进食");
    }
}
