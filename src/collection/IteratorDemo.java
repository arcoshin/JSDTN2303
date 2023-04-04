package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 迭代器類
 * Collection接口中提供了一個Iterator iterator()方法，所有集合都能使用
 * 該方法可以返回當前對象的迭代器(Iterator接口類型)
 * 迭代器就是用來遍歷集合的工具
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        c.add("#");

        /**
         * 迭代器常用操作: 問 取 刪
         *
         * 問:
         * boolean it.hasNext()---是否有下一個元素
         * 注意:hasNext()只會問，無論調用多少次hasNext()，迭代器的指針都不會動
         * 注意:指針起始位置為"首位元素"前一個位置(所以第一次問就是問首位元素而非第二元素)
         *
         * 取:
         * object next()---將迭代器指針指向後一位元素，並將其返回
         * 只有當hasNext()為true時，代表集合中仍有下一個元素要輸出，才有移動指針的必要與可能
         *
         * 刪:(非必要操作)
         * void remove()---迭代器提供的remove()方法
         */
        Iterator it = c.iterator();//獲取c集合的迭代器
        while (it.hasNext()){//當還有下一個元素時...
            String str = (String) it.next();
            System.out.println(str);//將指針移至該元素

            //若需要不打印某些元素(非必要操作)
            if ("#".equals(str)) {//變量後擺可避免空指針異常(str為null時)

                /**
                 * 注意 : 迭代過程中禁止對集合進行任何Collection提供的增刪操作方法，否則異常
                 * ConcurrentModificationException : 併發修改異常
                 * 此時，只能若要滿足刪除需求，Iterator提供了remove()方法
                 */
//                c.remove("#");
                it.remove();//迭代器提供了remove方法協助移除
            }
        }//迭代完成後
        System.out.println("c : " + c);//驗證源集合刪除結果
    }
}
