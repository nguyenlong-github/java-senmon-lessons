/*
	�ۑ薼�FJ2Kad11C�u���b�p�[�N���X�v
	�쐬���F2022/11/07
	�쐬�ҁF�c�����Y
*/

import java.util.ArrayList;

public class J2Kad11C {
    public static void main(String[] args) {

        ArrayList<Integer> integerArrList = new ArrayList<>();
        // �f�[�^�̊i�[
        System.out.println("�f�[�^���i�[���܂��I");
        for(int i = 0 ; i < 5 ; i++){
            int rand = (int)(Math.random()*100);
            integerArrList.add(rand);
            System.out.println("add : " + integerArrList.get(i));
        }

        // �f�[�^�̕\��
        System.out.println("�f�[�^��\�����܂��I");
        for(Integer element : integerArrList){
            System.out.println("get : " + element);
        }

    }
}
