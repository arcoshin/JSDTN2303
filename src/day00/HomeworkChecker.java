package day00;

import java.util.Arrays;
import java.util.Scanner;

/**
 * day00
 * 的作業類Ver2.0
 */
public class HomeworkChecker {
    static String q1 = HomeworkCheckerTools.getQuestionName(1,"");
    static String q2 = HomeworkCheckerTools.getQuestionName(2,"");
    static String q3 = HomeworkCheckerTools.getQuestionName(3,"");
    static String q4 = HomeworkCheckerTools.getQuestionName(4,"");
    static String q5 = HomeworkCheckerTools.getQuestionName(5,"");

    /**
     * 作業檢測系統入口
     */
    private static void homeworkChecker() throws InterruptedException {
        /**
         * 聲明scanner對象及初始化老師輸入的指令
         */
        int homeworkCheck = new Scanner(System.in).nextInt();

        System.out.println("======================================================================");
        System.out.println("Hint : 請輸入要檢查的題數(如第一題請輸入1，本次作業共5題，若想結束檢查請輸入99)");
        System.out.println("======================================================================");
        System.out.println(q1);//記得修改最大題數
        System.out.println(q2);//記得修改最大題數
        System.out.println(q3);//記得修改最大題數
        System.out.println(q4);//記得修改最大題數
        System.out.println(q5);//記得修改最大題數

        /**
         * 作業查找分支系統
         */
        switch (homeworkCheck) {
            case 1:
                HomeworkCheckerTools.whatYouChoose(q1);
                question1();
                break;
            case 2:
                HomeworkCheckerTools.whatYouChoose(q2);
                question2();
                break;
            case 3:
                HomeworkCheckerTools.whatYouChoose(q3);
                question3();
                break;
            case 4:
                HomeworkCheckerTools.whatYouChoose(q4);
                question4();
                break;
            case 5:
                HomeworkCheckerTools.whatYouChoose(q5);
                question5();
                break;
            case 99:
                return;
            default:
                HomeworkCheckerTools.uRWrong();
                homeworkChecker();
        }
    }

    /**
     * 第一題演示
     */
    private static void question1() throws InterruptedException {
        HomeworkCheckerTools.waitForPreparing();
        //=======================================================

        //=======================================================
        HomeworkCheckerTools.backToMenu();
    }

    /**
     * 第二題演示
     */
    private static void question2() throws InterruptedException {
        HomeworkCheckerTools.waitForPreparing();
        //=======================================================

        //=======================================================
        HomeworkCheckerTools.backToMenu();
    }

    /**
     * 第三題演示
     */
    private static void question3() throws InterruptedException {
        HomeworkCheckerTools.waitForPreparing();
        //=======================================================

        //=======================================================
        HomeworkCheckerTools.backToMenu();
    }

    /**
     * 第四題演示
     */
    private static void question4() throws InterruptedException {
        HomeworkCheckerTools.waitForPreparing();
        //=======================================================

        //=======================================================
        HomeworkCheckerTools.backToMenu();
    }

    /**
     * 第五題演示
     */
    private static void question5() throws InterruptedException {
        HomeworkCheckerTools.waitForPreparing();
        //=======================================================

        //=======================================================
        HomeworkCheckerTools.backToMenu();
    }

    /**
     * 程序入口
     */
    public static void main(String[] args) {

        try {
            homeworkChecker();
            HomeworkCheckerTools.ending();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    static class HomeworkCheckerTools {//附屬靜態工具包類
        /**
         * 生成題目名稱的方法
         */
        private static String getQuestionName(int n, String title) {
            String questionName = n + "." + title;
            return questionName;
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
         * 廣播說明客戶所選擇的業務
         */
        private static void whatYouChoose(String doSomething) {
            System.out.println("您所選擇的是" + doSomething);
        }

        /**
         * 開始演示question的方法
         */
        private static void waitForPreparing() throws InterruptedException {
            System.out.println("請稍後...正在為您生成本題的演示過程...");
            Thread.sleep(1000);
        }

        /**
         * 結束的方法
         */
        private static void ending() {
            System.out.println("感謝您的耐心檢查");
            System.out.println("END");
        }

        /**
         * 自動回到首頁的方法
         */
        private static void backToMenu() throws InterruptedException {
            System.out.println("本題展示完成，即將返回大題選單......");
            Thread.sleep(1000);
            HomeworkChecker.homeworkChecker();
        }

    }


}


