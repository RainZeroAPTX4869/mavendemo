import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2020/12/23 16:05
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //格式化时间
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd号 HH:mm:ss");
        String s = simpleDateFormat.format(date);
        System.out.println(s);
        //转到Date类型
        String ss = "2021-01-05 10:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(ss);
        System.out.println(d);

    }

}
