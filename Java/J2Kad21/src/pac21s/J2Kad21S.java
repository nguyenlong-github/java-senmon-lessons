/*
	�ۑ薼�FJ2Kad21S�u�V�l�R��ECC?�iSingleton�j�v
	�쐬���F2022/12/12
	�쐬�ҁF�c�����Y
*/
package pac21s;

import java.util.Scanner;

public class J2Kad21S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("�悤�����I�V�l�R��ECC�ցI");
        SalesPerson[] w = {
                new SalesPerson("�̂ё�"),
                new SalesPerson("�X�l�v"),
                new SalesPerson("�W���C�A��"),
        };

        while (true) {
            System.out.print("���Ԃ̑����ōw�����܂����H�i0?2�A-1�F�I���j��");
            int i = Integer.parseInt(in.next());
            if (i < 0) break;

            w[i].intro();
            w[i].issueTicket();
            System.out.println();
        }
    }
}
// �����@
class TicketMaker {
    private int ticket;
    public TicketMaker() { ticket = 0; }
    public int next() { return ++ticket; }
}
// ����
class SalesPerson {
    private String name;                        // �S���Җ�
    private TicketMaker t = new TicketMaker();  // �����@
    public SalesPerson(String name) {
        this.name = name;
    }

    public void intro() {
        System.out.println(name + "���S�����܂��I");
    }
    public void issueTicket() {
        System.out.println("���Ȃ��̍��Ȃ�" + t.next() + "�Ԃł��I");
    }
}
