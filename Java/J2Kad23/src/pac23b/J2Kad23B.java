package pac23b;

import pac23b.Component;

import java.util.Scanner;

public class J2Kad23B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ファミレスECCへようこそ！");
        while (true) {
            System.out.print("何のメニューを表示しますか？（0：モーニング、1：ランチ、2：ディナー、-1：終了）＞");
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
                //１入力：ランチメニューの表示
                case 1:
                    //ランチメニューの表示
                    menu = new LunchMenu();
                    break;
                //２入力：ディナーメニューの表示
                case 2:
                    //ディナーメニューの表示
                    menu = new DinnerMenu();
                    break;
            }
            //nullチェック
            if(menu != null) {
                menu.print();
            }
            System.out.println();


            System.out.println();
        }
    }
}
