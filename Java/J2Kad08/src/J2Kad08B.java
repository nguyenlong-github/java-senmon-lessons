/*
	課題名：J2Kad08B「激安スーパーECC3号店」
	作成日：2022/10/24
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad08B {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(Util.MSG01);
        System.out.println(Util.MSG02);
        System.out.print(Util.MSG03);
        int n = in.nextInt();

        IContainer line;

        switch (n){
            case 0 :
                //スタックの生成
                line = new Stack(5);
                break;
            default:
                // キューの生成
                line = new Queue(5);
                break;

        }


        while(true) {
            // データの表示
            if (!line.isEmpty()) {
                System.out.println("現在のレジ待ち行列です！");
                for (int i = 0; i < line.size(); i++) {
                    System.out.println(i + "：" + line.getData(i));
                }
                System.out.println();
            }

            // コマンド選択
            System.out.print("何をしますか？（0：客を呼び込む、1：レジを打つ、-1：店をたたむ）＞");
            int cmd = in.nextInt();
            if (cmd < 0) break;

            switch (cmd) {
                case 0:			// 客を呼び込む
                    for (int i = 1 + (int)(Math.random() * 3); i > 0; i--) {
                        Monster	m = new Monster();
                        System.out.print(m + "がやってきた！");
                        if (line.isFull()) {
                            System.out.println("もう店に入れない！残念！！");
                        }
                        else {
                            System.out.println();
                            line.push(m);
                        }
                    }
                    break;
                case 1:			// レジを打つ
                    if (line.isEmpty()) {
                        System.out.println("お客さんがいない！！");
                    }
                    else {
                        Monster m = line.pop();
                        System.out.println(m + "は帰っていった！！");
                    }
                    break;
            }
            System.out.println();
        }
        System.out.println();
    }
}
