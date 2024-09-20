package pac23a;

import java.util.Scanner;

public class J2Kad22A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ファミレスECCへようこそ！");
        while (true) {
            System.out.print("何のメニューを表示しますか？（0：モーニング、1：ランチ、2：ディナー、3：すべて、-1：終了）＞");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

            // メニューの表示


            System.out.println();
        }
    }
}
