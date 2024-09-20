package pac24c;

import java.util.Scanner;

public class GachaMachine {
    private GachaState state;
    public void setState(GachaState state) { this.state = state; }
    public void execute() {
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("どの状態をチェックしますか？（0：NoCoin、1：HasCoin、-1：終わる）＞");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

            // 選択した状態を生成し、以下の順番で処理を実行すること

            // showState
            state.showState();
            // insertCoin
            state.insertCoin(this);

            // showState
            state.showState();
            // turnHandle
            state.turnHandle(this);

            // showState
            state.showState();
            // ejectCoin
            state.eljectCoin(this);

            System.out.println();
        }
    }
}
// 以下、J2Kad24D（pac24d）からコピーすること
// ただし貼り付けるときは、右クリック→「特殊なコピー/貼り付け」→「プレーンテキストとして貼り付け」で貼り付けること。
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
        //HasCoinへ状態遷移
        gm.setState(new HasCoin());
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
        //NoCoinへ状態遷移
        gm.setState(new NoCoin());
    }

    @Override
    public void eljectCoin(GachaMachine gm) {
        System.out.println("コインを返却しました！");
        //NoCoinへ状態遷移
        gm.setState(new NoCoin());
    }
}



