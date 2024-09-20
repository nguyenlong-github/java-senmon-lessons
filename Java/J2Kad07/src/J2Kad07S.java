/*
	課題名：J2Kad07A「ECCコーヒー再び！」
	作成日：2022/10/20
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad07S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ECCコーヒーへようこそ！");
        System.out.println("門外不出のレシピで作るから、おいしいよ！！");
        System.out.println();
        HotDrink [] hotDrinks = {new Coffee(), new Tea(), new Cocoa(), new Yuzu()};

        while (true) {
            System.out.print("ご注文は？（0：コーヒー、1；紅茶、2：ココア、3：ゆず茶、-1：店を出る）＞");
            int	n = in.nextInt();
            if (n < 0) break;

            hotDrinks[n].execute();

            System.out.println("お待たせしました！ごゆっくりどうぞ！");
            System.out.println();
        }

        System.out.println("ありがとうございました！");
    }
}
