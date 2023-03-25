package day03;

import java.util.Random;

/**
 * If...else If...多路分支結構展示
 */
class IfElseIfDemo {
    public static void main(String[] args) {
        //滿2000打5折，滿1000打7折，滿500打8折，未滿500打9折
        double cost = 300;//消費金額
        if (cost >= 2000) {
            cost *= 0.5;
        } else if (cost >= 1000) {
            cost *= 0.7;
        } else if (cost >= 500) {
            cost *= 0.8;
        } else {
            cost *= 0.7;
        }
        System.out.println("打折後消費金額為" + cost);

        //判斷成績評等
        int score = 77;
        if (score < 0 || score > 100) {
            System.out.println(score + "分為不合理成績");
        } else if (score > 95) {
            System.out.println(score + "分評等為A+級");
        } else if (score > 90) {
            System.out.println(score + "分評等為A級");
        } else if (score > 85) {
            System.out.println(score + "分評等為A-級");
        } else if (score > 80) {
            System.out.println(score + "分評等為B級");
        } else if (score > 75) {
            System.out.println(score + "分評等為C級");
        } else if (score > 70) {
            System.out.println(score + "分評等為D級");
        } else if (score > 65) {
            System.out.println(score + "分評等為E級");
        } else {
            System.out.println(score + "分評等為F級，以下表示所有的不合格成績");
        }
        System.out.println("繼續執行後面代碼");

        //判斷年齡為哪個階段
        int age = 66;
        if (age < 0 && age > 120) {
            System.out.println(age + "歲為不合法年齡");
        } else if (age <= 1){
            System.out.println(age + "歲為嬰幼兒階段");
        } else if (age <= 18){
            System.out.println(age + "歲為未成年階段");
        } else if (age <= 40){
            System.out.println(age + "歲為輕熟齡階段");
        } else if (age <= 50){
            System.out.println(age + "歲為壯年階段");
        } else if (age < 65){
            System.out.println(age + "歲為待退休階段");
        } else {
            System.out.println(age + "歲為退休階段");
        }
        System.out.println("繼續執行後面代碼");


    }
}
