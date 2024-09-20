/*
	課題名：J2Kad22A「ジョブチェンジ！」
	作成日：2022/12/15
	作成者：田中太郎
*/
package pac22a;

import java.util.Scanner;

public class J2Kad22A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("あなたはRPGのキャラクターです！");
        System.out.println("今から世界を救う冒険に出かけます！");
        System.out.println("でもその前に職業を選んでください！！");
        System.out.println();

        RPGCharacter pc = new RPGCharacter();
        Job job = null;
        while(true) {
            System.out.println(pc + "さん、こんにちは！");
            System.out.print("ジョブチェンジしますか？（0：戦士、1：魔法使い、2：モンク、-1：これでいい）＞");
            int n = in.nextInt();
            if (n < 0) break;
            // ジョブチェンジ
            switch(n) {
                case 0:     job = new Fighter();         break;
                case 1:     job = new Mage();            break;
                case 2:     job = new Monk();            break;
//                default:    job = new RPGCharacter();    break;
            }
            pc.setJob(job);
            pc.attack();
            pc.defend();
            System.out.println();
        }
    }
}
