import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Thread.sleep;


/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2020/12/22 11:16
 */
public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        while (true) {
            System.out.println("-----欢迎来到学生管理系统-----");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查找学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            try {
                switch (s) {
                    case "1":
                        System.out.println("添加学生");
                        addStudent(arrayList);
                        sleep(1000);
                        break;
                    case "2":
                        System.out.println("删除学生");
                        deleteStudent(arrayList);
                        sleep(1000);
                        break;
                    case "3":
                        System.out.println("修改学生");
                        updateStudent(arrayList);
                        sleep(1000);
                        break;
                    case "4":
                        System.out.println("查询学生");
                        findAllStudent(arrayList);
                        sleep(1000);
                        break;
                    case "5":
                        System.out.println("退出系统");
                        //return 结束整个方法
                        sleep(500);
                        return;
                    default:
                        System.out.println("你输入的选项有误");
                        //break 结束当前循环（while）
                        sleep(1000);
                        break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private static void addStudent(ArrayList<Student> arrayList) {
        Scanner sc = new Scanner(System.in);
        int sid;
        while (true) {
            System.out.println("请输入学号：");
            sid = sc.nextInt();
            int flag = findSid(sid, arrayList);
            if (sid == -1) {
                System.out.println("正在返回主页...");
                return;
            } else if (flag == -1) {
                break;
            } else {
                System.out.println("该学号已存在,请重新输入");
            }
        }
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        System.out.println("请输入年龄：");
        String age = sc.nextLine();
        System.out.println("请输入地址：");
        String addr = sc.nextLine();
        Student s = new Student(sid, name, age, addr);

        arrayList.add(s);
        System.out.println("添加学生成功");
    }

    private static void deleteStudent(ArrayList<Student> arrayList) {
        if (arrayList.isEmpty()) {
            System.out.println("暂无学生信息，请先添加");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入要删除学生资料的学号");
            int sid = sc.nextInt();
            int flag = findSid(sid, arrayList);
            if (flag == -1) {
                //若方法里循环结束后,flag为-1，说明arrayList里没有输入的学号
                System.out.println("输入的学号不存在");
            } else {
                //不为-1，通过flag，直接删除对应的行
                arrayList.remove(flag);
                System.out.println("删除成功");
            }


        }
    }

    private static void updateStudent(ArrayList<Student> arrayList) {
        if (arrayList.isEmpty()) {
            System.out.println("暂无学生信息，请先添加");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入要修改学生资料的学号");
            int sid = sc.nextInt();
            int flag = findSid(sid, arrayList);
            if (flag == -1) {
                //若方法中的循环结束后,flag还为-1，说明arrayList里没有输入的学号
                System.out.println("输入的学号不存在");
            } else {
                Student st = new Student();
                //若能找到相同，让用户输入修改的信息，并修改student
                st.setSid(sid);
                System.out.println("请输入修改后的姓名：");
                String name = sc.nextLine();
                st.setName(name);

                System.out.println("请输入修改后的年龄：");
                String age = sc.nextLine();
                st.setAge(age);

                System.out.println("请输入修改后的地址：");
                String addr = sc.nextLine();
                st.setAddr(addr);
                //将新的student赋值给arrayList
                arrayList.set(flag, st);
                System.out.println("修改成功");
            }
        }
    }

    private static void findAllStudent(ArrayList<Student> arrayList) {
        if (arrayList.isEmpty()) {
            System.out.println("暂无学生信息，请先添加");
        } else {
            System.out.println("学号\t\t姓名\t\t年龄\t\t地址");
            for (int i = 0; i < arrayList.size(); i++) {
                //取出集合中的数据，赋值给student
                Student st = arrayList.get(i);
                //从student获取值
                System.out.println(st.getSid() + "\t\t" + st.getName() + "\t" + st.getAge() + "岁\t\t" + st.getAddr());
            }
        }
    }

    private static int findSid(int sid, ArrayList<Student> arrayList) {
        //查找arrayList里是否有输入的sid
        int flag = -1;
        for (int i = 0; i < arrayList.size(); i++) {
            Student st = arrayList.get(i);
            if (st.getSid() == sid) {
                flag = i;
                break;
            }
        }
        return flag;
    }

}
