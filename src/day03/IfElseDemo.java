package day03;

import java.util.Random;

/**
 * If ...else 雙路分支結構展示
 */
public class IfElseDemo {
    public static void main(String[] args) {
        //滿500打8折，未滿500打9折
        double cost = 300;//消費金額
        if (cost >= 500) {
            cost *= 0.8;
        } else {
            cost *= 0.9;
        }
        System.out.println("打折後消費金額為" + cost);

        //判斷成績為合理還是不合理
        int score = -5;
        if (score >= 0 && score <= 100) {
            System.out.println(score + "為合理成績");
        } else {
            System.out.println(score + "為不合理成績");
        }
        System.out.println("繼續執行後面代碼");

        //判斷年齡為合法還是不合法
        int age = 131;
        if (age >= 0 && age <= 120) {
            System.out.println(age + "歲為合法年齡");
        } else {
            System.out.println(age + "歲為不合法年齡");
        }
        System.out.println("繼續執行後面代碼");

        Random random = new Random();
        int r = random.nextInt(10);
        if (r % 2 == 0) {
            System.out.println(r + "為偶數");
        } else {
            System.out.println(r + "為奇數");
        }

    }
}
