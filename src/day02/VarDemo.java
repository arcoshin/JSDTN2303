package day02;

/**
 * 變量的聲明與初始化
 */
class VarDemo {
    public static void main(String[] args) {


        /**
         * 1.變量的聲明---相當於在銀行開個帳戶
         */
        int a;    //聲明一個整數變量，名為a
        int b, c, d;//聲明三個整數變量，名為b,c,d
//        int a;//編譯錯誤，變量不能重名

        /**
         * 2.變量的初始化---相當於往帳戶存錢
         * */
        int e = 250;//聲明整數變量e並賦值為250---開戶同時存錢
        int f;//聲明整數變量f---先開戶
        f = 250;//給變量賦值為250
        f = 360;//修改變量f的值為360
        int g = 5, h = 8, i = 10;//聲明三個整數變量g,h,i，並分別賦值

        /**
         * 3.變量的訪問---相當使用帳戶的錢
         * */
        int j = 5;
        int k = j + 10;
        /**
         * 輸出語句中若無雙引號，則java視為一變量
         * */
        System.out.println("k=" + k);
        System.out.println("k");
        j = j + 10;//j先自加5000後，再賦值給j自身
        System.out.println("j=" + j);
        int l = 5000;
        l = l + 1000;//l先自加5000後，再賦值給l自身
        System.out.println("l=" + l);

        /**
         * 使用變量前須先聲明且初始化
         * */
        //System.out.println(m);//編譯錯誤，變量m未聲明
        int m;
//        System.out.println(m);//編譯錯誤，整數變量m尚未初始化
        m = 10;
        System.out.println("m=" + m);

        /**
         * 4.變量的命名
         * */
        int a1,a_5$,_3c,$5;
//        int a*b;//編譯錯誤，不能包含特殊符號
//        int 1a;//編譯錯誤，不能以數字開頭

        int aa = 5;
        //System.out.println(aA);//編譯錯誤，嚴格區分大小寫

        //int class;//編譯錯誤，不可使用關鍵字

        int 年齡;//編譯正確，但不建議(僅適用純java，不利後期框架對接)
        int nianLing;//編譯正確，但必須杜絕拼音，"企業中需英文見名知義"
        int age;//編譯正確，常見用法(符合英文見名知義)
        int score,myScore,myJavaScore;//編譯正確，類名建議使用"小駝峰命名法"


    }
}
