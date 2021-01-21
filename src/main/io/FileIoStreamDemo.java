import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/01/19 10:03
 */
public class FileIoStreamDemo {
    public static void main(String[] args) throws IOException {
        //append为true追加写入数据
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\rain\\IdeaProjects\\mavendemo\\src\\main\\io\\fos.txt", true);
        //输出ascII码表对应的内容
        fileOutputStream.write(99);
        //getBytes()返回字符串对应的字节数组
        byte[] bytes = "12345abcde".getBytes();
        //off偏移量，len往后写的长度
        fileOutputStream.write(bytes, 1, 3);
        fileOutputStream.write("\r\n".getBytes());

        //读取文件内容
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\rain\\IdeaProjects\\mavendemo\\src\\main\\io\\fos.txt");
        int by;
        while ((by = fileInputStream.read()) != -1) {
            System.out.print((char) by);
        }

        //字节数组读取,由于上方代码已经读取同一个对象完毕，这里只做演示
        byte[] bys = new byte[1024];
        int len;
        while ((len = fileInputStream.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }

        //释放资源
        fileOutputStream.close();
        fileInputStream.close();
    }
}
