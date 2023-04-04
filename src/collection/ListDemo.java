package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List集合演示類
 * (本質上跟Collection一樣是接口)
 * (底層邏輯跟數組相似，更可以與數組互相轉換)
 * 1.可重複集合
 * 2.有序(有下標，類似數組)
 *
 * 常見實現類
 *
 * ArrayList  集合 :
 * 底層使用數組呈現，故查詢性能好(下標)，但增刪性能差(數組長度是不變的，增刪數組底層就是重新引用新對象)
 *
 * LinkedList 集合 :
 * 底層使用鍊表呈現，查詢性能不好，但首尾增刪性能佳(只能知道首尾的地址)
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList();//向上造型
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("one");
        System.out.println(list);//[one, two, three, four, five, one]

        /**
         * E get(int index) : 獲取指定下標所對應的元素
         */
        String e = list.get(2);
        System.out.println(e);//three

        //常規遍歷
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //增強型for循環
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        //迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        /**
         * E set(int index,object obj) : 將list中下標為n的元素設置為obj，並將被取代的元素返回
         */
        String old = list.set(2, "six");//將list中下標為2的元素設置為six，同時將被替換的元素返回
        System.out.println(old);//[one, two, six, four, five, one]
        System.out.println("list:" + list);

        /**
         * E remove(int index) : 刪除集合中指定下標的元素，並將其返回
         */
        String s1 = list.remove(2);
        System.out.println(s1);//six
        System.out.println("list:" + list);//[one, two, four, five, one]

        /**
         * void add(int index,E e) : 將給定元素e添加到指定下標為index的位置，可以理解為插入操作
         */
        list.add(3,"seven");//在下標位置為3的位置上插入seven
        System.out.println("list" + list);//[one, two, four, seven, five, one]
    }
}
