package day07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 需求:
 * N個分數，去頭去尾求平均
 */
class CalTotalAvg {
    /**
     * 程序入口
     */
    public static void main(String[] args) {
        double[] scoreList = getScoreList(10);//接收N個數的數組
        double[] scores = cutBiggestAndSmall(scoreList);//去除最大與最小值
        System.out.println("切除後的元素列表" + Arrays.toString(scores));//輸出去除結果，打樁語句
        double scoreAvg = getScoreAvg(scores);//求所給數組的元素平均(去除後的數組)
        double scoreSum = getScoreSum(scores);//求所給數組中數據總和(去除後的數組)
        System.out.println("依照要求所求的總分分數為:" + scoreSum);
        System.out.println("依照要求所求的平均分數為:" + scoreAvg);
    }

    /**
     * 接收分數形成數組的方法
     */
    private static double[] getScoreList(int count) {
        double[] scoreList = new double[count];
        for (int i = 0; i < scoreList.length; i++) {
            System.out.println("請輸入第" + (i + 1) + "個成績...");
            scoreList[i] = new Scanner(System.in).nextInt();
        }
        return scoreList;
    }

    /**
     * 計算所給數組平均數的方法
     */
    private static double getScoreAvg(double[] scoreList) {
        //數組數據求平均
        double sum = getScoreSum(scoreList);//求數組總分
        double length = scoreList.length;//求個數
        double avg = sum / length;//平均 = 總分 / 個數

        //返回所求
        return avg;

    }

    /**
     * 去除所給數組中最大值跟最小值的方法
     */
    private static double[] cutBiggestAndSmall(double[] scoreList) {
        //使用 Arrays.sort() 完成自然排列(小到大)
        Arrays.sort(scoreList);

        //縮容去除末尾完成刪除最大值
        scoreList = Arrays.copyOf(scoreList, scoreList.length - 1);//縮容去除最末位(去除最大值)

        //將欲刪除對象以末尾元素賦值，再以縮容去除最末元素，即完成刪除最小值
        scoreList[0] = scoreList[scoreList.length - 1];//將此時的最末位賦值(覆蓋)給首位元素
        scoreList = Arrays.copyOf(scoreList, scoreList.length - 1);//再次縮容去除最末位(覆蓋首位元素去除最小值)

        return scoreList;
    }

    /**
     * 計算所給數組數據總和的方法
     */
    private static double getScoreSum(double[] scoreList) {
        double sum = 0;//接收數組總分
        for (double s : scoreList) {
            sum += s;//求和
        }

        return sum;
    }

}
