package collection.hw20230404;

import java.util.*;

/**
 * 拓展作業類
 */
class Extend {
    public static void main(String[] args) {
        Collection<PointForHW> c = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int x = new Random().nextInt(9) + 1;//1~9
            int y = new Random().nextInt(9) + 1;//1~9
            c.add(new PointForHW(x,y));
        }

    }
}

class PointForHW {
    private int x;
    private int y;

    PointForHW(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
