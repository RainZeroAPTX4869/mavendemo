import java.util.Scanner;
import java.util.Stack;

/**
 * 有效括号的最大深度
 */
public class Kuo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(kuo(s));
    }

    public static int kuo(String s) {
        if (s.isEmpty() || s.length() > 100000 || s.length() % 2 == 1) {
            return 0;
        }
        Stack<Character> stringStack = new Stack<>();
        int count = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stringStack.push('(');
            } else if (s.charAt(i) == '{') {
                stringStack.push('{');
            } else if (s.charAt(i) == '[') {
                stringStack.push('[');
            } else {
                count = Math.max(count, stringStack.size());
                stringStack.pop();
            }
        }
        return count;
    }

}
