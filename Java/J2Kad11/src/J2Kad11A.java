/*
	�ۑ薼�FJ2Kad11D�uArrayList�v
	�쐬���F2022/11/07
	�쐬�ҁF�c�����Y
*/

import java.util.ArrayList;

public class J2Kad11A {
    public static void main(String[] args) {
        MyArray list = new MyArray();
        // �f�[�^�̊i�[
        System.out.println("�f�[�^���i�[���܂��I");
        for(int i = 0 ; i < list.size() ; i++){
            list.add(new Monster());
            System.out.println("add : " + list.get(i));
        }

        // �f�[�^�̕\��
        System.out.println("�f�[�^��\�����܂��I");
        for(int i = 0 ; i < list.size(); i++){
            System.out.println("get : " + list.get(i));
        }

    }
}
