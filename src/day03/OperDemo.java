package day03;

/**
 * 運算符
 */
public class OperDemo {
    public static void main(String[] args) {
        /**======================================
         * 條件(三元)運算符: boolean? a:b
         ======================================*/
        int num = 5;
        int flag = num > 0 ? 1 : -1;
        System.out.println(flag);

        int a = 8, b = 55;
        int bigger = a > b ? a : b;
        System.out.println("bigger=" + bigger);

        /**=============================================
         * 字符串拼接符: +
         * 1.若加號兩邊為數字，則做加法運算
         * 2.若加號兩邊出現字符串，則做字符串拼接
         * 3.任何類型的數據與字符串拼接，其結果都會變成字符串類型
         =============================================*/
        /*int age = 29;
        System.out.println("age=");//age=
        System.out.println(age);//29
        System.out.println("age=" + age);//age=29
        System.out.println("我今年" + age + "歲了!");//我今年29歲了!

        String name = "XJX";
        System.out.println("大家好，我叫" + name);//大家好，我叫XJX
        System.out.println("大家好，我叫" + name + "，今年" + age + "歲了");//大家好，我叫XJX，今年29歲了

        System.out.println(10+20+""+30);//3030-------String類型
        System.out.println(""+10+20+30);//102030-----String類型
        System.out.println(10+20+30+"");//60---------String類型

         */

        /**======================================================================
         * 賦值運算符:
         * 1.一般賦值運算符 =
         * 2.擴展賦值運算符 += -= *= /= %= (注意:擴展運算符自帶強轉功能)
         ======================================================================*/
        /*
        int a = 5;
        a += 10;//相當於 a=(int)(a=a+10)
        System.out.println(a);//15
        a *= 2; //相當於 a=(int)(a=a*2)
        System.out.println(a);//30
        a /= 6; //相當於 a=(int)(a=a/6)
        System.out.println(a);//5

        //面試題
        short s = 5;
        //s = s + 10;編譯錯誤，需強轉，應改為(short)(s+10);
        s += 10;//相當於s = (short)(s+10)
        System.out.println(s);

         */

        /**======================================================================
         * 邏輯運算符: &&,||,!
         * 建立在關係運算符的基礎之上，所以運算結果也只有true或false兩種->boolean類型
         ======================================================================*/
        //int a = 5, b = 10, c = 5;
        //--->&&，邏輯與，見false則false，有假則假
        /*boolean b1 = b >= a && b < c;
        System.out.println(b1);             //true && false = false
        System.out.println(b <= c && b > a);//false && true = false
        System.out.println(a == b && b < a);//false && false = false
        System.out.println(b != c && b > a);//true && true = true

        int age = 99;//判斷年齡是否在18到50之間
        System.out.println(age >= 18 && age <= 50);//false
        int score = 86;//判斷成績是否在0~100之間
        System.out.println(score >= 0 && score <= 100);//true*/
        //--->||，邏輯或，見true則true，有真則真
        /*
        System.out.println(b >= a || b < c);//true||false=true
        System.out.println(b <= c || b > a);//false||true=true
        System.out.println(b != c || b > a);//true||true=true
        System.out.println(a == b || b < a);//false||false=false

        int score = 90;
        System.out.println(score>0||score>100);//成績不合法驗證*/
        //---->!，邏輯非，非真即假，非假即真
        /*
        boolean b2 = !(a<b);
        System.out.println(b2);    //!true=false
        System.out.println(!(a>b));//!false=true   */
        //短路現象:關係運算至已足以知道運算結果時，剩餘條件不會被執行
        /*
        boolean b3 = a > b && c++ > 2;//見false則false，後面便不執行了(短路)
        System.out.println(b3);//false
        System.out.println(c); //5,發生短路了

        boolean b4 = a < b || c++ > 2;//見true則true，後面便不執行了(短路)
        System.out.println(b4);//true
        System.out.println(c); //5，發生短路了

         */


        /**=======================================================================
         * 關係運算符: >,<,>=,<=,==,!=
         * 不論關係為何，關係運算符經過計算的結果只有true或false兩種->boolean類型
         =======================================================================*/
        /*int a = 5, b = 10, c = 5;
        boolean b1 = a > b;
        System.out.println(b1);//false
        System.out.println(c < b);//true
        System.out.println(a >= c);//true
        System.out.println(a <= b);//true
        System.out.println(a == c);//true
        System.out.println(a != c);//false

        System.out.println(a % 2 == 0);//false
        System.out.println(a + c > b);//false
        System.out.println(a++ > 5);//a++=5,false,同時a自增為6
        System.out.println(a++ > 5);//a++=6,true,同時a自增為7*/

        /**==============================================
         * 算術運算符: +,-,*,/,%,++,--
         ===============================================*/
        /*
        //當自增(++)與自減(--)符單獨使用時，在前在後時都一樣
        //自增
        int a = 5, b = 6;
        a++;//相當於a=a+1
        ++b;//相當於b=b+1
        System.out.println(a);//6
        System.out.println(b);//6
        //自減
        int c = 5, d = 5;
        c--;//相當於c= c-1
        --d;//相當於d= d-1
        System.out.println(c);
        System.out.println(d);

        //當自增(++)與自減(--)符被使用時，在前與在後意義不同
        //自增
        int a1 = 5, b1 = 5;
        int c1 = a1++;
        int d1 = ++b1;
        System.out.println(a1);//6，凡見++符最終必自增1
        System.out.println(b1);//6，凡見++符最終必自增1
        System.out.println(c1);//5，先賦值後自增
        System.out.println(d1);//6，先自增後賦值
        //自減
        int a2 = 5, b2 = 5;
        int c2 = a2--;
        int d2 = --b2;
        System.out.println(a2);//4，凡見--符最終必自減1
        System.out.println(b2);//4，凡見--符最終必自減1
        System.out.println(c2);//5，先賦值後自減
        System.out.println(d2);//4，先自減後賦值
        */


    }
}
