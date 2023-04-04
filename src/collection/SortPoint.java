package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 對Point進行排序
 */
public class SortPoint {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(1, 2));
        list.add(new Point(3, 4));
        list.add(new Point(5, 6));
        list.add(new Point(7, 8));
        list.add(new Point(9, 0));

        System.out.println("list原始數據:" + list);//[(1,2), (3,4), (5,6), (7,8), (9,0)]
//        Collections.sort(list);//編譯錯誤，Point未實現Comparable接口，系統認為不具可比性
        Collections.sort(list, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o1.getX() - o2.getX();//依照X升序排列
            }
        });
        System.out.println("list自定義排序後:" + list);//[(1,2), (3,4), (5,6), (7,8), (9,0)]

        Collections.sort(list, new Comparator<Point>() {//依照Point與圓心距離升序排序
            @Override
            public int compare(Point o1, Point o2) {
                int d1 = o1.getX() * o1.getX() + o1.getY() * o1.getY();
                int d2 = o2.getX() * o2.getX() + o2.getY() * o2.getY();
                return d1 - d2;
            }
        });
        System.out.println("list依照與圓心距離升序排列後:" + list);//[(1,2), (3,4), (5,6), (9,0), (7,8)]

        /**
         * JDK1.8時，List集和自身也提供了sort方法進行排序，該方法只需傳入比較器即可
         */
        list.sort(new Comparator<Point>() {//比較器依然可使用匿名內部類
            @Override
            public int compare(Point o1, Point o2) {
                return o1.getX() - o2.getX();//依照X升序排列
            }
        });
        System.out.println("list調用自身比較器的升序後:" + list);

        /**
         * Lambda表達式
         *
         * 語法:
         * (參數列表)->{
         *  方法體
         * }
         */
        list.sort((o1,o2)->o2.getX() - o1.getX());
        System.out.println("list調用自身比較器的降序後(Lambda):" + list);
    }
}
