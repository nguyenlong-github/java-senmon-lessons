/*
	課題名：J2Kad26D「TypeBエアコンの操作」
	作成日：2023/1/23
	作成者：田中太郎
*/

package pac26d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Controller rc = new Controller();
        rc.setAircon(new AirconTypeB());

        while(true) {
            rc.showCommand();
            System.out.print("どのボタンを押しますか？＞");
            int cmd = Integer.parseInt(in.next());
            if (cmd < 0) break;
            rc.pushButton(cmd);
            System.out.println();
        }
    }
}
