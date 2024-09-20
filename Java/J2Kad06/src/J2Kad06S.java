/*
	課題名：J2Kad06S「石取りゲーム完成！」
	作成日：2022/10/17
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad06S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 説明の表示
        System.out.println("20個ある石を交互に取っていきます。一度に取れる石の数は1-3個です。");
        System.out.println("最後の1つを取った方が負けです。");
        System.out.println();

        // 初期設定
        int	stone = 20;			// 石の数
        BasePlayer[] players = new BasePlayer[2];

        System.out.print("先手を選んでください（0：Base、1：User、2：Comp、3：Master）＞");
        int cmd = in.nextInt();
        switch (cmd) {
            case 0: players[0] = new BasePlayer(); break;
            case 1: players[0] = new UserPlayer(); break;
            case 2: players[0] = new CompPlayer(); break;
            case 3: players[0] = new MasterPlayer(); break;
        }
        System.out.print("先手を選んでください（0：Base、1：User、2：Comp、3：Master）＞");
        cmd = in.nextInt();
        switch (cmd) {
            case 0: players[1] = new BasePlayer(); break;
            case 1: players[1] = new UserPlayer(); break;
            case 2: players[1] = new CompPlayer(); break;
            case 3: players[1] = new MasterPlayer(); break;
        }

        System.out.println();

        // 自己紹介
        players[0].intro();
        players[1].intro();

        System.out.println();

        int take;				// 取る石の数
        while(true) {
            // 先手の手番
            showStone(stone);
            System.out.println("先手：" + players[0] + "の番です。");
            take = players[0].takeStone(stone);
            System.out.println(take + "個取りました！");
            stone -= take;
            if (stone <= 0) {
                System.out.println(players[0] + "の負けです！");
                break;								// while文を抜ける
            }
            System.out.println();

            // 後手の手番
            showStone(stone);
            System.out.println("後手：" + players[1] + "の番です。");
            take = players[1].takeStone(stone);
            System.out.println(take + "個取りました！");
            stone -= take;
            if (stone <= 0) {
                System.out.println(players[1] + "の負けです！");
                break;								// while文を抜ける
            }
            System.out.println();
        }
    }
    public static void showStone(int stone) {
        System.out.print("残り" + stone + "個：");
        while(stone > 0) {
            System.out.print("●");
            stone--;
        }
        System.out.println();
    }
}
