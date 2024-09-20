/*
	課題名：J2Kad27C「カロリー表示の追加」
	作成日：2023/1/26
	作成者：田中太郎
*/

import java.util.Scanner;

public class J2Kad27C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MenuItem item = new MenuItem("ハンバーグステーキ", 449, 662);

        while(true) {
            System.out.print("どの形式で表示しますか？（0：通常、1：カロリー、-1：終了）＞");
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
            }
            item.print(printer);
            System.out.println();
        }
    }
}
