package ooday03;

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
class Dog extends Animal implements Swim{
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
        System.out.println(name + "正在看家......");
    }

    /**
     * 重寫超類抽象方法
     */
    @Override
    void eat() {
        System.out.println(name + "正在啃骨頭......");
    }

    /**
     * 重寫接口中的方法 : 一律必須public
     */
    @Override
    public void swim() {
        System.out.println(color +"色" + age +"歲的狗狗" + name + "正在游泳......");
    }
}

/**
 * 雞類
 */
class Chick extends Animal{
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
        System.out.println(name + "正在下蛋呢......");
    }

    /**
     * 重寫超類抽象方法
     */
    @Override
    void eat() {
        System.out.println(name + "正在吃小米......");
    }
}

/**
 * 魚類
 */
class Fish extends Animal implements Swim{
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
        System.out.println(name + "正在吃小蝦米......");
    }

    /**
     * 重寫接口中的方法 : 一律必須public
     */
    @Override
    public void swim() {
        System.out.println(color +"色" + age +"歲的小魚" + name + "正在游泳......");
    }
}

/**
 * 接口 Inter:可以包含抽象方法(常量、靜態方法、默認方法、私有方法...等)
 */
interface Inter {
    /**
     * 接口中已經默認所有方法結為"抽象方法"---故"abstract"為灰色
     */
    abstract void show();

    /**
     * 看似普通方法，但接口中已經默認所有方法的前綴有"abstract"，意即實為抽象方法
     */
    void test();

    /**
     * 編譯錯誤，接口中已經默認所有方法皆為抽象方法，而抽象方法不可有方法體
     */
    //void say(){};//編譯錯誤


    /**===================================================================
     * 所以接口別稱----------完全抽象的抽象類。
     * 心得 :
     * 1.屬性、行為全共有就繼承
     * 2.行為特性全不同就抽象
     * 介於中間一律建議接口 : 接口可以實現多個故越精準越佳，利於代碼擴展，越細分可越"貼身"
     ====================================================================*/
}

