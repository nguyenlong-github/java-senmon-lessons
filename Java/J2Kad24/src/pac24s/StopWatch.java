package pac24s;

import java.util.Scanner;

public class StopWatch {
    public void execute() {
        Scanner in = new Scanner(System.in);
        while(true) {
            // 状態の表示


            System.out.print("どうしますか？（0：START、1：CLEAR、-1：終了）＞");
            int cmd = Integer.parseInt(in.next());
            if (cmd < 0) break;



        }
    }
}
