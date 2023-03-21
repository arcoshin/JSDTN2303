package day05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 數組演示類
 */
public class ArrayDemo {
    public static void main(String[] args) {
        /**
         * 1.數組的定義
         */

        //聲明整數型數組 a ，包含5個元素，每個元素都是int類型，默認值為0
        int[] a = new int[5];

        //聲明浮點型數組 b ，包含20個元素，每個元素都是double類型，默認值為0.0
        double[] d = new double[20];

        //聲明布爾類型數組 c ，包含26個元素，每個元素都是boolean類型，默認值為false
        boolean[] c = new boolean[26];

        /**
         * 2.數組的初始化:初始化的是數組中的數據
         */
        int[] arr1 = new int[3];//0,0,0
        int[] arr2 = {2, 5, 8};//2,5,8
        int[] arr3 = new int[]{2, 5, 8};//2,5,8
        int[] arr4;
//        arr4 = {2,5,8};//編譯錯誤，此方式只能聲明同時初始化
        arr4 = new int[]{2, 5, 8};

        /**
         * 3.數組的訪問:訪問的是數組裡的數據
         */
        int[] arr = new int[3];
        System.out.println("arr數組長度 = " + arr.length);//訪問數組長度(元素數量)
        System.out.println("arr[0] = " + arr[0]);//輸出數組第一個元素
        System.out.println("arr[arr.length - 1] = " + arr[arr.length - 1]);//輸出數組最後一個元素
        arr[0] = 100;//給第一個元素賦值
        arr[1] = 200;//給第二個元素賦值
        arr[2] = 300;//給第三個元素賦值

//        arr[3] = 400;//給第四個元素賦值(語法本身沒問題，但運行時會報錯)
//        arr[-3] = 400;//給第??個元素賦值(語法本身沒問題，但運行時會報錯)

        /**
         * 補充:
         * 編譯成功但運行時異常
         * ArrayIndexOutOfBoundsException : 數組下標越界異常
         */

        /**
         * 4.數組的遍歷/迭代:逐一訪問所有的元素
         */
        int[] ar = new int[10];
        for (int i = 0; i < ar.length; i++) {//遍歷ar數組
            ar[i] = (int) (Math.random() * 100);//給某個元素賦值0~99的隨機數
            System.out.print(ar[i] + "\t");//遍歷逐一輸出
        }

        /**
         * 數組工具包:Arrays
         */

        //排序的工具Arrays.sort();
        Arrays.sort(ar);//升序排列，自然排序
        System.out.println();//換行
        System.out.println("升序排列:" + Arrays.toString(ar));

        //反序排列:Arrays無提供反序工具，但可以透過下標反序來實現降序遍歷
        System.out.print("反序排列:[");
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.print(ar[i] + "\t");
        }
        System.out.print("]");
        System.out.println();//換行

        //注意:反序遍歷只是改變輸出順序，並不影響本身數組排序
        System.out.println("ar數組首位元素:" + ar[0]);

        /**
         * 補充常用隨機數工具類
         */
        Random random = new Random();
        int r1 = random.nextInt();//生成int範圍中的隨機數
        int r2 = random.nextInt(100);//生成0~99中的隨機數
        int r3 = random.nextInt(61) + 40;//隨機生成40~100的隨機數
        int r4 = random.nextInt(3) + 1;//隨機生成1~4之間的數
        int[] r5 = new int[100];
        for (int i = 0; i < 100; i++) {//91~100
            r5[i] = random.nextInt(15-11) + 11;//bound = Max - Min，後面 + min
        }
        System.out.print(Arrays.toString(r5));
    }
}
