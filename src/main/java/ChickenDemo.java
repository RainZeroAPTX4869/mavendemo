/**
 * Created with IntelliJ IDEA.
 *
 * @author: RainZero
 * @date: 2020/12/14/14:14
 * @description: 百钱买百鸡
 */
public class ChickenDemo {
    public static void main(String[] args) {
        /** x+y+z=100
         *  5x+3y+z/3=100
         *
         *
         * */
        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y < 33; y++) {
                int z = 100 - x - y;
                if (z % 3 == 0 && 5 * x + 3 * y + z / 3 == 100) {
                    System.out.println("x:" + x + " y:" + y + " z:" + z);

                }

            }

        }

    }
}
