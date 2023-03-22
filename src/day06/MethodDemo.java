package day06;

/**
 * 方法演示類
 */
public class MethodDemo {
    public static void main(String[] args) {
        System.out.println("程序開始......");
        say();
        sayHi("WKJ", 39);
        //sayHi();編譯錯誤，有參則必須傳參，否則調用失敗
        //sayHi(250);編譯錯誤，傳參類型必須匹配
        System.out.println("程序繼續執行了");
    }

    /**
     * 無參無返方法
     */
    public static void say() {
        System.out.println("你好!");
    }

    /**
     * 有參無返方法
     */
    public static void sayHi(String name, int age) {
        System.out.println("你好!~我是" + name + "，今年" + age + "歲了!");
    }
}
