package day06;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //獲取類對象
        Class cls = HomeworkChecker.class;

        String name = cls.getName();
        System.out.println("全類名: " + name);

        name = cls.getSimpleName();
        System.out.println("純類名: " + name);

        Method[] methods = cls.getMethods();
        System.out.println(name + "共有" + methods.length + "個公開方法");
        for (Method method : methods) {
            System.out.print(method.getName() + " ");
        }
        System.out.println();


        Method[] declaredMethods = cls.getDeclaredMethods();
        System.out.println(name + "共有" + methods.length + "個方法");
        for (Method declaredMethod : declaredMethods) {
            System.out.print(declaredMethod.getName() + " ");
        }
        System.out.println();

        String className = "day06.HomeworkChecker";
        Class classReflection = Class.forName(className);//相當於類名.class，但此種方式較靈活

        Object o1 = classReflection.newInstance();//實例化對象(obj類型)
        System.out.println("o1 = " + o1);

        Constructor constructor = classReflection.getConstructor();
        Object o2 = constructor.newInstance();
        System.out.println("o2 = " + o2);

        Method[] methodsList = classReflection.getDeclaredMethods();
        for (Method method : methodsList) {
            System.out.print(method + " ");
        }
        System.out.println();

        Method method1 = classReflection.getMethod("say");//調用無參方法
        method1.invoke(o1);//這個無參無返方法已執行
        method1.invoke(o2);//這個無參無返方法已執行

        Method method2 = classReflection.getMethod("say",int.class,int.class);//調用無參方法
        method2.invoke(o1,1,1);//這個2參無返方法已執行
        method2.invoke(o2,2,3);//這個5參無返方法已執行

        /**
         * 暴力破解
         * getDeclaredMethod()獲取本類中定義的方法(包含私有)
         * 強行打開訪問權限:setAccessible(true);
         */
        Method method3 = classReflection.getDeclaredMethod("question1");
        method3.setAccessible(true);
        method3.invoke(o1);
        method3.invoke(o1);
        method3.setAccessible(false);//用完記得關閉


    }
}
