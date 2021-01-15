import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/01/15 13:31
 */
public class PokerDemo {
    public static void main(String[] args) {

        //创建hashmap,键是编号,值是牌
        HashMap<Integer, String> hm = new HashMap<>(54);

        //创建ArrayList储存牌的编号
        ArrayList<Integer> arrayList = new ArrayList<>();

        //创建花色和点数数组
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //把牌的索引存入hashmap与arraylist
        int index = 0;
        for (String num : nums) {
            for (String color : colors) {
                hm.put(index, color + num);
                arrayList.add(index);
                index++;
            }
        }
        hm.put(index, "小王");
        arrayList.add(index);
        index++;
        hm.put(index, "大王");
        arrayList.add(index);

        //洗牌，洗的是编号
        Collections.shuffle(arrayList);

        //发牌，发的是编号，为了保证顺序，使用treeset
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> hand = new TreeSet<>();

        for (int i = 0; i < arrayList.size(); i++) {
            int x = arrayList.get(i);
            if (i >= arrayList.size() - 3) {
                hand.add(x);
            } else if (i % 3 == 0) {
                player1.add(x);
            } else if (i % 3 == 1) {
                player2.add(x);
            } else if (i % 3 == 2) {
                player3.add(x);
            }
        }


        lookPoker("player1", player1, hm);
        lookPoker("player2", player2, hm);
        lookPoker("player3", player3, hm);
        lookPoker("底牌", hand, hm);


    }

    private static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
        System.out.print(name + "的牌是: ");
        for (Integer index : ts) {
            System.out.print(hm.get(index) + " ");
        }
        System.out.println();

    }
}
