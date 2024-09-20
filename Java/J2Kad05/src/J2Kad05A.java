/*
	課題名：J2Kad05A「石取りゲーム再び！」
	作成日：2022/10/13
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad05A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 説明の表示
		System.out.println("20個ある石を交互に取っていきます。一度に取れる石の数は1-3個です。");
		System.out.println("最後の1つを取った方が負けです。");
		System.out.println();

        // 初期設定
        int stone = 20;			// 石の数

       // BasePlayer basePlayer = new BasePlayer();
        CompPlayer compPlayer = new CompPlayer();
        UserPlayer userPlayer = new UserPlayer();
        System.out.println();


        //System.out.println("名前：" + userPlayer.toString() + "・・・あなたが操作するプレイヤーです。");
        // System.out.println("名前：" + basePlayer.toString() + "・・・取る石の数を乱数で決めます。");
        //System.out.println("名前：" + compPlayer.toString() + "・・・少し強いです。");
        compPlayer.intro();
        userPlayer.intro();
        System.out.println();

        int take;
        while(true) {
            // あなたの手番
            showStone(stone);
            System.out.println(userPlayer + "の番です。");
            System.out.print("何個取りますか？（1-3）＞");
            take = userPlayer.takeStone(stone);
            System.out.println(take + "個取りました！");
            stone -= take;
            if (stone <= 0) {
                System.out.println(userPlayer + "の負けです！");
                break;								// while文を抜ける
            }
            System.out.println();

            // CPUの手番
//            showStone(stone);
//            System.out.println(basePlayer.toString() + "の番です。");
//            take = userPlayer.takeStone(stone);
//            System.out.println(basePlayer.takeStone(stone) + "個取りました！");
//            stone -= take;
//            if (stone <= 0) {
//                System.out.println(basePlayer.toString() + "の負けです！");
//                break;								// while文を抜ける
//            }
//            System.out.println();
//        }
            // CPUの手番
            showStone(stone);
            System.out.println(compPlayer+ "の番です。");
            take = compPlayer.takeStone(stone);
            System.out.println(take + "個取りました！");
            stone -= take;
            if (stone <= 0) {
                System.out.println(compPlayer+ "の負けです！");
                break;								// while文を抜ける
            }
            System.out.println();
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
