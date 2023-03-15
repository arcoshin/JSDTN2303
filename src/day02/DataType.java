package day02;

/**
 * 變量種類
 */
public class DataType {
    public static void main(String[] args) {
        /**
         * 1. int:整數類型，四個字節，-2^31~2^31-1(正負21億多)*/
        int a = 25;//25為整數直接量，默認為int類型
        //int b = 10000000000;//一百億默認為int類型，但超出範圍
        //int c = 3.14;//編譯錯誤，整數類型只能裝入整數

        System.out.println(5 / 2);//2
        System.out.println(2 / 5);//0
        System.out.println(5 / 2.0);//2.5
        System.out.println(5.0 / 2);//2.5

        /**
         * 溢出不是編譯或運行上的錯誤，但需要避免
         * */
        int d = 2147483647;//int的最大值
        System.out.println(d + 1);//-2147483648(int最小值)，此時發生溢出，

        /**
         * 2. long:長整數類型，八個字節，-2^63~2^63-1(正負9萬萬億多)*/
        long a1 = 25L;//25L為長整數型直接量
        //long b1 = 10000000000;//編譯錯誤，100億默認為int類型，但超出範圍
        long c1 = 10000000000L;//10000000000L為長整數型直接量
        //long d1 = 3.14;//編譯錯誤，長整數型變量只能裝整數

        /**
         * 運算時若可能出現溢出，則建議在最前面的數字加上L
         * */
        //             =20億*10L
        long e1 = 1000000000 * 2 * 10L;//200億
        System.out.println(e1);

        //             =30億*10L(其中30億默認為int類型時已溢出)
        long f1 = 1000000000 * 3 * 10L;//不是200億
        System.out.println(f1);//-12949672960

        //             =30億L*10(最前面數字先加上L即可預防上述問題)
        long g1 = 1000000000L * 3 * 10;//300億
        System.out.println(g1);

        /**
         * 3. double:雙精度浮點數類型，八個字節
         * */
        double a3 = 3.14;//3.14為小數直接量，默認為double類型
        float b3 = 3.14F;//3.14F為float類型直接量

        /**
         * double及float於運算時'可能'出現誤差 */
        double c3 = 3, d3 = 2.9;//理論:0.1
        System.out.println(c3 - d3);//實際上浮:0.10000000000000009
        double e3 = 0.3, f3 = 0.1;//理論:0.2
        System.out.println(e3 - f3);//實際下沉:0.19999999999999998
        double g3 = 6, h3 = 1.9;//理論:4.1
        System.out.println(g3 - h3);//實際:4.1

        /**
         * 4.boolean:布爾類型，僅占用一個字節*/
        boolean a4 = true;//true為布爾類型直接量
        boolean b4 = false;//false為布爾類型直接量
        //boolean c4 = 25.6;//編譯錯誤，布爾類型變量中只能存在true或false

        /**
         * 5.char:字符類型，兩個字節*/
        char a5 = '女';//字符女
        char b5 = 'f';//字符f
        char c5 = '6';//字符6
        char d5 = ' ';//空格符

        //char e5 = 女;//編譯錯誤，字符類型直接量必須放在單引號中
        //char f5 = '';//編譯錯誤，必須有字節符
        //char g5 = '10';//編譯錯誤，只能儲存一個字符

        char h5 = 65; //0~65535之間
        System.out.println(h5);
        /**此處println()會依據變量的類型做輸出展示
         h5為char類型，所以會以字符的型式輸出(A)*/


        char i5 = '\\';//使用"\"作為轉義符，就可以輸入特殊符號
        System.out.println("i5:" + i5);//\
        char j5 = '\'';
        System.out.println("j5:" + j5);//\

        /** 常見char類型數值，建議要記
         * '0'......48
         * '9'......57
         * 'A'......65
         * 'a'......97
         * */

    }
}
