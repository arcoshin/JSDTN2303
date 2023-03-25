package ooday01;

interface Something {
    public final static double PI = 3.14;//自動變成常量

    void run();//自動成為抽象方法不考有方法體

    static void eat(String n){//除非聲明為靜態(類方法:類名打點使用)
        System.out.println("Eating " + n);
    }

    abstract void sleep();

    public static void main(String[] args) {
        Something.eat("noddle");
        System.out.println(Something.PI);
    }
}
