/*
	�ۑ薼�FJ2Kad26D�uTypeB�G�A�R���̑���v
	�쐬���F2023/1/23
	�쐬�ҁF�c�����Y
*/

package pac26c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Controller rc = new Controller();
        rc.setAircon(new AirconTypeB());

        while(true) {
            rc.showCommand();
            System.out.print("�ǂ̃{�^���������܂����H��");
            int cmd = Integer.parseInt(in.next());
            if (cmd < 0) break;
            rc.pushButton(cmd);
            System.out.println();
        }
    }
}
