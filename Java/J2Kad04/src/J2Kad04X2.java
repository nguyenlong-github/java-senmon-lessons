import java.util.Scanner;

public class J2Kad04X2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("いらっしゃい！激安スーパーECC2号店です！！");
        Queue2 line = new Queue2(5);

        while(true) {
            // データの表示
            if (!line.empty()) {
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
                        if (line.full()) {
                            System.out.println("もう店に入れない！残念！！");
                        }
                        else {
                            System.out.println();
                            line.push(m);
                        }
                    }
                    break;
                case 1:			// レジを打つ
                    if (line.empty()) {
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
