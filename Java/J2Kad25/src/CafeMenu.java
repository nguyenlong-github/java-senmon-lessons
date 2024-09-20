public class CafeMenu implements Menu{
    private MenuItem[] menu = new MenuItem[100];
    public CafeMenu() {
        menu[0] = new MenuItem("ドリップコーヒー", 390);
        menu[1] = new MenuItem("アールグレイ", 430);
        menu[2] = new MenuItem("オレンジジュース", 220);
        menu[3] = null;         // 終了コード
    }
    public MenuItem[] getMenu() { return menu; }

    @Override
    public MenuIterator menuIterator() {
        //CafeIteratorを生成し返す
        return new CafeIterator(menu){public boolean hasNext(){
            //メニューがあればtrue
            return menu[i] != null;
        }
            //次のデータへ
            public MenuItem next(){
                return menu[i++];
            }};
    }
    static class CafeIterator implements MenuIterator{
        //Cafeメニュー配列への参照
        private MenuItem menu[] = null;
        //配列のインデックス
        int i = 0;
        //コンストラクタ
        CafeIterator(MenuItem menu[]){
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
//            return menu[i] != null;
//        }
//        //次のデータへ
//        public MenuItem next(){
//            return menu[i++];
//        }
}

}
