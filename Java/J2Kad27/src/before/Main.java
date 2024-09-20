package before;

import java.util.Scanner;

public class Main {
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

        while(true) {
            System.out.print("どの形式で表示しますか？（0：通常、1：カロリー、2：ライン、-1：終了）＞");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

            switch(n) {
                default:
                case 0: lunch.print();      break;
                case 1: lunch.printCal();   break;
                case 2: lunch.printLine();  break;
            }
            System.out.println();
        }
    }
}
