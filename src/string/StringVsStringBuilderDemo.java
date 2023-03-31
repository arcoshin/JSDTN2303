package string;


public class StringVsStringBuilderDemo {
    public static void main(String[] args) {
        /**
         * 由於String是不可變變量，每次修改都是創建新對象重新引用
         * 因此String不適合頻繁修改，以下列代碼為例，數分鐘也無法執行完畢。
         */
        long start = System.currentTimeMillis();
//        String s = "a";
//        for (int i = 0; i < 10000000; i++) {//1000萬次(1700秒約半小時)
//            s += i;//每次修改都在創建新對象重新引用
//        }

        StringBuilder s = new StringBuilder("a");
        for (int i = 0; i < 10000000; i++) {//1000萬次(1秒內)
            s.append(i);
        }
        String ss = s.toString();
        System.out.println("FINISH");

        long end = System.currentTimeMillis();
        System.out.println("共耗費 : " + (end - start)/1000 + "秒");

    }
}
