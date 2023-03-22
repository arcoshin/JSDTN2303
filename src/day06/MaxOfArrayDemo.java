package day06;

import java.util.Arrays;
import java.util.Random;

/**
 * 求數組最大值，並將其儲存到數組最後一個元素的下一個位置(擴容)
 */
public class MaxOfArrayDemo {
    public static void main(String[] args) {
        /**
         * 練習:創建一個數組包含元素10個，並賦值0~99的隨機數
         */
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {//遍歷arr數組
            arr[i] = (int) (Math.random() * 100);//將隨機數賦值給每個元素
            System.out.println(arr[i]);//輸出遍歷
        }

        /**
         * 利用遍歷求數組中元素的最大值
         */
        int max = arr[0];//假設第一個元素為最大值
        for (int i = 1; i < arr.length; i++) {//i=1，因為不需要跟自己比較
            if (arr[i] > max) {//如果元素對象比max還大則走此分支
                max = arr[i];//將max修改為當前這個較大的元素
            }
        }
        System.out.println("最大值為:" + max);//取出最大值

        /**
         * 承上同理，利用遍歷求數組中元素的最小值
         */
        int min = arr[0];//假設第一個元素為最小值
        for (int i = 1; i < arr.length; i++) {//i=1，因為不需要跟自己比較
            if (arr[i] < min) {//如果元素對象比min還小則走此分支
                min = arr[i];//將max修改為當前這個較小的元素
            }
        }
        System.out.println("最小值為:" + min);//取出最小值

        arr = Arrays.copyOf(arr, arr.length + 1);//擴容
        arr[arr.length - 1] = max;//將最大值賦值到最後一個元素
        System.out.println("擴容後:" + Arrays.toString(arr));


    }
}
