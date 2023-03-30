package ooday05;

public class StaticDemo {
    public static void main(String[] args) {
        /**
         * 一個類中的成員變量包含兩種: 實例變量 與 靜態變量(或稱類變量)
         * 實例變量屬於對象，只能通過對象訪問
         * 靜態變量屬於類本身，一般建議使用類名打點訪問
         *
         * 又靜態資源全類共享，
         * 因此本案例可發現靜態資源出現了累加現象(所有修改共用一份數據)
         */
        StaticVar o1 = new StaticVar();
        o1.show();

        StaticVar o2 = new StaticVar();
        o2.show();

        StaticVar o3 = new StaticVar();
        o3.show();


        /**
         * 靜態代碼塊於內存中，是在加載類時就執行一次
         * 因此會在構造器(方法)之前執行，而且只會執行一次
         */
        StaticBlock s1 = new StaticBlock();
        StaticBlock s2 = new StaticBlock();
        StaticBlock s3 = new StaticBlock();

    }
}
