package string;

/**
 * StringBuilder類 : 適合頻繁編輯的String工具，改善頻繁增刪對象的過程
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        //StringBuilder創建方式
        StringBuilder b1 = new StringBuilder();//目前為空字符串
        StringBuilder b2 = new StringBuilder("abc");//b2為"abc"字符串

        //String 與 StringBuilder 互轉
        String str1 = "abc";
        StringBuilder b3 = new StringBuilder(str1);//b3為"abc"字符串
        String str2 = b3.toString();//StringBuilder轉換為String的方法
        System.out.println(str2);
    }
}
