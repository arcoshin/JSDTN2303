package day07;

import java.util.Random;
import java.util.Scanner;

/**
 * 需求:猜數字小遊戲
 * 訓練目標:while(true)自造死循環(必須配合break否則永遠無法結束還循環)
 */
public class Guessing {
    public static void main(String[] args) {
        /**
         * 隨機賦值目標數
         */
        int num = new Random().nextInt(1000) + 1;//1~1000
        System.out.println("num = " + num);//作弊


        /**
         * 自造死循環
         */
        while (true) {
            /**
             * 賦值使用者作答
             */
            System.out.println("請猜吧~(1~1000)");
            int user = new Scanner(System.in).nextInt();//接收使用者作答

            if (user < num) {
                System.out.println("猜太小了!!加大點再猜猜吧!!");
            } else if (user > num) {
                System.out.println("猜太大了!!縮小點再猜猜吧!!");
            } else {
                System.out.println("恭喜你猜對了!!");
                break;//跳出循環
            }
        }
    }
}
