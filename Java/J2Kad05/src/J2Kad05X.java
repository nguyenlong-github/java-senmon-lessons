/*
	�ۑ薼�FJ2Kad05A�u�Ύ��Q�[���ĂсI�v
	�쐬���F2022/10/13
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad05X {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // �����̕\��
        System.out.println("20����΂����݂Ɏ���Ă����܂��B��x�Ɏ���΂̐���1-3�ł��B");
        System.out.println("�Ō��1����������������ł��B");
        System.out.println();

        // �����ݒ�
        int stone = 20;			// �΂̐�

        BasePlayer userPlayer = new UserPlayer();
        BasePlayer compPlayer = new CompPlayer();
        BasePlayer[] player = {userPlayer , compPlayer};

        System.out.println();

        player[0].intro();
        player[1].intro();

        int take;
        int turn = 0;


        while(true) {

            showStone(stone);
            System.out.println(player[turn] + "�̔Ԃł��B");
            take = player[turn].takeStone(stone);
            System.out.println(take + "���܂����I");
            stone -= take;
            if (stone <= 0) {
                System.out.println(player[turn] + "�̕����ł��I");
                break;								// while���𔲂���
            }
            System.out.println();
            turn ^= 1;
            System.out.println(turn);
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
