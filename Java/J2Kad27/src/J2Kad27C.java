/*
	�ۑ薼�FJ2Kad27C�u�J�����[�\���̒ǉ��v
	�쐬���F2023/1/26
	�쐬�ҁF�c�����Y
*/

import java.util.Scanner;

public class J2Kad27C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MenuItem item = new MenuItem("�n���o�[�O�X�e�[�L", 449, 662);

        while(true) {
            System.out.print("�ǂ̌`���ŕ\�����܂����H�i0�F�ʏ�A1�F�J�����[�A-1�F�I���j��");
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
            }
            item.print(printer);
            System.out.println();
        }
    }
}
