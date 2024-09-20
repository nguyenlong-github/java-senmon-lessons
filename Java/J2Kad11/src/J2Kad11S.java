/*
	課題名：J2Kad11S「LinkedList」
	作成日：2022/11/07
	作成者：田中太郎
*/

import java.util.LinkedList;
import java.util.Scanner;

public class J2Kad11S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Monster> list = new LinkedList<>();

        while(true) {
            // データの表示
            System.out.print("現在のリスト：");
            for(Monster element : list){
                System.out.print(element + "->");
            }
            System.out.println();
            // コマンド入力
            System.out.print("どうしますか？（0：addFirst、1：addLast、2：removeFirst、3：removeLast、-1：終了）＞");
            int cmd = in.nextInt();
            if (cmd < 0) break;
            switch (cmd){
                case 0: list.addFirst(new Monster());break;
                case 1: list.addLast(new Monster());break;
                case 2: list.removeFirst();break;
                case 3: list.removeLast();break;
            }
            System.out.println();
        }
    }
}
