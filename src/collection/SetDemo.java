package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Set集合 : 不可重複集合，大部分數據是無序的(無序並非隨機，只是沒有下標)
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        set.add("two");//加入失敗，Set為不可重複集合，但此處不報錯
        System.out.println("set:" + set);

        /**
         * 小面試題 : 如何去重(將已重複元素去除)
         */
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("two");
        System.out.println("list原始數據:" + list);//[one, two, three, four, five, two]

        //將數據傳入set中
        //1.
        Set listToSet1 = new HashSet(list);
        System.out.println("listToSet1去重後:" + listToSet1);//[four, one, two, three, five]
        //2.
        Set listToSet2 = new HashSet();
        listToSet2.addAll(list);
        System.out.println("listToSet2去重後:" + listToSet2);//[four, one, two, three, five]

    }
}
