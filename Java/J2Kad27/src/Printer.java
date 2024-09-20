public class Printer {
    public void print(MenuItem item){
        System.out.println(item + "：" + item.getPrice() + "円" );
    }

    public void print(Menu menu){
        System.out.println();
        System.out.println(menu);
        for (var item : menu.getList()) {
            item.print(this);
        }
    }

}
class CallPrinter extends Printer{
    public void print(MenuItem item){
        System.out.println(item + "：" + item.getPrice() + "円" + "（" + item.getCal() + "Kcal）");
    }
}
class LinePrinter extends Printer{
    public void print(MenuItem item){
        System.out.print(item + " / " );

    }
}

class BlockPrinter extends Printer{
    private int level = 0; // インデントの深さ
    private void indent() {
        for (int i = 0; i < level; i++) {
            System.out.print('\t'); // インデント
        }
    }
    public void print(Menu menu){
        System.out.println();
        indent();
        System.out.println(menu + "{");
        level++;
        for (var item : menu.getList()) {
            indent();
            item.print(this);
        }
        level--;
        indent();
        System.out.println("}");
    }
}
