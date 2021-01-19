import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * 使用递归遍历文件夹里所有文件的绝对路径
 *
 * @author RainZero
 * @date 2021/01/19 09:38
 */
public class FileDemo {
    public static void main(String[] args) {
        File srcFile = new File("C:\\迅雷下载\\apink");
        getAllFiles(srcFile);
    }

    private static void getAllFiles(File srcFile) {
        //获取路径下所有的文件，并用数组接收
        File[] listFiles = srcFile.listFiles();
        //文件数组不为空则遍历数组
        if (listFiles != null) {
            for (File file : listFiles) {
                //如果文件对象是文件夹，则递归遍历改文件对象，否则输出该文件的绝对路径
                if (file.isDirectory()) {
                    getAllFiles(file);
                } else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
