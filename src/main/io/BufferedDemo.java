import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/01/21 11:38
 */
public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\rain\\IdeaProjects\\mavendemo\\src\\main\\java\\Arrdemo.java"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\rain\\IdeaProjects\\mavendemo\\src\\main\\io\\ArrDemoCopy.txt"));

        //buffered特有的方法 行分隔符newLine();读一行文字readLine();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        char[] chars = new char[1024];
        int len;
        while ((len = bufferedReader.read(chars)) != -1) {
            bufferedWriter.write(chars, 0, len);

        }


        bufferedWriter.close();
        bufferedReader.close();
    }
}
