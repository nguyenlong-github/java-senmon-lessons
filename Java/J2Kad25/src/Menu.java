class MenuItem {
    private String name;
    private int price;
    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void print() { System.out.println(name + "：" + price + "円"); }

}
interface MenuIterator{
    boolean hasNext();
    MenuItem next();
}
interface Menu{
    MenuIterator menuIterator();
}