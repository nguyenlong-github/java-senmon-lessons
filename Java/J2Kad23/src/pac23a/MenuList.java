package pac23a;

import java.util.ArrayList;
import java.util.List;



class MenuItem {
    private String name;
    private int price;
    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void printItem() { System.out.println(name + "：" + price); }
}
public class MenuList {
    protected String title;
    protected List<MenuItem> menuList = new ArrayList<>();
    public MenuList(String title) { this.title = title; }
    public void add(MenuItem item) { menuList.add(item); }
    public void printList() {
        System.out.println();
        System.out.println(title);
        for (MenuItem item : menuList) {
            item.printItem();
        }
    }
}
// サブメニュー
class DrinkMenu extends MenuList {
    public DrinkMenu() {
        super("＊ ドリンクメニュー ＊");
        add(new MenuItem("コーヒー", 220));
        add(new MenuItem("紅茶", 220));
    }
}
class DessertMenu extends MenuList {
    public DessertMenu() {
        super("＊ デザートメニュー ＊");
        add(new MenuItem("チーズケーキ", 350));
        add(new MenuItem("アイスクリーム", 150));
    }
}
// メインメニュー
class MorningMenu extends MenuList {
    public MorningMenu() {
        super("★ モーニングメニュー ★");
        add(new MenuItem("モーニングセット", 400));
        add(new MenuItem("焼き魚定食", 600));
    }
}
class LunchMenu extends MenuList {
    public LunchMenu() {
        super("★ ランチメニュー ★");
        add(new MenuItem("日替わりランチ", 680));
        add(new MenuItem("シェフのおすすめランチ", 890));
    }
}
class DinnerMenu extends MenuList {
    public DinnerMenu() {
        super("★ ディナーメニュー ★");
        add(new MenuItem("和風ハンバーグ", 680));
        add(new MenuItem("サーロインステーキ", 1180));
    }
}
// AllMenuクラス


