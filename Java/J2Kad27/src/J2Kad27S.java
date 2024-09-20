/*
	課題名：J2Kad27S「インデントの追加」
	作成日：2023/1/26
	作成者：田中太郎
*/

import java.util.Scanner;

public class J2Kad27S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ファミレスECCへようこそ！");

        Menu lunch = new Menu("★ファミレスECCメニュー★");
        lunch.add(new MenuItem("ハンバーグステーキ", 449, 662));
        lunch.add(new MenuItem("豚肉の生姜焼き", 599, 678));
        lunch.add(new MenuItem("スパゲッティ", 499, 625));

        Menu salad = new Menu("＊サラダメニュー＊");
        salad.add(new MenuItem("豆腐とオクラのサラダ", 349, 157));
        salad.add(new MenuItem("シーザーサラダ", 399, 290));
        salad.add(new MenuItem("シーフードサラダ", 399, 290));
        lunch.add(salad);

        Menu dessert = new Menu("＊デザートメニュー＊");
        dessert.add(new MenuItem("ソフトクリーム", 279, 162));
        dessert.add(new MenuItem("チーズケーキ", 299, 269));
        dessert.add(new MenuItem("チョコレートパフェ", 499, 410));
        lunch.add(dessert);

        while(true) {
            System.out.print("どの形式で表示しますか？（0：通常、1：カロリー、2：ライン、3：ブロック、-1：終了）＞");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;
            Printer printer = null;
            switch(n){
                case 0:
                    printer = new Printer();
                    break;
                case 1:
                    printer = new CallPrinter();
                    break;
                case 2:
                    printer = new LinePrinter();
                    break;
                case 3:
                    printer = new BlockPrinter();
                    break;
            }
            lunch.print(printer);

            System.out.println();
        }
    }
}
