/*
	課題名：J2Kad25A「ECCフーズ（M＆A）」
	作成日：2023/1/19
	作成者：田中太郎
*/

import java.util.Scanner;

public class J2Kad25A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("世界にはばたくECCフーズ！");
        System.out.println("ただいまM&Aで拡大中！！");

        while (true) {
            System.out.print("どのメニューを表示しますか？（0：ECCコーヒー、1：ECCドーナツ、2：ECCバーガー、-1：終了）＞");
            int shop = Integer.parseInt(in.next());
            if (shop < 0) break;

            // J2Kad25Bのコードをコピーして、2：ECCバーガーを追加すること

            MenuIterator menu = null;

            switch(shop) {
                default:
                case 0:     // ECCコーヒー
                    menu = new CafeMenu().menuIterator();
                    break;
                case 1:     // ECCドーナツ
                    menu = new DonutMenu().menuIterator();
                    break;
                case 2:     // ECCドーナツ
                    menu = new BurgerMenu().menuIterator();
                    break;
            }
            if(menu != null){
                while (menu.hasNext()){
                    menu.next().print();
                }
            }

            System.out.println();
        }
    }
}
