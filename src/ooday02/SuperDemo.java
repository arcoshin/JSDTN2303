package ooday02;

class SuperDemo {
    public static void main(String[] args) {
        Boo b = new Boo();
        Doo d = new Doo();
        /**
         * 可發現:
         * 1.即便子類構造器中沒有調用超類構造器
         * Java在調用子類構造器時會"自動默認調用父類的無參構造方法:super()"
         *
         * 2.但若超類中沒有無參構造方法，則此時子類構造器中的super()不可省略
         */


    }
}
class Aoo {
    Aoo() {
        System.out.println("超類A的構造方法已執行!!");
    }
}

class Boo extends Aoo{
    Boo() {
        //super();//系統默認執行，自動調用父類無參構造器
        System.out.println("派生類B的構造方法已經被執行了");
    }
}
class Coo {
    Coo(int n) {
        System.out.println("超類C的構造方法已執行!!");
    }
}

class Doo extends Coo{
    Doo() {
        super(0);//因為父類沒有無參構造，此時子類構造器中的super()不可省略
        System.out.println("派生類D的構造方法已經被執行了");
//        super(0);//因為父類沒有無參構造，此時子類構造器中的super()不可省略//如需調用super()則必須放於第一行

    }
}
