public class FireMonster extends Monster{
    FireMonster(String name){
        //Monster クラスのコンストラクタを呼び出す。引数name をそのまま渡す。
        super(name);
    }
    public void intro(){
        //Monster クラスのintro メソッドを呼び出したのち、「炎も出せるよ！」と表示する
        super.intro();
        System.out.println("炎も出せるよ！");
    }
    public void fire(){
        //「～は炎をはいた！ゴオ～!!」（～は名前）と表示する。
        System.out.println(name + "は炎をはいた！ゴオ～!!");
    }
}
