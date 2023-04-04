package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型(Generic)的演示類
 */
public class GenericDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
//        c.add(123);//編譯錯誤，123違背了集合c所指向的泛型類型

        /**
         * 迭代器所使用的泛型應與其所遍歷的集合泛型一致
         */
        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (String s : c) {
            System.out.println(s);
        }

        /**
         * 引用類型
         */
        Collection<Point> collection = new ArrayList<>();
        collection.add(new Point(1,2));
        collection.add(new Point(3,4));
        collection.add(new Point(5,6));
        collection.add(new Point(7,8));

        Iterator<Point> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Point p : collection) {
            System.out.println(p);
        }
    }
}
