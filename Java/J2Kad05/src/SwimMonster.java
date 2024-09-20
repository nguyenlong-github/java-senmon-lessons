public class SwimMonster extends Monster{

    public SwimMonster(){
        System.out.println("FlyMonster のコンストラクタが呼び出されました！\n");
    }
    public void swim() {
        //hp <= 0 のとき、「疲れて泳げないよ?」と表示する。そうでないとき、「?が泳ぐよ！ぶくぶく･･･」（?は名前）と表示し、hp を1 減らす。
        if(hp <= 0){
            System.out.println("疲れて泳げない");
        }else{
            System.out.println(name + "が泳ぐよ！ぶくぶく･･･");
            hp--;
        }
    }
    public void walk() {
        //「尾びれだと歩けないよ?」と表示する。
        System.out.println("尾びれだと歩けないよ?");
    }
    public void intro() {
        //Monster クラスのintro メソッドを呼び出した後、「泳ぎも得意さ！」と表示する。
        super.intro();
        System.out.println("泳ぎも得意さ！");
    }

}
