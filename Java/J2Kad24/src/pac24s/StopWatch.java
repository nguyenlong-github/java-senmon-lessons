package pac24s;

import java.util.Scanner;

public class StopWatch {
    public void execute() {
        Scanner in = new Scanner(System.in);
        while(true) {
            // ��Ԃ̕\��


            System.out.print("�ǂ����܂����H�i0�FSTART�A1�FCLEAR�A-1�F�I���j��");
            int cmd = Integer.parseInt(in.next());
            if (cmd < 0) break;



        }
    }
}
