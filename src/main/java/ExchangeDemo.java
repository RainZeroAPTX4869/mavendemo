/**
 * Created with IntelliJ IDEA.
 * @author RainZero
 * @date 2020/12/21 09:55
 * 1:定义一个数组，用静态初始化完成数组元素的初始化
 * 2:循环遍历数组，这一次初始化语句定义两个索引变量，判断条件是开始索引小于等于结束索引
 * 3:变量交换
 * 4:遍历数组
 */
public class ExchangeDemo {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        //前后设定两个游标，用中间变量传递值
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        printArray(arr);

    }

    private static void printArray(int[] arr) {
        //循环输出更好看的数组
        System.out.print("int[] arr = {");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }

        }
        System.out.println("}");
    }
}