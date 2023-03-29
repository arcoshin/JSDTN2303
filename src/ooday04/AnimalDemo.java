package ooday04;

/**
 * 多態演示類
 */
class AnimalDemo {
    public static void main(String[] args) {
        //聲明Animal型數組animals，包含三個Dog型元素，三個Chick型元素，兩個Fish型元素------向上造型(自動類型轉換)
        Animal[] animals = new Animal[3 + 3 + 2];
        for (int i = 0; i < animals.length; i++) {
            animals[0] = new Dog("小黑", 1, "黑");
            animals[1] = new Dog("小黃", 1, "黃");
            animals[2] = new Dog("小白", 1, "白");
            animals[3] = new Chick("小黑", 1, "黑");
            animals[4] = new Chick("小白", 1, "白");
            animals[5] = new Chick("小黃", 1, "黃");
            animals[6] = new Fish("小黑", 1, "黑");
            animals[7] = new Fish("小白", 1, "白");

            /**
             * 訪問屬性與方法時，是由該對象目前的類型決定 : 目前全部向上造型(自動類型轉換)為Animal型
             */
            System.out.println(animals[i].name);//輸出每隻動物的名字
            animals[i].eat();//每隻動物吃飯
            animals[i].drink();//每隻動物喝水

            /**
             * 若要訪問特有數據 : 現在可以使用instanceof確認類型是否匹配，如是則向下轉型(強制轉換)為所匹配類型，即可調用特有屬性
             */
            Master master = new Master();
            if (animals[i] instanceof Dog) {//與Dog類型匹配時
                ((Dog) animals[i]).lookHome();//強轉後調用狗類特有方法
                //((Dog) animals[i]).swim();//強轉後調用狗類接口方法---------------------------但是代碼冗餘
                master.feed(animals[i]);//餵養動物方法的形參限定動物類 : 此處可發現調用方法傳參時，系統可以自動向上造型(自動類型轉換)
            }

            if (animals[i] instanceof Chick) {//與Chick類型匹類時
                ((Chick) animals[i]).layEgg();//強轉後調用雞類特有方法
                master.feed(animals[i]);//餵養動物方法的形參限定動物類 : 此處可發現調用方法傳參時，系統可以自動向上造型(自動類型轉換)
            }

            if (animals[i] instanceof Fish) {//與Fish類型匹類時
                //((Fish) animals[i]).swim();//強轉後調用魚類接口方法---------------------------但是代碼冗餘
                master.feed(animals[i]);//餵養動物方法的形參限定動物類 : 此處可發現調用方法傳參時，系統可以自動向上造型(自動類型轉換)
            }

            /**
             * 解決代碼冗餘 : 游泳接口為重複，以多態的概念強轉後調用，可以有效解決代碼冗餘問題(可讀性、擴展性都更好)
             */
            if (animals[i] instanceof Swim) {//適用於所有實現Swim接口的類
                ((Swim) animals[i]).swim();//以多態的概念解決代碼冗與
            }

            /**
             * 大師心得 : 代碼能父類絕不子類，大範圍的複用性、兼容性以及養護性都較高
             */
        }
    }
}