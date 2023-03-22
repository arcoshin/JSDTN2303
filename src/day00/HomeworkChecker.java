package day00;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * day00
 * 的作業類
 */
public class HomeworkChecker {

    /**
     * 開場的方法
     */
    private static void welcome() throws InterruptedException {
        System.out.println("請稍後...正在為您生成演示過程...");
        Thread.sleep(1000);
    }

    /**
     * 結束的方法
     */
    private static void end() {
        System.out.println("感謝您的耐心檢查");
        System.out.println("END");
    }

    /**
     * 告知用戶輸入不合法的方法
     */
    private static void uRWrong() {
        try {
            throw new RuntimeException("輸入錯誤，請重新輸入");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    /**
     * 自動回到第N題的方法
     */
    private static void backToQuestion(int n) throws InterruptedException {
        System.out.println("即將返回第" + n + "題選單......");
        Thread.sleep(1000);
        switch (n) {
            case 1:
                question1();
                break;
            case 2:
                question2();
                break;
            case 3:
                question3();
                break;
            case 4:
                question4();
                break;
            case 5:
                question5();
                break;
            default:
                uRWrong();
        }
    }

    /**
     * 自動回到首頁的方法
     */
    private static void backToMenu() throws InterruptedException {
        System.out.println("本題展示完成，即將返回大題選單......");
        Thread.sleep(1000);
        homeworkChecker();
    }

    /**
     * 說明模擬業務完成的方法
     */
    private static void missionComplete() {
        System.out.println("業務執行完畢，請選擇下個業務");
    }

    /**
     * 廣播說明客戶所選擇的業務
     */
    private static void whatYouChoose(String doSomething) {
        System.out.println("您所選擇的是" + doSomething);
    }

    /**
     * 作業檢測系統入口
     */
    private static void homeworkChecker() throws InterruptedException {
        /**
         * 聲明scanner對象及初始化老師輸入的指令
         */
        Scanner scanner = new Scanner(System.in);
        int homeworkCheck;
        System.out.println("======================================================================");
        System.out.println("Hint : 請輸入要檢查的題數(如第一題請輸入1，本次作業共5題，若想結束檢查請輸入99)");
        System.out.println("======================================================================");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");//記得修改最大題數
        homeworkCheck = scanner.nextInt();

        /**
         * 作業查找分支系統
         */
        switch (homeworkCheck) {
            case 1:
                whatYouChoose("Addition隨機加法運算器");
                question1();
                break;
            case 2:
                whatYouChoose("MultiTable九九乘法表");
                question2();
                break;
            case 3:
                whatYouChoose("數組小代碼練習");
                question3();
                break;
            case 4:
                whatYouChoose("MaxOfArray求數組元素最大值");
                question4();
                break;
            case 5:
                whatYouChoose("對數組進行升序排列");
                question5();
                break;
            case 99:
                return;
            default:
                uRWrong();
                homeworkChecker();
        }
    }

    /**
     * 第一題演示
     */
    private static void question1() throws InterruptedException {
        welcome();
        //=======================================================

        //=======================================================
        backToMenu();
    }

    /**
     * 第二題演示
     */
    private static void question2() throws InterruptedException {
        welcome();
        //=======================================================

        //=======================================================
        backToMenu();
    }

    /**
     * 第三題演示
     */
    private static void question3() throws InterruptedException {
        welcome();
        //=======================================================

        //=======================================================
        backToMenu();
    }

    /**
     * 第四題演示
     */
    private static void question4() throws InterruptedException {
        welcome();
        //=======================================================

        //=======================================================
        backToMenu();
    }

    /**
     * 第五題演示
     */
    private static void question5() throws InterruptedException {
        welcome();
        //=======================================================

        //=======================================================
        backToMenu();
    }

    /**
     * 程序入口
     */
    public static void main(String[] args) {
        try {
            homeworkChecker();
            end();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
