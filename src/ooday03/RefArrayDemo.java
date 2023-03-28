package ooday03;

/**
 * 引用類型數組的演示
 */
public class RefArrayDemo {
    public static void main(String[] args) {
        //聲明Dog型數組dogs，包含三個元素，默認值為null
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("小黑",2,"黑");
        dogs[1] = new Dog("小白",3,"白");
        dogs[2] = new Dog("小黃",4,"黃");
        for (int i = 0; i < dogs.length; i++) {
            System.out.println("有隻狗叫做" + dogs[i].name);//調用每隻狗的名字
            /**
             * 調用每隻狗的行為
             */
            dogs[i].eat();
            dogs[i].drink();
            dogs[i].swim();
            dogs[i].lookHome();
        }

        //聲明Chick型數組chicks，包含三個元素，默認值為null
        Chick[] chicks = new Chick[3];
        chicks[0] = new Chick("小紅",1,"紅");
        chicks[1] = new Chick("小黑",1,"黑");
        chicks[2] = new Chick("小花",1,"花");
        for (int i = 0; i < chicks.length; i++) {
            chicks[i].eat();
            chicks[i].drink();
            chicks[i].layEgg();
        }

        //聲明Fish型數組fish，包含三個元素，默認值為null
        Fish[] fish = new Fish[2];
        fish[0] = new Fish("小金",2,"金");
        fish[1] = new Fish("小銀",2,"銀");
        for (int i = 0; i < fish.length; i++) {
            fish[i].eat();
            fish[i].drink();
            fish[i].swim();
        }

    }
}
