import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * 三种遍历list集合的方式
 *
 * @author RainZero
 * @date 2021/01/11 13:41
 */
public class ListDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Student student1 = new Student(1, "张三", "20", "qwe");
        Student student2 = new Student(2, "李四", "21", "asd");
        Student student3 = new Student(3, "王五", "22", "zxc");

        list.add(student1);
        list.add(student2);
        list.add(student3);

        //迭代器遍历
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            System.out.println(s.getName() + "," + s.getAge());
        }

        //for遍历
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }


        //for增强遍历
        for (Student s : list) {
            System.out.println(s.getName() + "," + s.getAge());
        }


    }
}
