/*
	課題名：J2Kad10C「列挙型①」
	作成日：2022/10/31
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad10C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("じゃんけんをします！");
        // 手の紹介
        System.out.println("グー" + "：\t" + "チョキに勝って、パーに負けます！");
        System.out.println("チョキ" + "：\t" + "パー勝って、グーに負けます！");
        System.out.println("パー" + "：\t" + "グーに勝って、チョキに負けます！");
        System.out.println();

        while(true) {
            // 手の選択
            System.out.print("何をだしますか？（0：グー、1：チョキ、2：パー、-1：終了）＞");
            int user = in.nextInt();
            if (user < 0) break;
            int comp = (int) (Math.random() * 3);
            // 手の表示
            String[] strHands = {"グー", "チョキ", "パー"};
            System.out.println("あなたは" + strHands[user] + "を出した！");
            System.out.println("コンピュータは" + strHands[comp] + "を出した！");

            // 結果表示（作成すること）
            //じゃんけんクラスをっ作成し結果を表示
            switch (Janken.results[user][comp]) {
                case WIN:
                    System.out.println("勝ち");
                    break;
                case LOSE:
                    System.out.println("負け");
                    break;
                case DRAW:
                    System.out.println("引き分け");
                    break;

            }

            System.out.println();
        }
    }
}
