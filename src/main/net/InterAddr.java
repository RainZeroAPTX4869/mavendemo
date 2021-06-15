import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/6/11
 */
public class InterAddr {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress name = InetAddress.getByName("www.baidu.com");
        System.out.println(name.getHostAddress()+" "+name.getHostName());

    }
}
