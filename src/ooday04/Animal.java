package ooday04;

/**
 * 動物們的父類---動物類
 */
abstract class Animal {
    /**
     * 共有屬性
     */
    String name;
    int age;
    String color;

    /**
     * 構造器
     */
    Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    /**
     * 共有方法
     */
    void drink() {
        System.out.println(color + "色" + age + "歲的" + name + "正在喝水......");
    }

    /**
     * 抽象方法
     */
    abstract void eat();
}

/**
 * 狗類
 */
class Dog extends Animal implements Swim {
    /**
     * 子類構造 : super()調用父類有參構造器
     */
    Dog(String name, int age, String color) {
        super(name, age, color);
    }

    /**
     * 特有方法
     */
    void lookHome() {
        System.out.println(color + "色" + age + "歲的狗狗" + name + "正在看家......");
    }

    /**
     * 重寫超類抽象方法
     */
    @Override
    void eat() {
        System.out.println(color + "色" + age + "歲的狗狗" + name + "正在啃骨頭......");
    }

    /**
     * 重寫接口中的方法 : 一律必須public
     */
    @Override
    public void swim() {
        System.out.println(color + "色" + age + "歲的狗狗" + name + "正在游泳......");
    }
}

/**
 * 雞類
 */
class Chick extends Animal {
    /**
     * 子類構造 : super()調用父類有參構造器
     */
    Chick(String name, int age, String color) {
        super(name, age, color);
    }

    /**
     * 特有方法
     */
    void layEgg() {
        System.out.println(color + "色" + age + "歲的小雞" + name + "正在下蛋呢......");
    }

    /**
     * 重寫超類抽象方法
     */
    @Override
    void eat() {
        System.out.println(color + "色" + age + "歲的小雞" + name + "正在吃小米......");
    }
}

/**
 * 魚類
 */
class Fish extends Animal implements Swim {
    /**
     * 子類構造 : super()調用父類有參構造器
     */
    Fish(String name, int age, String color) {
        super(name, age, color);
    }

    /**
     * 重寫超類抽象方法
     */
    @Override
    void eat() {
        System.out.println(color + "色" + age + "歲的小魚兒" + name + "正在吃小蝦米......");
    }

    /**
     * 重寫接口中的方法 : 一律必須public
     */
    @Override
    public void swim() {
        System.out.println(color + "色" + age + "歲的小魚兒" + name + "正在游泳......");
    }
}

/**
 * 游泳接口類
 */
interface Swim {
    /**
     * 接口中已經默認所有方法結為"抽象方法"---故"abstract"為灰色
     * 看似普通方法，但接口中已經默認所有方法的前綴有"abstract"，意即實為抽象方法，不可有方法體
     */
    abstract void swim();
}

/**
 * 飼主類
 */
class Master {
    /**
     * 餵動物的行為 ------可發現若傳參類型為子類，系統會自動向上造型
     */
    void feed(Animal animal) {
        animal.eat();
    }
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