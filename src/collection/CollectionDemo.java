package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection是所有集合的頂級接口，封裝了很多共有的方法
 * 常見兩種實現類
 * java.util.Set  : 線性表，可重複，有順序
 * java.util.List : 不可重複集合，大部分都是無序的
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);//toString已經被重寫

        /**
         * int size() : 獲取集合長度或元素個素
         * boolean isEmpty : 檢查所給集合是否為空(c.size = 0 ?)並返回
         * clear() : 完全清空所給集合內部元素的方法
         */
        System.out.println("size : " + c.size());
        System.out.println("是否為空集 : " + c.isEmpty());//false

        c.clear();
        System.out.println("數據已清空");
        System.out.println("size : " + c.size());
        System.out.println("是否為空集合 : " + c.isEmpty());//true

        /**
         * 引用類型元素相關演示
         */
        Collection pointCollection = new ArrayList();
        pointCollection.add(new Point(1, 2));
        pointCollection.add(new Point(3, 4));
        pointCollection.add(new Point(5, 6));
        pointCollection.add(new Point(7, 8));
        pointCollection.add(new Point(9, 0));
        pointCollection.add(new Point(1, 2));
        System.out.println("pointCollection = " + pointCollection);

        /**
         * boolean contains(Object obj) : 判斷調用對象是否包含所給元素並返回
         * 底層邏輯其實是以equals為基礎進行比較後返回boolean值
         * 因此記得重寫，否則比較的是地址沒有實際意義
         */
        Point p1 = new Point(1, 2);
        System.out.println("當前集合是包含p1(1,2)這個點?" + pointCollection.contains(p1));

        /**
         * boolean remove (Object obj) : 刪除集合中的給定元素obj，刪除成功則返回true
         * 一般不接收返回值
         * 判定是否是給定元素obj，底層邏輯是以equals為基礎進行比較，比較結果為true時才會刪除
         * 這個方法一次只會刪除"一個"符合所給條件的對象
         */
        System.out.println("源集合 : " + pointCollection);
        pointCollection.remove(p1);
        System.out.println("調用一次remove(p1)後的結果 : " + pointCollection);
        pointCollection.remove(p1);
        System.out.println("調用一次remove(p1)後的結果 : " + pointCollection);

        /**
         * 集合中存的是對象的地址，因此當對象修改時，打印集合也可發現數值跟著修正
         */
        Collection cc = new ArrayList();
        Point pp = new Point(10, 20);
        cc.add(pp);//將pp的引用(地址)存到cc中
        System.out.println("pp : " + pp);//(1,2)
        System.out.println("cc : " + cc);//[(1,2)]

        pp.setX(999);
        System.out.println("pp : " + pp);//(999,2)
        System.out.println("cc : " + cc);//[(999,2)]
    }
}
