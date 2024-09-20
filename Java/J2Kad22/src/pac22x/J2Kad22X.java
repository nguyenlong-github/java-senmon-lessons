package pac22x;

import java.util.Scanner;

public class J2Kad22X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ファミレスECCへようこそ！");
        MenuList menuList = null;
        LunchMenu lunchMenu = null;
        DinnerMenu dinnerMenu = null;
        while (true) {
            System.out.println();
            System.out.print("何のメニューを表示しますか？（0：モーニング、1：ランチ、2：ディナー、3：すべて、-1：終了）＞");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

            // メニューの表示
            switch(n){
                case 0:
                    menuList =  new MorningMenu();
                    break;
                case 1:
                    menuList = new LunchMenu();
                    menuList.add(new DrinkMenu());
                    break;
                case 2:
                    menuList = new DinnerMenu();
                    menuList.add(new DrinkMenu());
                    menuList.add(new DessertMenu());
                    break;
                case 3:
                    menuList = new MorningMenu();
                    menuList.add( lunchMenu = new LunchMenu());
                    menuList.add(dinnerMenu = new DinnerMenu());
                    lunchMenu.add(new DinnerMenu());
                    dinnerMenu.add(new DrinkMenu());
                    dinnerMenu.add(new DinnerMenu());
                    break;
            }
            menuList.printList();

        }
    }
}
