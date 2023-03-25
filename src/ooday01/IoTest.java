package ooday01;

import java.io.*;

class IoTest {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("./src/day00/demo/test.txt");
//        fos.close();

        FileInputStream fis = new FileInputStream("./src/day00/demo/test.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        /**
         * String readline()
         * 該方法會連續讀取若干字符，直到換行符為止
         * 然後將換行符之前的內容以字符串形式返回
         * 如果單獨讀取了空行，那麼返回一個空字符串
         * 如果到了文件末尾，返回null
         */
        String line;
        String test[] = new String[10];
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            FileFilter f1 = new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    String name = pathname.getName();//pathname表示當前每個被過濾的對象
                    System.out.println("正在過濾:" + name);
                    return name.contains("1.");
                }
            };
        }
        br.close();
    }
}
