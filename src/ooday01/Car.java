package ooday01;

/**
 * 汽車模板類
 */
class Car {
    /**
     * 屬性
     */
    String brand;//品牌
    String color;//顏色
    double price;//價格

    /**
     * 構造器
     * @param brand 品牌
     * @param color 車色
     * @param price 車價
     */
    public Car(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public Car() {
    }

    void start() {//發動
        System.out.println("這台" + brand + "牌(價值約" + price + "元)的" + color + "色車發動了");
    }

    void run() {//行駛
        System.out.println("這台" + brand + "牌(價值約" + price + "元)的" + color + "色車開始行駛了");
    }

    void stop() {//煞車
        System.out.println("這台" + brand + "牌(價值約" + price + "元)的" + color + "色車停下來了");
    }
}