/*
	課題名：J2Kad06B「モンスターを探せ！」
	作成日：2022/10/17
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad06B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Monster[] monsters = {  new Monster("ピカチュウ"),
                                new FireMonster("ヒトカゲ"),
                                new RockMonster("カブト")
        };

        System.out.println("モンスターを探します！");

        while(true) {
            System.out.print("どうしますか？（0：探す、-1：やめる）＞");
            int cmd = in.nextInt();
            if (cmd < 0) break;

            // Monsterの自己紹介
            int randMonster = (int)(Math.random()*3);
            monsters[randMonster].intro();
            System.out.println();
        }
    }
}
