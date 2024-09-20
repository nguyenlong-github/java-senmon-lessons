package pac23c;

import pac23d.MenuList;


import java.util.Scanner;

public class J2Kad23C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ファミレスECCへようこそ！");
        while (true) {
            System.out.print("どうしますか？（0：単品表示、1：一覧表示、-1：終了）＞");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

            //一括管理
            Component menu = null;

            // メニューの表示
            switch (n) {
                //0入力：単品表示
                case 0:
                    //モーニングセットの表示
                    menu = new MenuItem("モーニングセット",400);
                    break;
                //１入力：一覧で表示
                case 1:
                    //モーニングメニューのリストを一覧表示
                    menu = new MorningMenu();
                    break;
            }
            //nullチェック
            if(menu != null) {
                menu.print();
            }
            System.out.println();
        }
    }
}
