/*
	課題名：J2Kad26D「TypeBエアコンの操作」
	作成日：2023/1/23
	作成者：田中太郎
*/

package pac26s;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Controller rc = new Controller();
        Aircon ac = new OldAirconAdapter();
        rc.addCommand(new CmdSetCool(ac))
                .addCommand(new CmdSetWarm(ac))
                .addCommand(new CmdHmdOn())
                .addCommand(new CmdHmdOff())
                .addCommand(new CmdDehmdOn())
                .addCommand(new CmdDehmdOff());
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

