/*
	�ۑ薼�FJ2Kad05A�u�Ύ��Q�[���ĂсI�v
	�쐬���F2022/10/13
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad05A {

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
        UserPlayer userPlayer = new UserPlayer();
        System.out.println();


        //System.out.println("���O�F" + userPlayer.toString() + "�E�E�E���Ȃ������삷��v���C���[�ł��B");
        // System.out.println("���O�F" + basePlayer.toString() + "�E�E�E���΂̐��𗐐��Ō��߂܂��B");
        //System.out.println("���O�F" + compPlayer.toString() + "�E�E�E���������ł��B");
        compPlayer.intro();
        userPlayer.intro();
        System.out.println();

        int take;
        while(true) {
            // ���Ȃ��̎��
            showStone(stone);
            System.out.println(userPlayer + "�̔Ԃł��B");
            System.out.print("�����܂����H�i1-3�j��");
            take = userPlayer.takeStone(stone);
            System.out.println(take + "���܂����I");
            stone -= take;
            if (stone <= 0) {
                System.out.println(userPlayer + "�̕����ł��I");
                break;								// while���𔲂���
            }
            System.out.println();

            // CPU�̎��
//            showStone(stone);
//            System.out.println(basePlayer.toString() + "�̔Ԃł��B");
//            take = userPlayer.takeStone(stone);
//            System.out.println(basePlayer.takeStone(stone) + "���܂����I");
//            stone -= take;
//            if (stone <= 0) {
//                System.out.println(basePlayer.toString() + "�̕����ł��I");
//                break;								// while���𔲂���
//            }
//            System.out.println();
//        }
            // CPU�̎��
            showStone(stone);
            System.out.println(compPlayer+ "�̔Ԃł��B");
            take = compPlayer.takeStone(stone);
            System.out.println(take + "���܂����I");
            stone -= take;
            if (stone <= 0) {
                System.out.println(compPlayer+ "�̕����ł��I");
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
