package day04;

/**
 * 循環結構for展示
 */
public class ForDemo {
    public static void main(String[] args) {
        //輸出五次"行動是成功的階梯"
        for (int i = 0; i < 5; i++) {
            System.out.println("行動是成功的階梯");
        }
        System.out.println("程序繼續執行...");

        //輸出九九乘法表
        for (int m = 1; m <= 9; m++) {
            for (int n = 1; n <= 9; n++) {
                System.out.println(m + "x" + n + "=" + m * n);
            }
        }
        /**
         * for循環當中聲明變量僅在for循環之中生效------唯一特例(非找大括號)
         */
        //System.out.println(m);//超出變量m的作用域
        //System.out.println(n);//超出變量n的作用域
    }
}
