package day03;

/**
 * 補充三大結構 : 順序結構、分支結構、循環結構
 * if單路分支結構展示
 */
class IfDemo {
    public static void main(String[] args) {
        //滿500打8折
        double cost = 400;//消費金額
        if (cost >= 5000) {
            cost *= 0.8;
        }
        System.out.println("最終消費金額為" + cost);

        //判斷成績是否合理
        int score = 95;
        if (score >= 0 && score <= 100) {
            System.out.println(score + "為合理成績");
        }
        System.out.println("繼續執行後面代碼");

        //判斷年齡是否合理
        int age = 0;
        if (age >= 0 && age <= 120) {
            System.out.println("輸入年齡合理");
        }
        System.out.println("繼續執行後面代碼");
    }
}
