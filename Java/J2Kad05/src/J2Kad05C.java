/*
	�ۑ薼�FJ2Kad05C�u�I�[�o�[���C�h�I�v
	�쐬���F2022/10/13
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad05C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SwimMonster m = new SwimMonster();
        m.setData("�R�C�L���O", 1 + (int)(Math.random() * 10));

        while(true) {
            m.showData();
            System.out.print("�������܂����H�i0�F���ȏЉ�A1�F�U���A2�F����A3�F�j���A-1�F�I���j��");
            int cmd = in.nextInt();
            if (cmd < 0) break;

            switch(cmd) {
                case 0: m.intro();  break;
                case 1: m.walk();   break;
                case 2: m.sleep();  break;
                case 3: m.swim();  break;
            }
            System.out.println();
        }
    }
}
