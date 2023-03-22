package day07;

public class Test {
    static String q1 = getQuestionName(1,"XXX");
    private static String getQuestionName(int n,String title) {
        String questionName = n + "." + title;
        return questionName;
    }
    private static void use() {
        System.out.println(q1);
    }

    public static void main(String[] args) {
        use();

    }

}
