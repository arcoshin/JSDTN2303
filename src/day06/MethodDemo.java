package day06;

import java.util.Arrays;
import java.util.Random;

/**
 * 方法演示類
 */
class MethodDemo {
    public static void main(String[] args) {

        System.out.println("程序開始......");
        say();//調用無參無返

        sayHi("WKJ", 39);//調用有參無返

        double getNum = getNum();//調用無參有返
        System.out.println("getNum = " + getNum);

        int plus = plus(49, 51);//調用有參有返
        System.out.println("plus = " +plus);
        //sayHi();編譯錯誤，有參則必須傳參，否則調用失敗
        //sayHi(250);編譯錯誤，傳參類型必須匹配
        System.out.println("程序繼續執行了");

        int[] arr = generateArray();
        System.out.println(Arrays.toString(arr));

    }

    /**
     * 無參無返方法
     */
    public static void say() {
        System.out.println("你好!");
    }

    /**
     * 有參無返方法
     */
    public static void sayHi(String name, int age) {
        System.out.println("你好!~我是" + name + "，今年" + age + "歲了!");
    }

    /**
     * 無參有返方法
     */
    public static double getNum() {
        //在有返回值的方法中，必須得通過return來返回數據
        //return;//編譯錯誤，return後必須有一個數據
        //return "abc";//編譯錯誤，return後數據的類型必須與返回值類型匹配
        return 8.88;//1.結束方法  2.返回結果給調用方
    }

    /**
     * 有參有返方法
     */
    public static int plus(int num1,int num2) {
        int num = num1 + num2;
        return num;//返回的是num中的數而不是變量本身
    }

    /**
     * 隨機生成數組並隨機填入10個數的方法
     */
    public static int[] generateArray() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);//0~99
        }
        return arr;
    }



    /**
     * 隨機生成數組並隨機填入10個數的方法但要求可以自定義數字範圍及隨機數的數量
     */
    public static int[] generateArray(int length,int max) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(max+1);//0~99
        }
        return arr;
    }

    /**
     * 方法的重載:同一類中，參數列表不同的重名方法，跟返回值無關
     */
    public static void a () {};
    public static void a (int a) {};
    public static void a (int a,int b) {};
    public static void a (String a) {};
    public static void a (String a,int b) {};
    public static void a (int b,String a) {};
    //public static int a () {return 5;};//重載必須參數列表不同，跟返回值無關
    //private static void a () {};//重載必須參數列表不同，跟修飾訪問詞無關

    /**
     * 思考:如何才算夠成重載------以調用時的代碼分析
     * 重載方法如果只有返回值不同，那代碼在調用時就會無法分辨，因為他們代碼寫出來是一樣的。---------------------1.
     * 而不同參數列表時，可以知道綁定為哪一個方法，因此重名也可以辨別，此時是構成重載。------------------------2.
     * 所謂參數列表的不同包含了數量上、類型上甚至順序上的不同，而跟形式參數的名稱無關。------------------------3.
     * 以此角度而言，就可以知道重載跟修飾訪問詞、返回值無關，因為相同條件下去調用方法代碼是相同的，計算機無從分辨!--4.
     */

    /**------1.
     * public static int test(){return 1};
     * public static double test(){return 1};
     * 編譯會出現錯誤:方法名稱重名(不構成重載)
     * 思路:兩者只有返回值不同，調用時都是test();難以分辨綁定哪個方法。
     **/

    /**------2.下列皆為重載
     * public static void test(){};---------------------2.1
     * public static void test(int a){};----------------2.2
     * public static void test(int a, int b){};---------2.3
     * public static void test(String a){};-------------2.4
     * public static void test(String a, int b){};------2.5
     * public static void test(int a, String b){};------2.6
     * 2.1 & 2.2 參數列表不同(有參或無參的不同或理解為參數在數量上不同)
     * 2.2 & 2.3 參數列表不同(參數類型相同，但在數量上不同)
     * 2.2 & 2.4 參數列表不同(參數數量相同，但在類型上不同)
     * 2.4 & 2.5 參數列表不同(參數在類型及數量上皆有不同)
     * 2.5 & 2.6 參數列表不同(參數類型與數量皆相同，但順序上不同)
     **/

    /**------3.
     * public static void test(String name){};
     * public static void test(String job){};
     * 編譯會出現錯誤:方法名稱重名(不構成重載)
     * 思路:兩者只有形參名稱不同，此時調用方法時同為test("某個字符串");難以分辨綁定哪個方法。
     **/

    /**------4.
     * //只有返回值不同:可以參考1.
     *
     * //只有修飾訪問符不同
     * public static void test(){};
     * protected static void test(){};
     * static void test(){};
     * private static void test(){};
     * 編譯會出現錯誤:方法名稱重名(不構成重載)
     * 思路:四者只有訪問修飾符不同，但此時調用方法時同為test("某個字符串");難以分辨綁定哪個方法。
     **/



}
