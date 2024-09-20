import java.util.ArrayList;

public class BurgerMenu implements Menu {
    private ArrayList<MenuItem> menu = new ArrayList<>();
    public BurgerMenu() {
        menu.add(new MenuItem("ハンバーガー", 150));
        menu.add(new MenuItem("チーズバーガー", 180));
        menu.add(new MenuItem("ビッグマック", 410));
    }
    public ArrayList<MenuItem> getMenu() { return menu; }

    @Override
    public MenuIterator menuIterator() {
        return new BurgerIterator(menu){
            public boolean hasNext(){
                //メニューがあればtrue
                return (i < menu.size()) ;
            }
            //次のデータへ
            public MenuItem next(){
                return menu.get(i++);
            }
        };
    }
    class BurgerIterator implements MenuIterator{
        //Cafeメニュー配列への参照
        private ArrayList<MenuItem> menu = null;
        //配列のインデックス
        int i = 0;
        //コンストラクタ
        BurgerIterator(ArrayList<MenuItem> menu){
            //menuへの参照を設定
            this.menu = menu;
        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public MenuItem next() {
            return null;
        }
        //i番目のメニューがあればtrueなければfalse
//        public boolean hasNext(){
//            //メニューがあればtrue
//            return (i < menu.size()) ;
//        }
//        //次のデータへ
//        public MenuItem next(){
//            return menu.get(i++);
//        }
    }

}


