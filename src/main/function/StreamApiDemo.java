import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * streamAPI主要针对数据源（列表、数组）进行操作
 *
 * @author RainZero
 * @date 2021/6/14
 */
public class StreamApiDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa", "dddd", "ccc", "bb", "", null);
        list.stream()
                //去空
                .filter(Objects::nonNull)
                //转换成大写
                .map(String::toUpperCase)
                //拿到长度大于2
                .filter(i -> i.length() > 2)
                //排序
                .sorted()
                //遍历输出
                .forEach(System.out::println);

    }
}
