import static java.awt.SystemColor.menu;

public class DonutMenu implements Menu{
    private String[] names = new String[100];
    private int[] prices = new int[100];

    public DonutMenu() {
        names[0] = "ハニーディップ";
        prices[0] = 120;

        names[1] = "ハニーチュロ";
        prices[1] = 130;

        names[2] = "チョコリング";
        prices[2] = 140;

        prices[3] = -1;                  // 終了コード
    }
    public String[] getNames() { return names; }
    public int[] getPrices() { return prices; }
    @Override
//    public MenuIterator menuIterator() {
//        //DonutIteratorを生s成し返す
//        return new DonutIterator(names, prices);
//    }
    public MenuIterator menuIterator() {
        //DonutIteratorを生s成し返す
        return new DonutIterator(names, prices){
            public boolean hasNext() {
                //i番目のメニューがあればtrue
                //return names[i] != null;
                return prices[i] != -1;

            }
            public MenuItem next(){
                //i番目のメニュー
                return new MenuItem(names[i], prices[i++]);
            }
        };
    }
    static class DonutIterator implements MenuIterator{
        //Donutのメニュー配列への参照
        private String names[] = null;
        //Donutの値段配列への参照
        private int prices[] = null;
        //配列のインデックス
        int i = 0;

        //コンストラクタ
        DonutIterator(String names[] , int prices[]){
            //メニュー配列の参照を設定
            this.names = names;
            //値段配列の参照を設定
            this.prices = prices;
        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public MenuItem next() {
            return null;
        }
//        public boolean hasNext() {
//            //i番目のメニューがあればtrue
//            //return names[i] != null;
//            return prices[i] != -1;
//
//        }
//        public MenuItem next(){
//            //i番目のメニュー
//            return new MenuItem(names[i], prices[i++]);
//        }
    }

}