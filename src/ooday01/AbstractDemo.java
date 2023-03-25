package ooday01;

abstract class AbstractDemo {
    /**
     * 訪問修飾符 不可用private
     */
    abstract void getNothing(String isPrivate, byte num);



    protected abstract void getNothing(String isProtected, short num);



    abstract void getNothing(String isProtected, char num);



    public abstract void getNothing(String isPublic, int num);


    /**
     * 靜態?都不行，抽象方法不能有方法體，當然不能是靜態方法(類方法)，否則直接調用時會出錯(類名.方法名)
     */
    protected abstract void getNothing(String isProtected, short num,boolean r);



    abstract void getNothing(String isProtected, char num,boolean r);



    public abstract void getNothing(String isPublic, int num,boolean r);


}
class TestSomething1 extends AbstractDemo{

    @Override
    void getNothing(String isPrivate, byte num) {

    }

    @Override
    protected void getNothing(String isProtected, short num) {

    }

    @Override
    void getNothing(String isProtected, char num) {

    }

    @Override
    public void getNothing(String isPublic, int num) {

    }

    @Override
    protected void getNothing(String isProtected, short num, boolean r) {

    }

    @Override
    void getNothing(String isProtected, char num, boolean r) {

    }

    @Override
    public void getNothing(String isPublic, int num, boolean r) {

    }
}//全部要求重寫

class TestSomething2 implements Something {
    public static void main(String[] args) {
        Something.main(args);//執行接口中的main方法
    }

    @Override
    public void run() {

    }

    @Override
    public void sleep() {

    }
}




