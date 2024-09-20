package pac24b;
import java.util.Scanner;
public class GachaMachine {
    public void setState(GachaState state) { this.state = state; }

    private int count = 3;
    private GachaState state = new NoCoin();

    public int decCount() { return --count; }

    public void execute() {
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("カプセルの残り：" + count);
            showState();
            System.out.print("どうしますか？（0：コインを入れる、1：ハンドルを回す、2：返却ボタンを押す、-1：終わる）＞");
            int cmd = Integer.parseInt(in.next());
            if (cmd < 0) break;
            switch(cmd) {
                case 0: insertCoin();   break;
                case 1: turnHandle();   break;
                case 2: ejectCoin();    break;
            }
            System.out.println();
        }
    }
    private void showState() {
        state.showState();
    }
    private void insertCoin() {
        state.insertCoin(this);
    }
    private void turnHandle() {
        state.turnHandle(this);
    }
    private void ejectCoin() {
        state.ejectCoin(this);
    }
}
interface GachaState {
    //現在の状態を表示
    void showState();
    //コインを入れるメソッド
    void insertCoin(GachaMachine gm);
    //ハンドルを回すメソッド
    void turnHandle(GachaMachine gm);
    //コインを返却メソッド
    void ejectCoin(GachaMachine gm);
}
class NoCoin implements GachaState {
    public void showState(){
        System.out.println("コイン：なし");
    }
    public void insertCoin(GachaMachine gm){
        System.out.println("コインを入れました！");
        gm.setState(new HasCoin());
    }
    public void turnHandle(GachaMachine gm){
        System.out.println("ハンドルが回りません！");
    }
    public void ejectCoin(GachaMachine gm){
        System.out.println("何も起こりません！");
    }
}
class HasCoin implements GachaState{
    public void showState(){
        System.out.println("コイン：あり");
    }
    public void insertCoin(GachaMachine gm){
        System.out.println("これ以上コインが入りません！");
    }
    public void turnHandle(GachaMachine gm){
        System.out.println("カプセルが出ました！");
        gm.decCount();
        gm.setState(new NoCoin());
    }
    public void ejectCoin(GachaMachine gm){
        System.out.println("コインを返却しました！");
        gm.setState(new NoCoin());
    }
}