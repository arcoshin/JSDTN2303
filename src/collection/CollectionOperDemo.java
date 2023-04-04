package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合之間的操作
 */
public class CollectionOperDemo {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("java");
        c1.add("c++");
        c1.add(".net");
        System.out.println("c1 : " + c1);//[java, c++, .net]

        Collection c2 = new ArrayList();
        c2.add("android");
        c2.add("ios");
        c2.add("java");
        System.out.println("c2 : " + c2);//[android, ios, java]


        /**
         * boolean addAll(Collection c)
         * 將所給集合完全加入調用者集合的方法
         * 返回值一般很少使用
         */
        c1.addAll(c2);//將c2完全加入c1中
        System.out.println("c1 : " + c1);//[java, c++, .net, android, ios, java]
        System.out.println("c2 : " + c2);//[android, ios, java]

        /**
         * boolean containsAll(Collection c)
         * 判斷調用者集合是否完全包含給定集合並返回boolean值
         */
        Collection c3 = new ArrayList();
        c3.add("c++");
        c3.add("android");
        c3.add("php");
        System.out.println("c3 : " + c3);//[c++, android, php]
        System.out.println("c1是否完全包含c3 : " + c1.containsAll(c3));//false，須完全包含但順序無關
        System.out.println("c1是否完全包含c2 : " + c1.containsAll(c2));

        /**
         * retainAll(Collection c) : 取交集
         * 僅保留調用者與所給定集合共有的元素(只會對調用者保留)
         *
         * removeAll(Collection c) : 刪交集
         * 僅刪除調用者與所給定集合共有的元素(只會對調用者刪除)
         * 換句話說其實就是將所有調用者中與給定集合中相同的元素部分刪除
         */
        c1.retainAll(c3);//僅保留c1中，與c3共有的部分
        System.out.println("c1對c3取交集 : " + c1);//[c++, android]
        System.out.println("c3 : " + c3);//[c++, android, php]

        c1.removeAll(c3);//刪除c1中,與c3共有的部分
        System.out.println("c1對c3刪交集 : " + c1);//空集合
        System.out.println("c3 : " + c3);//[c++, android, php]
    }
}
