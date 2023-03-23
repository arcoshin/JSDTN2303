package ooday01;

/**
 * Car類測試類
 */
public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("TOYOTA","白",1000000);
        car1.stop();

        Car car2 = new Car("SUBARU","藍",1300000);
        car2.start();

        Car car3 = new Car("MITSUBISHI","灰",500000);
        car3.run();
    }
}
