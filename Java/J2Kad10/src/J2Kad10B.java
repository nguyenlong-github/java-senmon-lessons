/*
	課題名：J2Kad10C「列挙型①」
	作成日：2022/10/31
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad10B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("じゃんけんをします！");
        // 手の紹介
        Janken.Hand[] hands = Janken.Hand.values();
        for(Janken.Hand hand : hands){
            System.out.println(hand.name + ":" + hand. feature);
        }
        System.out.println();

        while(true) {
            // 手の選択
            System.out.print("何をだしますか？（0：グー、1：チョキ、2：パー、-1：終了）＞");
            int user = in.nextInt();
            if (user < 0) break;
            int comp = (int) (Math.random() * 3);
            // 手の表示
            System.out.println("あなたは" + hands[user].name + "を出した！");
            System.out.println("コンピュータは" + hands[comp].name + "を出した！");

            // 結果表示（作成すること）
            //じゃんけんクラスをっ作成し結果を表示
            System.out.println(Janken.results[user][comp].msg);

            System.out.println();
        }
    }
}
