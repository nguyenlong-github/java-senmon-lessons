/*
	�ۑ薼�FJ2Kad11D�uArrayList�v
	�쐬���F2022/11/07
	�쐬�ҁF�c�����Y
*/

import java.util.ArrayList;

public class J2Kad11D {
    public static void main(String[] args) {

        ArrayList<Monster> monster = new ArrayList<>();
        // �f�[�^�̊i�[
        System.out.println("�f�[�^���i�[���܂��I");

        for(int i = 0 ; i < 5 ; i++){
             monster.add(new Monster());
             System.out.println("add : " + monster.get(i));
        }
        // �f�[�^�̕\��
        System.out.println("�f�[�^��\�����܂��I");
        for(Monster element : monster){
            System.out.println("get : " + element);
        }

    }
}
