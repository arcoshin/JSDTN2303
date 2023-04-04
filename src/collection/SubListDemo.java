package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * List sublist(int start,int end) : 獲取指定下標的子集(下標含頭不含尾)
 * 注意 : 源集合與子集合其實都是引用到相同的數據對象，因此兩者共同引用的數據被更改時，兩者皆會同步。
 */
public class SubListDemo {
    public static void main(String[] args) {
//        List<Integer> list = new LinkedList<>();//使用鍊表也不會影響後續代碼進行，兩者只是底層邏輯結構不同
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i * 10);
        }
        System.out.println("list:" + list);//[0, 10, 20, 30, 40, 50, 60, 70, 80, 90]

        /**
         * 獲取下標3到7的字集
         */
        List<Integer> subList = list.subList(3, 8);
        System.out.println(subList);//[30, 40, 50, 60, 70]

        /**
         * 將子集每個元素都擴大為十倍 : 對子集的操作就是對源集合的元素操作
         */
        for (int i = 0; i < subList.size(); i++) {
            subList.set(i, subList.get(i) * 10);
        }
        System.out.println("subList:" + subList);
        System.out.println("list:" + list);

        /**
         * 將源集合下標為3的元素更改為1000 : 源數組數據改變後，子集亦將跟著改變
         */
        list.set(3, 1000);
        System.out.println("list:" + list);
        System.out.println("subList:" + subList);

        /**
         * 對源集增刪後，子集不能再進行操作(不支持操作異常)
         * 對子集增刪後，源集跟著改
         * (源集類似原件，子集類似複印件)
         */
        subList.remove(0);//子集修改
        System.out.println("subList:" + subList);
        System.out.println("list:" + list);

        list.remove(0);//源集增刪
        System.out.println("list:" + list);
        /**
         * ConcurrentModificationException : 不支持操作異常
         */
        System.out.println("subList:" + subList);

    }
}
