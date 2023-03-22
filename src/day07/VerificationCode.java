package day07;

import java.util.Random;

/**
 * 隨機生成N位驗證碼(大小寫字母+數字)
 */
public class VerificationCode {
    /**
     * 生成N位驗證碼
     */
    private static String createVerificationCode(int len) {
        String code = "";
        for (int i = 1; i <= len; i++) {
            int chance = new Random().nextInt(3) + 1;//1~3
            switch (chance) {
                case 1://生成數字
                    code += createNum();//隨機生成數字0~9的字符串
                    break;
                case 2://生成大寫
                    code += createBigEng();//隨機生成數字A~Z的字符串
                    break;
                case 3://生成小寫
                    code += createSmaEng();//隨機生成數字a~z的字符串
                    break;
            }
        }
        return code;
    }

    /**
     * 隨機生成數字0~9的字符
     */
    private static char createNum() {
        int index = new Random().nextInt(10) + 48;//48~57
        return (char) index;
    }

    /**
     * 隨機生成大寫字母A~Z的字符
     */
    private static char createBigEng() {
        int index = new Random().nextInt(26) + 65;//65~90
        return (char) index;
    }

    /**
     * 隨機生成小寫字母a-z的字符
     */
    private static char createSmaEng() {
        int index = new Random().nextInt(26) + 97;//97~122
        return (char) index;
    }

    /**
     * 程序入口
     */
    public static void main(String[] args) {
        String code = createVerificationCode(6);
        System.out.println(code);
//        int a = '0';
//        System.out.println(a);//48
//        int b = '9';
//        System.out.println(b);//57
//        int c = 'A';
//        System.out.println(c);//65
//        int d = 'Z';
//        System.out.println(d);//90
//        int e = 'a';
//        System.out.println(e);//97
//        int f = 'z';
//        System.out.println(f);//122
    }
}
