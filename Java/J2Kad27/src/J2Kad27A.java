/*
	�ۑ薼�FJ2Kad27A�u�u���b�N�\���̒ǉ��iComposite�Ή��A�j�v
	�쐬���F2023/1/26
	�쐬�ҁF�c�����Y
*/

import java.util.Scanner;

public class J2Kad27A {
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

        Menu dessert = new Menu("���f�U�[�g���j���[��");
        dessert.add(new MenuItem("�\�t�g�N���[��", 279, 162));
        dessert.add(new MenuItem("�`�[�Y�P�[�L", 299, 269));
        dessert.add(new MenuItem("�`���R���[�g�p�t�F", 499, 410));
        lunch.add(dessert);

        while(true) {
            System.out.print("�ǂ̌`���ŕ\�����܂����H�i0�F�ʏ�A1�F�J�����[�A2�F���C���A3�F�u���b�N�A-1�F�I���j��");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;
            Printer printer = null;
            switch(n){
                case 0:
                    printer = new Printer();
                    break;
                case 1:
                    printer = new CallPrinter();
                    break;
                case 2:
                    printer = new LinePrinter();
                    break;
                case 3:
                    printer = new BlockPrinter();
                    break;
            }
            lunch.print(printer);



            System.out.println();
        }
    }
}
