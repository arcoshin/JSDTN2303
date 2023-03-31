package ooday05_plus;

enum ThreeBrothers {
    MAX("劉備"),
    MID("關羽"),
    MIN("張飛");
    private String name;

    ThreeBrothers(String name) {
        this.name = name;
    }


}

class ThreeBrothersTest{
    public static void main(String[] args) {
        ThreeBrothers max = ThreeBrothers.MAX;
        System.out.println(max.name());

    }
}
