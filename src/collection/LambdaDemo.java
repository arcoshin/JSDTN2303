package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Lambda表達式
 * <p>
 * (參數類型) -> {
 * 方法體
 * }
 */
public class LambdaDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        /**
         * 匿名內部類的Lambda表達式寫法(參數列表)->{方法體}
         */
        Collections.sort(list, (o1, o2) -> {
                    return o1.length() - o2.length();
                }
        );

        /**
         * 若方法體中只有一句代碼，{}可不寫，同時如果有return也應一併刪除
         */
        Collections.sort(list,((o1, o2) -> o1.length() - o2.length()));

        /**
         * 若參數只有一個，參數也可以省略，但此處不適用
         */
    }
}
