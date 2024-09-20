import java.util.Scanner;

public class UserPlayer extends BasePlayer{
    private Scanner in = new Scanner(System.in);
    UserPlayer(){
        System.out.println("UserPlayer のコンストラクタが呼び出されました！");
        System.out.print("あなたの名前を入力してください＞");
        name = in.next();
    }
    public void intro(){

        System.out.println("名前：" + name + "・・・あなたが操作するプレイヤーです。");
    }
    public int takeStone(int stone){
        System.out.print("何個取りますか？（1-3）＞");
        take = in.nextInt();
        stone -= take;
        return take;
    }
}
