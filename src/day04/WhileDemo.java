package day04;

/**
 * 循環結構while相關演示
 */
public class WhileDemo {
    public static void main(String[] args) {
        //輸出五次"行動是成功的階梯"
        int time = 0;
        while (time++ < 5) {
            System.out.println("行動是成功的階梯，這是第" + (time) + "次");
        }

        //輸出九九乘法表
        int m = 1, n = 1;
        while (m <= 9) {
            while (n <= 9) {
                System.out.println(m + "x" + n + "=" + m * n);
                n++;
            }
            m++;
            n = 1;
        }

    }
}
