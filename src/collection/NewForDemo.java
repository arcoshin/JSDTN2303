package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 增強型for循環
 * jdk1.5後定義了新特性，可以使用增強型for循環
 * 這使得我們可以使用相同的語法遍歷集合與數組
 * 而其設計的底層邏輯其實就是Iterator
 * 所以遍歷過程中我們仍不能動態的對遍歷對象進行任何增刪操作
 */
public class NewForDemo {
    public static void main(String[] args) {
        /**
         * 當前已學習遍歷數組與集合的方法
         */

        //遍歷數組
        String[] array = {"one", "two", "three", "four", "five"};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();//換行

        //遍歷集合
        Collection collection = new ArrayList();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        collection.add("four");
        collection.add("five");

        Iterator it = collection.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();//換行

        /**
         * 使用增強型for循環遍歷數組與集合
         * 語法:
         *
         * for(類型 變量名 : 遍歷對象) {
         *    循環體
         * }
         *
         */

        //遍歷數組
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();//換行

        //遍歷集合
        for (Object s : collection) {
            System.out.print((String) s + " ");
        }
        System.out.println();//換行

    }
}
