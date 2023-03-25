package day04;

/**
 * 循環結構for展示
 */
class ForDemo {
    public static void main(String[] args) {
        //透過程序計算1+2+3+.......+98+99+100的計算結果
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("sum=" + sum);

        //輸出五次"行動是成功的階梯"
        for (int i = 0; i < 5; i++) {
            System.out.println("行動是成功的階梯");
        }
        System.out.println("程序繼續執行...");

        //輸出九九乘法表
        for (int m = 1; m <= 9; m++) {
            for (int n = 1; n <= m; n += 1) {//此處n++相當於n=n+1故也可寫作n+=1
                System.out.print(m + "x" + n + "=" + m * n + "\t");
            }
            System.out.println();
        }
        /**
         * for循環當中聲明變量僅在for循環之中生效------唯一特例(非找大括號)
         */
        //System.out.println(m);//超出變量m的作用域
        //System.out.println(n);//超出變量n的作用域

    }
}
