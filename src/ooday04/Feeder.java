package ooday04;

/**
 * 飼主類
 */
public class Feeder {
    /**
     * 餵動物的行為 ------可發現若傳參類型為子類，系統會自動向上造型
     */
    void feed(Animal animal) {
        animal.eat();
    }
//
//    /**
//     * 餵狗的行為
//     */
//    void feed(Dog dog) {
//        dog.eat();
//    }
//    /**
//     * 餵雞的行為
//     */
//    void feed(Chick chick) {
//        chick.eat();
//    }
//    /**
//     * 餵魚的行為
//     */
//    void feed(Fish fish) {
//        fish.eat();
//    }
}
