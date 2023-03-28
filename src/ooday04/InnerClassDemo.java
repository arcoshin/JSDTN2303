package ooday04;

public class InnerClassDemo {
    public static void main(String[] args) {
        Mama mama = new Mama();
//        Baby baby = new Baby();//編譯錯誤，成員內部類不具有外部可見性
//        Mama.Baby baby = new Mama.Baby();//編譯錯誤，Baby並非靜態類，不可直接通過類名打點，反之則行。
    }

}
