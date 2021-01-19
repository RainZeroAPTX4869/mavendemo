import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/01/19 13:14
 */
public class CopyTextDemo {
    public static void main(String[] args) throws IOException {
        //创建输入输出流对象
        FileInputStream fileInputStream = new FileInputStream("C:\\迅雷下载\\《庆Y年》（精校版全本）\\[CC下载站www.52sk2.com]《庆余年》（精校版全本）作者：猫腻.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\rain\\IdeaProjects\\mavendemo\\src\\main\\io\\fos.txt");
        //从源文件读取一个字符就写入到目标文件
        int by;
        while ((by = fileInputStream.read()) != -1) {
            fileOutputStream.write((char) by);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }
}
