package before;

import java.util.ArrayList;

interface Component {
    void print();
    void printCal();
    void printLine();
}
class MenuItem implements Component {
    private String name;
    private int price;
    private int cal;
    public MenuItem(String name, int price, int cal) {
        this.name = name;
        this.price = price;
        this.cal = cal;
    }
    public String toString() { return name; }
    public int getPrice() { return price; }
    public int getCal() { return cal; }
    public void print() { System.out.println(name + "ÅF" + price + "â~" );}
    public void printCal() { System.out.println(name + "ÅF" + price + "â~Åi" + cal + "KcalÅj" );}
    public void printLine() { System.out.print(name + " / " );}
}
public class Menu implements Component {
    private String name;
    private ArrayList<Component> menuList = new ArrayList<>();
    public Menu(String name) { this.name = name; }
    public String toString() { return name; }
    public ArrayList<Component> getList() { return menuList; }
    public void add(Component item) { menuList.add(item); }
    public void print() {
        System.out.println();
        System.out.println(name);
        for (var item : menuList) {
            item.print();
        }
    }
    public void printCal() {
        System.out.println();
        System.out.println(name);
        for (var item : menuList) {
            item.printCal();
        }
    }
    public void printLine() {
        System.out.println();
        System.out.println(name);
        for (var item : menuList) {
            item.printLine();
        }
    }
}
