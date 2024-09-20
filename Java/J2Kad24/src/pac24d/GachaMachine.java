package pac24d;

import java.util.Scanner;

public class GachaMachine {

    private GachaState state;

    public void execute() {
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("どの状態をチェックしますか？（0：NoCoin、1：HasCoin、-1：終わる）＞");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

            // 選択した状態クラスを生成し、以下の順番で処理を実行する。
            state = (n == 0) ? new NoCoin() : new HasCoin();

            // showState
            state.showState();
            // insertCoin
            state.insertCoin(this);
            // turnHandle
            state.turnHandle(this);
            // ejectCoin
            state.eljectCoin(this);

            System.out.println();
        }
    }
}
// GachaStateインターフェイス
interface GachaState{
    //現在の状態表示
    public void showState();
    //コインを入れるメソッド
    public void insertCoin(GachaMachine gm);
    // ハンドルを回すメソッド
    public void turnHandle(GachaMachine gm);
    //コイン返却
    public void eljectCoin(GachaMachine gm);
}
// NoCoinクラス
class NoCoin implements GachaState{

    @Override
    public void showState() {
        System.out.println("コイン:なし");
    }

    @Override
    public void insertCoin(GachaMachine gm) {
        System.out.println("コインを入れました！ ");
    }

    @Override
    public void turnHandle(GachaMachine gm) {
        System.out.println("ハンドルが回りません！ ");
    }

    @Override
    public void eljectCoin(GachaMachine gm) {
        System.out.println("何も起こりません！");
    }
}
// HasCoinクラス
class HasCoin implements GachaState{

    @Override
    public void showState() {
        System.out.println("コイン：あり");
    }

    @Override
    public void insertCoin(GachaMachine gm) {
        System.out.println("これ以上コインが入りません！");
    }

    @Override
    public void turnHandle(GachaMachine gm) {
        System.out.println("カプセルが出ました！");
    }

    @Override
    public void eljectCoin(GachaMachine gm) {
        System.out.println("コインを返却しました！");
    }
}


