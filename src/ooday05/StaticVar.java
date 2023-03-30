package ooday05;

public class StaticVar {
    int a;//實例變量
    static int b;//靜態變量

    public StaticVar() {
        a++;
        b++;
    }

    void show() {
        System.out.println("a=" + a + ",b=" + b);
    }

}
