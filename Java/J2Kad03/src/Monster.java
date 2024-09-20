public class Monster {
    private String name;
    private int hp;

    //コンストラクタ, newしたとき呼ばれるメソッド
    Monster(){
        setData("まだないよ?", 1);
    }
    Monster(String n , int h){
        name = n;
        hp = h;
    }
    public void setData(String n, int h) {
        name = n;
        hp = h;
    }
    public void showData() {
        System.out.println("ぼくの名前は" + name + "、HPは" + hp + "だよ！");
    }
    public void walk() {
        if (hp <= 0) {
            System.out.println("つかれて歩けないよ～");
            return;
        }
        System.out.println("てくてく・・・");
        hp--;
    }
    public void sleep() {
        System.out.println("ぐうぐう・・・");
        hp++;
    }

    public void setName(String name) {
//        name のセッター。引数name が「ゲレゲレ」のときは「ゲレゲレなんていやだ?」と
//        表示して、名前を設定しない。
        if(name.equals("ゲレゲレ")){
            System.out.println(name + "なんて名前はいやだ?");
        }else{
            this.name = name;
        }
    }
    public void setHp(int hp) {
//        hp のセッター。引数hp が0 以下のときは「せめてHP、1 はちょうだい！」と
//        表示して、1 を設定する。
        if(hp <= 0){
            System.out.println("せめてHP、1 はちょうだい！");
            this.hp = 1;
        }else{
            this.hp = hp;
        }
   }
}
