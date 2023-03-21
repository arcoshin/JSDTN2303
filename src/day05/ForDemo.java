package day05;

/**
 * For的特殊格式及關鍵字Break、Continue的演示
 */
public class ForDemo {
    public static void main(String[] args) {
        //break
        for (int num = 1; num <= 9; num++) {
            if (num == 4) {//某種特定條件下提前結束循環
                break;     //跳出循環，通常跟if搭配使用
            }
            System.out.println(num + "*9" + num * 9);
        }

        //continue:輸出9的乘法表，但跳過被3整除的
        for (int num = 0; num <= 9; num++) {
            if (num % 3 == 0) {
                continue;//跳過循環體中剩餘的語句而進入到下一個循環
            }
            System.out.println(num + "*9" + num * 9);
        }

        //continue:輸出9的乘法表，僅輸出不可被3整除的
        for (int num = 0; num <= 9 ; num++) {

        }

        /**
         * For循環可以省略內部的條件(通常是換個地方寫)
         * 但是即便是全部省略仍必須保留分號
         */
        int a = 1;
        for (; a < 4; a++) {
            System.out.println("省略聲明循環變量");
        }

        for (int b = 0; b < 5; ) {
            System.out.println("省略變量本身的改變，但應該移至執行體，否則成為死循環");
            b++;
        }

        for (; ; ) {//通常終止條件不省略，因為這就是一個無條件死循環
        }
    }
}
