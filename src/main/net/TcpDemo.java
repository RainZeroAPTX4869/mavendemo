
import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.jupiter.api.Test;


/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/6/11
 */
public class TcpDemo {
    @Test
    public void client() throws UnknownHostException {
//        创建socket对象，指明服务器IP和端口
        InetAddress address = InetAddress.getByName("127.0.0.1");
        try (Socket socket = new Socket(address, 11222);
//             获取输出流，用于输出数据
             OutputStream outputStream = socket.getOutputStream()) {

            for (int i = 0; i < 5; i++) {
//                写出数据
                outputStream.write(("服务端开启" + i).getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void server() {
//        创建服务器socket，指明自己端口，接收客户端的socket，获取输入流
        try (InputStream acceptInputStream = new ServerSocket(11222).accept().getInputStream();

             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {

//            用数组循环读取输入流的数据并写入输出流
            byte[] buffer = new byte[2];
            int len;
            while ((len = acceptInputStream.read(buffer)) != -1) {
                System.out.println(len);
                byteArrayOutputStream.write(buffer, 0, len);
            }
            System.out.println(len);
            System.out.println(byteArrayOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
