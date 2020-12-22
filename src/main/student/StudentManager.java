import java.util.Scanner;

import static java.lang.Thread.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2020/12/22 11:16
 */
public class StudentManager {
    public static void main(String[] args) {
        while (true) {
            System.out.println("-----欢迎来到学生管理系统-----");
            System.out.println("1 添加学生");
            System.out.println("2 修改学生");
            System.out.println("3 删除学生");
            System.out.println("4 查找学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            switch (s) {
                case "1":
                    System.out.println("添加学生：");
                    break;
                case "2":
                    System.out.println("修改学生：");
                    break;
                case "3":
                    System.out.println("删除学生：");
                    break;
                case "4":
                    System.out.println("查询学生：");
                    break;
                case "5":
                    System.out.println("退出系统");
                    //return 结束整个方法
                    return;
                default:
                    System.out.println("你输入的选项有误");
                    //break 结束当前循环（switch）
                    try {
                        sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }

    }
}
