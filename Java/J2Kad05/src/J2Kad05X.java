/*
	課題名：J2Kad05A「石取りゲーム再び！」
	作成日：2022/10/13
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad05X {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 説明の表示
        System.out.println("20個ある石を交互に取っていきます。一度に取れる石の数は1-3個です。");
        System.out.println("最後の1つを取った方が負けです。");
        System.out.println();

        // 初期設定
        int stone = 20;			// 石の数

        BasePlayer userPlayer = new UserPlayer();
        BasePlayer compPlayer = new CompPlayer();
        BasePlayer[] player = {userPlayer , compPlayer};

        System.out.println();

        player[0].intro();
        player[1].intro();

        int take;
        int turn = 0;


        while(true) {

            showStone(stone);
            System.out.println(player[turn] + "の番です。");
            take = player[turn].takeStone(stone);
            System.out.println(take + "個取りました！");
            stone -= take;
            if (stone <= 0) {
                System.out.println(player[turn] + "の負けです！");
                break;								// while文を抜ける
            }
            System.out.println();
            turn ^= 1;
            System.out.println(turn);
        }

        in.close();
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
