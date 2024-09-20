/*
	課題名：J2Kad05C「オーバーライド！」
	作成日：2022/10/13
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad05C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SwimMonster m = new SwimMonster();
        m.setData("コイキング", 1 + (int)(Math.random() * 10));

        while(true) {
            m.showData();
            System.out.print("何をしますか？（0：自己紹介、1：散歩、2：眠る、3：泳ぐ、-1：終了）＞");
            int cmd = in.nextInt();
            if (cmd < 0) break;

            switch(cmd) {
                case 0: m.intro();  break;
                case 1: m.walk();   break;
                case 2: m.sleep();  break;
                case 3: m.swim();  break;
            }
            System.out.println();
        }
    }
}
