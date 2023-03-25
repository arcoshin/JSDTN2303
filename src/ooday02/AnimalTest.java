package ooday02;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("來福", 12, "黑");
        dog.eat();
        dog.drink();
        dog.lookHome();

        Chick chick = new Chick("嗶嗶", 1, "黃");
        chick.eat();
        chick.drink();
        chick.layEgg();

        Fish fish = new Fish("提莫", 30, "橘");
        fish.eat();
        fish.drink();

    }
}
