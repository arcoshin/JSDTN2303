package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 找到2~100之間所有素數(質數)
 * 素數:除了1與本身之外，不能被其他自然數整除的數
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int[] priNum = {};
        Collection c  = new ArrayList();
        for (int i = 2; i <= 100; i++) {//題目要求2-100
            //預設皆為素數
            boolean result = true;//假設為素數，每次測試新數字都須回歸true

            //測試，沒通過則標記為false
            for (int j = 2; j < i/2; j++) {//跟2~自己-1之間的數相除，但只需檢驗一半(乘法交換律，後半重複檢驗)
                if (i % j == 0) {
                    result = false;//能被任一數(非自己)整除則必非素數
                    break;
                }
            }
            //通過測試就歸納
            if (result) {//如果通過for代表無法被整除，屬於素數，納入數組
                priNum = Arrays.copyOf(priNum, priNum.length + 1);
                priNum[priNum.length - 1] = i;
                c.add(i);
            }
        }
        System.out.println(Arrays.toString(priNum));//展示累積的數
        System.out.println(c);
        System.out.println("2~100之間共有" + priNum.length + "個素數");
    }
}
