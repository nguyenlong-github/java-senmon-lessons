/*
	�ۑ薼�FJ2Kad11S�uLinkedList�v
	�쐬���F2022/11/07
	�쐬�ҁF�c�����Y
*/

import java.util.LinkedList;
import java.util.Scanner;

public class J2Kad11S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Monster> list = new LinkedList<>();

        while(true) {
            // �f�[�^�̕\��
            System.out.print("���݂̃��X�g�F");
            for(Monster element : list){
                System.out.print(element + "->");
            }
            System.out.println();
            // �R�}���h����
            System.out.print("�ǂ����܂����H�i0�FaddFirst�A1�FaddLast�A2�FremoveFirst�A3�FremoveLast�A-1�F�I���j��");
            int cmd = in.nextInt();
            if (cmd < 0) break;
            switch (cmd){
                case 0: list.addFirst(new Monster());break;
                case 1: list.addLast(new Monster());break;
                case 2: list.removeFirst();break;
                case 3: list.removeLast();break;
            }
            System.out.println();
        }
    }
}
