import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/01/27 10:38
 */
public class StreamException {
    public static void main(String[] args) {
        methodAlpha();
        //异常处理改进版
        methodBeta();

    }

    private static void methodAlpha() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("fr.txt");
            fw = new FileWriter("fw.txt");
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read()) != -1) {
                fw.write(chs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void methodBeta() {
        try (FileReader fr = new FileReader("fr.txt");
             FileWriter fw = new FileWriter("fw.txt")) {
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read()) != -1) {
                fw.write(chs, 0, len);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
