/*
	�ۑ薼�FJ2Kad19X1�u�V���J�X�IECC�R�[�q�[�@�v
	�쐬���F2022/12/5
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad19X1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ECC�R�[�q�[�ւ悤�����I");

        while(true) {
            // �R�[�q�[�̑I��
            System.out.print("���ݕ���I��ł��������i0�F�u�����h�A1�F�G�X�v���b�\�A2�F�[����R�[�q�[�A-1�F�X���o��j��");
            int drink = Integer.parseInt(in.next());
            if (drink < 0) break;
            // �g�b�s���O�̒ǉ�
            System.out.print("�g�b�s���O�͂ǂ����܂����H�i0�F�����A1�F�z�C�b�v�A2�F�R�R�A�A-1�F����Ȃ��j��");
            int topping = Integer.parseInt(in.next());
            // �h�����N�̐���
            MenuItem item = null;
            switch(drink) {
                default:
                case 0:     // �u�����h�R�[�q�[
                    switch(topping) {
                        default:    item = new HouseBlend();        break;
                        case 0:     item = new HouseBlendSoy();     break;
                        case 1:     item = new HouseBlendWhip();    break;
                        case 2:     item = new HouseBlendCocoa();   break;
                    }
                    break;
                case 1:     // �G�X�v���b�\
                    switch(topping) {
                        default:    item = new Espresso();          break;
                        case 0:     item = new EspressoSoy();       break;
                        case 1:     item = new EspressoWhip();      break;
                        case 2:     item = new EspressoCocoa();     break;
                    }
                    break;
                case 2:     // �[����R�[�q�[
                    switch(topping) {
                        default:    item = new DarkRoast();         break;
                        case 0:     item = new DarkRoastSoy();      break;
                        case 1:     item = new DarkRoastWhip();     break;
                        case 2:     item = new DarkRoastCocoa();    break;
                    }
                    break;
            }
            // ��v
            System.out.println("���҂������܂����I");
            System.out.println(item.getName() + "�ł��I");
            System.out.println(item.getPrice() + "�~�ɂȂ�܂��I");
            System.out.println();
        }
        System.out.println("���肪�Ƃ��������܂����I");
    }
}

