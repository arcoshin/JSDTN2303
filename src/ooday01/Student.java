package ooday01;

/**
 * 學生模板類
 */
public class Student {
    /**
     * 成員變量
     */
    String name;
    int age;
    String className;
    String stuId;


    /**
     * 構造方法:給成員變量賦值
     */
    Student() {
        this("無名氏",999,"未知","未知");
        /**
         * this():方法中調用構造方法(其實就是聲明一個對象給相同值的意思)
         * 很少用，知道就行，因為即便不傳參去賦值給成員變量，在new的當下系統就會給予默認值;
         */

    }

    /**
     * this關鍵字表示"當前對象"(誰調用就是表示誰)
     * this關鍵字只能在方法中使用，用來訪問該類的成員變量
     * 一般方法中會默認使用(除非難以辨別)
     */
    Student(String name,int age,String className,String stuId){//構造方法(必須與類同名且沒有返回值也無void)
        this.name = name;//此時this不可省略
        this.age = age;//此時this不可省略
        this.className = className;//此時this不可省略
        this.stuId = stuId;//此時this不可省略
    }

    /**
     * 方法
     */
    void study() {
        System.out.println(this.name + "正在學習...");
    }

    void sayHi() {
        System.out.println("大家好，我叫" + this.name + "，今年" + this.age + "歲，學號是" + this.stuId + "，目前在" + this.className + "學習...");
    }

    void playWith(String anotherName) {
        System.out.println(this.name + "正在和" + anotherName + "一起玩......");
    }



}
