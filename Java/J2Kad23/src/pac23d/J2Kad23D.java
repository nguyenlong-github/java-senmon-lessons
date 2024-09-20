package pac23d;

import java.util.Scanner;

public class J2Kad23D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ファミレスECCへようこそ！");
        while (true) {
            System.out.print("どうしますか？（0：単品表示、1：一覧表示、-1：終了）＞");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

            // メニューの表示
            switch (n) {
                //0入力：単品表示
                case 0:
                    //モーニングセットの表示
                    MenuItem menuItem = new MenuItem("モーニングセット",400);
                    menuItem.printItem();
                    break;
                //１入力：一覧で表示
                case 1:
                    //モーニングメニューのリストを一覧表示
                    MenuList menuList = new MorningMenu();
                    menuList.printList();
                    break;
            }


            System.out.println();
        }
    }
}
