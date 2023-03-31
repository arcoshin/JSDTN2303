package string;


public class StringVsStringBuilderDemo {
    public static void main(String[] args) {
        /**
         * 由於String是不可變變量，每次修改都是創建新對象重新引用
         * 因此String不適合頻繁修改，以下列代碼為例，數分鐘也無法執行完畢。
         */
        long start = System.currentTimeMillis();
        String s = "a";
        for (int i = 0; i < 100000; i++) {//10萬次
            s += i;//每次修改都在創建新對象重新引用
        }
        System.out.println("FINISH");
        long end = System.currentTimeMillis();
        System.out.println("共耗費 : " + (end - start)/1000 + "秒");

    }
}
