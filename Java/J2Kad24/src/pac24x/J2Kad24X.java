/*
	�ۑ薼�FJ2Kad24X�u���E�ɂ͂΂���ECC�t�[�Y�I�v
	�쐬���F2023/1/16
	�쐬�ҁF�c�����Y
*/
package pac24x;

import java.util.Scanner;

public class J2Kad24X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("���E�ɂ͂΂���ECC�t�[�Y�I");
        System.out.println("��������M&A�Ŋg�咆�I�I");

        while (true) {
            System.out.print("�ǂ̃��j���[��\�����܂����H�i0�FECC�h�[�i�c�A1�FECC�R�[�q�[�A-1�F�I���j��");
            int shop = Integer.parseInt(in.next());
            if (shop < 0) break;

            if (shop == 0) {
                // ECC�h�[�i�c


            } else if (shop == 1) {
                // ECC�R�[�q�[


            }

            System.out.println();
        }
    }
}
