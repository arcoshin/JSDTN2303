package day05;

import java.util.Random;
import java.util.Scanner;
/**
 * 十題隨機加法測驗，共十題不倒扣，算出分數
 */

class Addition {
    public static void main(String[] args) {


        //生成隨機數對象及計分對象
        Random random = new Random();
        int x;//隨機數
        int y;//隨機數
        int score = 0;//總分

        //生成scanner對象並將使用者輸入的答案初始化
        Scanner scanner = new Scanner(System.in);
        int userAnswer;

        System.out.println("=====測驗開始=====");

        //循環十次出題
        for (int i = 1; i <= 10; i++) {
            x = random.nextInt(100);//每次生成隨機數
            y = random.nextInt(100);//每次生成隨機數
            System.out.println("(" + (i) + ")" + x + "+" + y + "=?");//題目顯示

            userAnswer = scanner.nextInt();//獲得使用者的答案

            if (userAnswer == x + y) {//判題分支
                System.out.println("答對了");
                score += 10;
            } else {
                System.out.println("答錯了");
            }
        }

        //答題結果
        System.out.println("=====測驗結束=====");
        System.out.println("您的測驗總分為: " + score + "分");
    }
}
