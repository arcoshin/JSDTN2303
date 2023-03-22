package day06;

import java.util.Arrays;

/**
 * 數組相關演示
 */
public class ArrayDemo {
    public static void main(String[] args) {
        /**========================================================================
         * 數組的複製
         * 1.System.arraycopy(原數組,原數組起始下標,目標數組,目標數組起始下標,複製的長度);
         * 2.Arrays.copyOf(原數組,目標數組長度)
         *====================================================================== */

        /**
         * 1.System.arraycopy();
         */
        int[] a = {10, 20, 30, 40, 50};
        int[] b = new int[6];

        /**
         * 其中:
         * a:原數組
         * 0:原數組起始下標
         * b:目標數組
         * 0:目標數組起始下標
         * 4:複製的數組長度
         *
         * 注意:"當目標數組長度不足以裝下被複製的數組長度時"
         * 以及"原數組的長度不足所需取的長度時"以上情形皆會報錯!!
         * ArrayIndexOutOfBoundsException : 數組下標越界異常
         */
        System.arraycopy(a, 0, b, 0, 4);//從數組a下標0複製4個元素至b數組下標0~0+4的位置
        System.out.println(Arrays.toString(b));

        /**
         * 2.Arrays.copyOf();
         */
        int[] c = Arrays.copyOf(a, 6);
        int[] d = Arrays.copyOf(a, 5);
        int[] e = Arrays.copyOf(a, 4);
        /**
         * 其中:
         * c、d、e為目標數組
         * a為原數組
         * 注意!!6~為目標數組c的"新長度"
         * 注意!!5~為目標數組d的"新長度"
         * 注意!!4~為目標數組e的"新長度"
         * -----若目標數組長度>源數組長度，則末尾補默認值
         * -----若目標數組長度=源數組長度，則相當複製數組
         * -----若目標數組長度<源數組長度，則將末尾的截掉
         */
        System.out.println("若目標數組長度 > 源數組長度 " + Arrays.toString(c));
        System.out.println("若目標數組長度 = 源數組長度 " + Arrays.toString(d));
        System.out.println("若目標數組長度 < 源數組長度 " + Arrays.toString(e));

        /**
         * Arrays.copyOf()的特殊應用 擴容 與 縮容
         * 不論擴容與縮容，其實就是建立一個新數組的概念!並非直接修改原始數組的容量!
         */
        int[] ori = new int[]{0, 1, 2, 3, 4, 5};
        System.out.println("原數組:" + Arrays.toString(ori));
        //擴容
        ori = Arrays.copyOf(ori, ori.length + 1);
        System.out.println("擴容後:" + Arrays.toString(ori));

        //縮容
        ori = Arrays.copyOf(ori, ori.length - 3);
        System.out.println("縮容後:" + Arrays.toString(ori));


    }
}
