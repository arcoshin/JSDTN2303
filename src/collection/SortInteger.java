package collection;

import java.util.*;

/**
 * 對Integer元素進行排序
 */
public class SortInteger {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(100));//0~99
        }
        System.out.println("list原始數據:" + list);
        Collections.sort(list);//自然排序(升冪排序)
        System.out.println("list自然排序後數據:" + list);
        Collections.reverse(list);//反轉排序(降冪排序)
        System.out.println("list反轉排序後數據:" + list);
    }
}
