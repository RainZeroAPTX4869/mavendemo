import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/01/27 11:18
 */
public class SystemInDemo {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        //使用转换流，将字节输入流转换为字符输入流，实现汉字输入
        //Scanner sc = new Scanner(System.in);
        //InputStreamReader isr = new InputStreamReader(System.in);
        InputStreamReader isr = new InputStreamReader(is);
        //使用字符缓冲输入流，实现读取一行数据
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        System.out.println(line);


    }
}
