package pac23x;

import java.util.Scanner;

public class J2Kad23X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("ガチャガチャをします！");
        while(true) {
            // 現在のコインの有無を表示


            System.out.print("どうしますか？（0：コインを入れる、1：ハンドルを回す、2：返却ボタンを押す、-1：終わる）＞");
            int cmd = Integer.parseInt(in.next());
            if (cmd < 0) break;

            // 作成すること

        }
    }
}
