package collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Collection ------> Array
 * 集合轉數組演示類
 */
public class CollectionToArray {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);//["one", "two", "three", "four", "five"]

        /**
         * Collection toArray(T[] ts)
         * T  : 表示泛型，也就是生成目標數組的類型
         * ts : 表示目標數組對象(通常new一個)
         *
         *
         * 當 源集合容量 等於 目標數組容量 正常轉換
         * 當 源集合容量 大於 目標數組容量 正常轉換，數組自動依照集合大小調整容量
         * 當 源集合容量 小於 目標數組容量 正常轉換，數組於末尾補其齊默認值
         */
        String[] str = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(str));
    }
}
