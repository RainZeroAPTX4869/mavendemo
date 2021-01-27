/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2020/12/21 14:48
 * 代码的封装，创建私有的成员变量
 */
public class Student {
    private int sid;
    private String name;
    private String age;
    private String addr;

    public Student() {
    }

    public Student(int sid, String name, String age, String addr) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "学号：" + sid + ", 姓名：'" + name + '\'' + ", 年龄：'" + age + '\'' + ", 地址：'" + addr + '\'';
    }
}
