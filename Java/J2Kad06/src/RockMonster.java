public class RockMonster extends Monster{
    RockMonster(String name){
        //Monster クラスのコンストラクタを呼び出す。引数name をそのまま渡す。
        super(name);
    }
    public void intro(){
        //Monster クラスのintro メソッドを呼び出したのち、「炎も出せるよ！」と表示する
        super.intro();
        System.out.println("とても硬いぜ！");
    }
    public void defend(){
        //「～は炎をはいた！ゴオ～!!」（～は名前）と表示する。
        System.out.println(name + "は防御している！ダメージを与えられない!!");
    }
}

