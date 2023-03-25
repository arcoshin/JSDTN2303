package day04;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Scanner;

/**
 * 猜數字小遊戲
 */
class Guessing {
    public static void main(String[] args) {

        //goal:用戶要猜的目標數(0~1000)
        int goal = (int) (Math.random() * 1000 + 1);
        System.out.println(goal);

        /**
         * Math.random()-------------------0.0~0.99999999999....
         * Math.random()*1000--------------0.0~999.99999999.....
         * Math.random()*1000+1------------1.0~1000.99999999....
         * (int)(Math.random()*1000+1)-----1~1000
         *
         * Math.random()-------------------0.0~0.99999999999....
         * Math.random()*750---------------0.0~749.99999999.....
         * Math.random()*750+50------------50.0~799.99999999.....
         * (int)(Math.random()*750+50)-----50~799
         *
         * Math.random()-------------------0.0~0.99999999999....
         * Math.random()*3-----------------0.0~2.99999999.....
         * Math.random()*3+1---------------1.0~3.99999999.....
         * (int)(Math.random()*3+1)--------1~3
         */

        //user:玩家猜的數字
        Scanner scanner = new Scanner(System.in);
        System.out.println("請開始猜數字...");
        int user = scanner.nextInt();

        /**提示系統(使用while)
         while (user != goal) {
         if (user > goal) {
         System.out.println("你猜得太大了，再猜吧!!");
         } else {
         System.out.println("你猜得太小了，再猜吧!!");
         }
         user = scanner.nextInt();
         }
         System.out.println("恭喜你猜對了!!遊戲結束!!");
         */

        //提示系統(使用 do...while)


    }
}
