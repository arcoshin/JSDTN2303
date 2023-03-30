package ooday05;

public class GetterSetterDemo {
    public static void main(String[] args) {
        Point p = new Point();
        /**
         * 相當於
         * p.x = 1;
         * p.y = 2;
         */
        p.setX(1);
        p.setY(2);

        /**
         * 相當於
         * int x = p.x
         * int y = p.y
         * System.out.println(x,y);
         */
        int x = p.getX();
        int y = p.getY();
        System.out.println(x + "," + y);
    }
}
