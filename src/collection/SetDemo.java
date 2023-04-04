package collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Set集合 : 不可重複集合，大部分數據是無序的(無序並非隨機，只是沒有下標)
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        set.add("two");//加入失敗，Set為不可重複集合，但此處不報錯，自動去重
        System.out.println("set:" + set);//後者會自動去重
    }
}
