package day07;

import java.util.Scanner;

/**
 * 需求:
 * 依照淡旺季、艙等(經濟、商務、頭等)收費
 * 輸入機票的原價、月份及艙等自動實現不同折扣計算票價
 * <p>
 * 其中:
 * 旺季5~10月:頭等艙九折、商務艙八五折、經濟艙八折
 * 淡季11~4月:頭等艙七折、商務艙六五折、經濟艙六折
 */
class CalAirPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入原始價格");
        double price = scanner.nextDouble();
        System.out.println("請輸入月份");
        int month = scanner.nextInt();
        System.out.println("請選擇艙位: 1.頭等艙 2.商務艙 3.經濟艙");
        int type = scanner.nextInt();

        double finalPrice = calFinalPrice(price, month, type);

        if (finalPrice != -1) {//返回-1都是有錯誤的
            System.out.println("機票的最終價格為:" + finalPrice);
        }
    }

    /**
     * 計算機票價格的方法
     */
    private static double calFinalPrice(double price, int month, int type) {
        double finalPrice = price;//接收價格
        /**
         * 先驗證數據有無錯誤，若錯誤一律返回-1
         */
        if (price < 0) {
            System.out.println("票價輸入錯誤");
            return -1;
        }
        if (month < 1 || month > 12) {
            System.out.println("月份輸入錯誤");
            return -1;
        }
        if (type < 1 || type > 3) {
            System.out.println("艙位輸入錯誤");
            return -1;
        }

        /**
         * 確認資料無誤後才會直接走進這邊的折扣分支
         * (程序走到這代表數據一定正常無誤)
         */
        switch (type) {
            case 1:
                if (month >= 5 && month <= 10) {//旺季
                    finalPrice *= 0.9;
                } else {//旺季以外但輸入正確的月份(淡季)
                    finalPrice *= 0.7;
                }
                break;

            case 2:
                if (month >= 5 && month <= 10) {//旺季
                    finalPrice *= 0.85;
                } else {//旺季以外但輸入正確的月份(淡季)
                    finalPrice *= 0.65;
                }
                break;

            case 3:
                if (month >= 5 && month <= 10) {//旺季
                    finalPrice *= 0.8;
                } else {//旺季以外但輸入正確的月份(淡季)
                    finalPrice *= 0.6;
                }
                break;

        }
        return finalPrice;
    }
}
