package ooday04;

/**
 * 成員內部類
 */
public class Mama {//外部類
    String name;

    void doSomething() {
    }
    
    /**
     * 成員內部類 : 極少用
     */
    class Baby {//成員內部類 :　通常只服務於外部類
        void show() {
            System.out.println(name);//簡寫
            System.out.println(Mama.this.name);//完整寫法，Mama.this指代外部類對象
//            System.out.println(this.name);//編譯錯誤，this指代當前Baby對象
        }

    }
}
