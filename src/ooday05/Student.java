package ooday05;

/**
 * 靜態變量演示類 : 以Student類為例
 */
abstract class Student {
    /**
     * 成員變量
     */
    String name;//實例變量，屬於對象
    int age;//實例變量，屬於對象
    String address;//實例變量，屬於對象
    static String className;//靜態變量(或稱類變量)，屬於類本身

    static {//給靜態變量賦初始值
        className = "jsd2303";//每次傳參班級名稱過程麻煩且代碼冗餘------可作為靜態資源
    }

    public Student(String name, int age, String address) {//給實例變量賦初始值
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 方法
     */
    void eat() {
        System.out.println(name + "正在吃飯...");
    }

    void sleep() {
        System.out.println(name + "正在睡覺...");
    }

    abstract void sayHi();//抽象方法

}

