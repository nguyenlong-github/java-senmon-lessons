package pac23c;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

interface Component{
    public void print();
}

class MenuItem implements Component {
    private String name;
    private int price;
    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }
//    public void printItem() { System.out.println(name + "：" + price); }

    @Override
    public void print() {
        //単品表示
        System.out.println(name + "：" + price);
    }
}
public class MenuList implements Component{
    protected String title;
    protected List<MenuItem> menuList = new ArrayList<>();
    public MenuList(String title) { this.title = title; }
    public void add(MenuItem item) { menuList.add(item); }

//    public void printList() {
//        //モーニングセットを一覧表示
//        System.out.println();
//        System.out.println(title);
//        for (MenuItem item : menuList) {
//            item.printItem();
//        }
//    }

    @Override
    public void print() {
        //モーニングセットを一覧表示
        System.out.println();
        System.out.println(title);
        for (MenuItem item : menuList) {
            item.print();
        }
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
