package ooday01;

/**
 * 學生類的測試類
 */
class StudentTest {
    public static void main(String[] args) {
        /**
         * 創建一個學生對象
         */
        //張三
        Student zs = new Student("張三",24,"jsd2303","001");
        zs.sayHi();
        //李四
        Student ls = new Student("李四",25,"jsd2303","002");
        ls.sayHi();

        Student un = new Student();
        un.sayHi();
        un.study();
        un.playWith("不存在");


//        //訪問成員變量
//        zs.name = "張三";
//        zs.age = 24;
//        zs.className = "jsd2303";
//        zs.stuId = "001";
//        //調用方法
//
//        zs.sayHi();
//        zs.study();
//        zs.playWith("李四");
//
//        //李四
//        Student ls = new Student();
//        ls.name = "李四";
//        ls.age = 23;
//        ls.className = "jsd2303";
//        ls.stuId = "002";
//        ls.sayHi();
//        ls.study();
//        ls.playWith("張三");
//
//        /**
//         * 王五(不賦值):可觀察自動帶入默認值
//         * 基本類型的默認值-----0
//         * 引用類型的默認值-----null
//         */
//        Student ww = new Student();
//        ww.sayHi();
//        ww.study();
//        ww.playWith("張三");

    }
}
