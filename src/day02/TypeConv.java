package day02;

/**
 * 變量之間的轉換
 */
class TypeConv {
    public static void main(String[] args) {
        /**===========================================================
         * 面試題
         * 兩點規則；
         //1.整數直接量可以直接賦值給byte,short,char 但不能超出範圍
         //2.byte,short,char類型的數據'參與運算時'，一律先自動轉換為int再運算
         ============================================================*/
        byte b1 = 5;
        byte b2 = 6;
        byte b3 = (byte) (b1+b2);

        System.out.println(2+2);//4
        System.out.println(2+'2');//52，2 + '2'的碼50
        System.out.println('2'+'2');//100， '2'的碼50 + '2'的碼50
        System.out.println('2');//2，因為沒有運算，所以輸出的是'字符2'(非數字2)

        int a = 'a';
        System.out.println(a);//查看字符對應的碼
        char c =97;
        System.out.println(c);//查看碼對應的字符

//        int a = 5;
//        long b = a; //自動類型轉換
//        int c = (int) b;//強制類型轉換
//
//        long d = 5;//自動類型轉換
//        double e = 5;//自動類型轉換
//
//        long f = 10000000000L;
//        int g = (int) f;
//        System.out.println(g);//1410065408. 強轉'有可能'發生溢出
//
//        double h = 25.987;
//        int i = (int) h;
//        System.out.println(i);//25. 強轉'有可能'丟失精度(EX: h= 25.0)
    }
}
