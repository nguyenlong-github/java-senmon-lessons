/*
	�ۑ薼�FJ2Kad05A�u�Ύ��Q�[���ĂсI�v
	�쐬���F2022/10/13
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad05S {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // �����̕\��
        System.out.println("20����΂����݂Ɏ���Ă����܂��B��x�Ɏ���΂̐���1-3�ł��B");
        System.out.println("�Ō��1����������������ł��B");
        System.out.println();

        // �����ݒ�
        int stone = 20;			// �΂̐�

        // BasePlayer basePlayer = new BasePlayer();
        CompPlayer compPlayer = new CompPlayer();
        MasterPlayer masterPlayer = new MasterPlayer();
        System.out.println();

        compPlayer.intro();
        masterPlayer.intro();
        System.out.println();

        int take;
        while(true) {
            // master�̎��
            showStone(stone);
            System.out.println(masterPlayer + "�̔Ԃł��B");
            System.out.print("�����܂����H�i1-3�j��");
            take = masterPlayer.takeStone(stone);
            System.out.println(take + "���܂����I");
            stone -= take;
            if (stone <= 0) {
                System.out.println(masterPlayer + "�̕����ł��I");
                break;								// while���𔲂���
            }
            System.out.println();

            // compPlayer�̎��
            showStone(stone);
            System.out.println(compPlayer + "�̔Ԃł��B");
            take = compPlayer.takeStone(stone);
            System.out.println(compPlayer.takeStone(stone) + "���܂����I");
            stone -= take;
            if (stone <= 0) {
                System.out.println(compPlayer + "�̕����ł��I");
                break;								// while���𔲂���
            }
            System.out.println();
        }
        in.close();
    }
    public static void showStone(int stone) {
        System.out.print("�c��" + stone + "�F");
        while(stone > 0) {
            System.out.print("��");
            stone--;
        }
        System.out.println();
    }
}
