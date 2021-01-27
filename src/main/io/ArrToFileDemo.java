import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/01/22 09:42
 */
public class ArrToFileDemo {
    public static void main(String[] args) throws IOException {

        ArrayList<Student> arr = new ArrayList<>();
        Student s1 = new Student(101, "qwe", "21", "rty");
        Student s2 = new Student(102, "asd", "21", "fgh");
        Student s3 = new Student(103, "zxc", "21", "vbn");
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\rain\\IdeaProjects\\mavendemo\\src\\main\\io\\ArrDemoCopy.txt"));

        for (Student s : arr) {
            bw.write(s.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
