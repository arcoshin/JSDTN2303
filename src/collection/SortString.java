package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 對String元素排序
 */
public class SortString {
    public static void main(String[] args) {
        /**
         * 對英文字符串的排序時，會依照首字母的ASCII碼來排
         * 若首字母相同，則比較第二個字母的ASCII碼，依此類推...
         * A~Z:65~90
         * a~z:97~122
         */
        List<String> list1 = new ArrayList<>();
        list1.add("jack");
        list1.add("rose");
        list1.add("tom");
        list1.add("jerry");
        list1.add("black");
        list1.add("Kobe");

        System.out.println("list1原始數據:" + list1);//[jack, rose, tom, jerry, black, Kobe]
        Collections.sort(list1);
        System.out.println("list1自然排序後:" + list1);//[Kobe, black, jack, jerry, rose, tom]

        /**
         * 對中文字符串的排序時，依然是按照首字母的ASCII碼來排
         * 若首字母相同，則比較第二個字母的ASCII碼，依此類推...
         * 但ASCII碼對於業務並無太大意義，因此可以自定義排序方式
         * 系統對於一個類是否可以排序，會以該類有沒有實現Comparable來確定
         * Integer、String類中都有實現Comparable接口，因此可以直接排序
         * 自定義類也必須實現Comparable才可以排序，否則直接編譯錯誤
         */
        List<String> list2 = new ArrayList<>();
        list2.add("王克晶");
        list2.add("傳奇sdfsdf");
        list2.add("國斌老師");
        System.out.println("list2原始數據:" + list2);
        Collections.sort(list2);
        System.out.println("list2自然排序後:" + list2);

        System.out.println("王:" + (int)'王');//29579
        System.out.println("傳:" + (int)'傳');//20659
        System.out.println("國:" + (int)'國');//22283

        /**
         * 特別注意 : 一般我們不會直接在類名實現Comparable接口來定義排序規則
         * 因為這種作法對程序有侵入性，非常不利於後期代碼的維護
         *
         * "當我們調用某個API功能時，其要求我們為其修改額外代碼的的現象就稱為侵入性"
         * 如:後續刪除sort()語句時，原有比較方法後續未必適用，甚至造成同事調用方法時的困擾
         * 我們通常會傾向做一次排序時定義一次規則，讓各自規則影響各自排序，才不會交互影響
         *
         * 解決辦法 : 匿名內部類
         * 使用重載的Collections.sort(List list,Comparator o)
         */
        Collections.sort(list2, new Comparator<String>() {
            @Override
            /**
             * compare()方法用於定義o1與o2比較大小的規則，他的返回值表達大小關係
             * o1 - o2 升序，前面減後面為升序
             * o2 - o1 降序，後面減前面為降序
             */
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();//升序(依照長度)
            }
        });
        System.out.println("list2排序後數據:" + list2);//["王克晶","國斌老師","傳奇sdfsdf"]
    }
}
