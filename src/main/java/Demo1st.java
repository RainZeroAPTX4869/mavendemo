public class Demo1st {

    public static void main(String[] args) {
        /*new PrintXing().leng();*/
        int i = 10;
        i++;
        System.out.println(i);
        int j = i + 1;
        System.out.println(i);
        System.out.println(j);
        System.out.println(++i);
        System.out.println(i++ + ++i);
        printXing();
    }


    private static void printXing(){
        for (int i = 0; i < 5; i++) {
            /*控制行数*/
            for (int j = 4; j > i; j--) {
                /*控制空格*/
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                /*输出星号*/
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            /*控制行数*/
            for (int k = 0; k < i + 1; k++) {
                /*控制空格*/
                System.out.print(" ");
            }
            for (int j = 8; j > 2 * i + 1; j--) {
                /*输出星号*/
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
