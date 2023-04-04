package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Array ------> List(Set集合不支持數組轉換所以此處不宜寫Collection)
 * 數組轉集合演示類
 */
public class ArrayToList {
    public static void main(String[] args) {
        String[] array = new String[]{"one", "two", "three", "four", "five"};

        /**
         * 數組工具類Arrays中提供了asList方法可以將數組作為List集合返回
         * 但是此時還有一個很大的缺陷 :
         * 我們修改新生成的集合時，會造成引用到同一個對象地址的源數據也發生改變
         * 解決方案:
         * 1).
         * 生成新的集合，於構造器ArrayList()中傳入list(new一個新的地址)
         *
         * 2).
         */
        List<String> list = Arrays.asList(array);
        list.set(0, "1");
        System.out.println("list = " + list);
        System.out.println("array = " + Arrays.toString(array));

        /**
         * 此時對集合增刪操作就是對數組增刪操作
         * 然而數組長度是定死的，不支持自動擴容與縮容
         * 因此運行時雖說編譯語法正確，但會出現運行中異常
         * UnsupportedOperationException : 操作不支持異常
         */
//        list.add("abc");//運行中異常

        //1).new
        List<String> list1 = new ArrayList<>(list);
        list1.set(1, "2");
        System.out.println("list1 = " + list1);
        System.out.println("array = " + Arrays.toString(array));

        //2).addAll()
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.set(2, "3");
        System.out.println("list2 = " + list2);
        System.out.println("array = " + Arrays.toString(array));


    }
}
