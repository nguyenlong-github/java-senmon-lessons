package before;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("�t�@�~���XECC�ւ悤�����I");

        Menu lunch = new Menu("���t�@�~���XECC���j���[��");
        lunch.add(new MenuItem("�n���o�[�O�X�e�[�L", 449, 662));
        lunch.add(new MenuItem("�ؓ��̐��I�Ă�", 599, 678));
        lunch.add(new MenuItem("�X�p�Q�b�e�B", 499, 625));

        Menu salad = new Menu("���T���_���j���[��");
        salad.add(new MenuItem("�����ƃI�N���̃T���_", 349, 157));
        salad.add(new MenuItem("�V�[�U�[�T���_", 399, 290));
        salad.add(new MenuItem("�V�[�t�[�h�T���_", 399, 290));
        lunch.add(salad);

        while(true) {
            System.out.print("�ǂ̌`���ŕ\�����܂����H�i0�F�ʏ�A1�F�J�����[�A2�F���C���A-1�F�I���j��");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

            switch(n) {
                default:
                case 0: lunch.print();      break;
                case 1: lunch.printCal();   break;
                case 2: lunch.printLine();  break;
            }
            System.out.println();
        }
    }
}
