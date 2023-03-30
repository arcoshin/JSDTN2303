package ooday05;

/**
 * 靜態方法演示類
 */
public class StaticMethod {
    int a; //實例變量，由對象訪問
    static int b;//靜態變量(類變量)，由類名訪問

    void show(){//有隱式this(系統默認提供，因為實例資源屬於對象，this即是指代調用的當前對象)
        System.out.println(this.a);//完整寫法
        System.out.println(StaticMethod.b);//完整寫法
    }

    static void test() {//無隱式this，因為靜態資源屬於類
        /**
         * 無隱式this代表沒有對象調用
         * 但實例變量只能通過實例對象調用
         * 所以此處代碼編譯錯誤
         */

//        System.out.println(a);//編譯錯誤，靜態方法中不可直接訪實例成員
        StaticMethod s = new StaticMethod();
        System.out.println(s.a);//生成實例就可以，但一般不這麼做

        System.out.println(b);//完整寫法，默認類名打點訪問
    }
}
