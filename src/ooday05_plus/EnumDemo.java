package ooday05_plus;

import java.util.Arrays;

/**
 * 枚舉類的另外一種演示
 */
enum Seasons {
    SPRING("春天", "溫暖"),
    SUMMER("夏天", "炎熱"),
    AUTUMN("秋天", "涼爽"),
    WINTER("冬天", "寒冷"),
    ;
    private String seasonName;//季節名稱
    private String seasonDesc;//季節描述

    Seasons(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    public void setSeasonDesc(String seasonDesc) {
        this.seasonDesc = seasonDesc;
    }

    @Override
    public String toString() {
        return "("
                + seasonName
                + ','
                + seasonDesc +
                ')';
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Seasons w1 = Seasons.WINTER;
        Seasons w2 = Seasons.WINTER;
        Seasons w3 = Seasons.WINTER;
        Seasons w4 = Seasons.WINTER;
        Seasons w5 = Seasons.WINTER;
        Seasons w6 = Seasons.WINTER;

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);
        System.out.println(w5);
        System.out.println(w6);

        Seasons[] seasons = Seasons.values();
        System.out.println("Seasons = " + Arrays.toString(seasons));


    }
}


