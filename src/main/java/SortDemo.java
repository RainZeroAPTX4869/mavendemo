import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * 冒泡排序
 *
 * @author RainZero
 * @date 2020/12/28 14:23
 */
public class SortDemo {
    public static void main(String[] args) {
        int[] arr = {23, 87, 49, 39, 64, 25, 61};

        //外层记录总体循环比较的次数，arr.length-1次
        for (int j = 1; j < arr.length; j++) {
            //内层记录用temp去一个个比较的次数
            //每完成一次总体比较，比较的次数就要少一，因为最大的元素已经排到最后
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
        }

        arrayToString(arr);

        //Arrays类自带排序与转String方法
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        //append拼接字符串方法
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            //遍历数组，如果是最后一个，不用加", "
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + ", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());

    }
}
