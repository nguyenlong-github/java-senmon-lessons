/*
	�ۑ薼�FJ2Kad05D�u�N���X�̌p���v
	�쐬���F2022/10/13
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad05D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FlyMonster m = new FlyMonster();
        m.setData("���b�N��", 1 + (int)(Math.random() * 10));

        while(true) {
            m.showData();
            System.out.print("�������܂����H�i0�F���ȏЉ�A1�F�U���A2�F����A3�F��ԁA-1�F�I���j��");
            int cmd = in.nextInt();
            if (cmd < 0) break;

            switch(cmd) {
                case 0: m.intro();  break;
                case 1: m.walk();   break;
                case 2: m.sleep();  break;
                case 3: m.fly(); break;
            }
            System.out.println();
        }
    }
}
