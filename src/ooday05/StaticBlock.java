package ooday05;

/**
 * 靜態代碼塊
 */
public class StaticBlock {
    static {//靜態代碼塊
        System.out.println("靜態代碼塊");
    }

    public StaticBlock() {
        System.out.println("構造方法");
    }
}