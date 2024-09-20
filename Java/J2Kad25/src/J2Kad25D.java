/*
	課題名：J2Kad25D「ECCフーズ（ループの復習）」
	作成日：2023/1/19
	作成者：田中太郎
*/

import java.util.Scanner;

public class J2Kad25D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("世界にはばたくECCフーズ！");
        System.out.println("ただいまM&Aで拡大中！！");

        while (true) {
            System.out.print("どのメニューを表示しますか？（0：ECCコーヒー、1：ECCドーナツ、-1：終了）＞");
            int shop = Integer.parseInt(in.next());
            if (shop < 0) break;

            switch(shop) {
                default:
                case 0:     // ECCコーヒー
                    CafeMenu cafeMenu = new CafeMenu();
                    //リスト取得
                    MenuItem menu[] = cafeMenu.getMenu();
                    //メニューを全て表示(ECCコーヒー仕様)
                    for(int i = 0 ; menu[i] != null ; i++) {
                        menu[i].print();
                    }
                    break;
                case 1:     // ECCドーナツ
                    DonutMenu donutMenu = new DonutMenu();
                    //リスト取得
                    String names[] = donutMenu.getNames();
                    int prices[] = donutMenu.getPrices();
                    //メニューを全て表示(ECCコーヒー仕様)
                    for(int i = 0 ; prices[i] != -1 ; i++) {
                        MenuItem item = new MenuItem(names[i] , prices[i]);
                        item.print();
                    }
                    break;
            }
            System.out.println();
        }
    }
}
