package day05;

/**
 * 九九乘法表
 */
class MultiTable {
    public static void main(String[] args) {
        for (int num = 1; num <= 9 ; num++) {
            for (int i = 1; i <= num; i++) {
                System.out.print(i + "*" + num + "=" + i * num + "\t");
                /**
                 * "\t"水平製表常用，可以彈性空格(總長固定佔八位)來實現切齊
                 */
            }
            System.out.println();//分行，排版用
        }


    }
}
