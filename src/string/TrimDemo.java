package string;

/**
 * String Trim()
 * 消除字符串頭尾空白字符的方法:包含兩邊的 空白符、迴車符、換行符
 *
 * 再次體會String對象為不變對象
 * 因此任何對於字符串的修改，本質上都是創建一個新的字符串對象重新引用
 */
public class TrimDemo {
    public static void main(String[] args) {
        String name1 = "                Tom    ";
        String s1 = name1.trim();//接收修改過的新字符串對象
        System.out.println(s1);//Tom

        String name2 = "" +
                "" +
                "" +
                "" +
                "Jerry" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "";
        System.out.println(name2.trim());//Jerry
    }
}
