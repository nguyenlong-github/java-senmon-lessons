/*
	�ۑ薼�FJ2Kad11B�uHashMap�v
	�쐬���F2022/11/07
	�쐬�ҁF�c�����Y
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class J2Kad11B {
    public static void main(String[] args) {
        System.out.println("ECC�o�[�K�[�ւ悤�����I");
        // ���j���[�̍쐬
        HashMap<String,Integer> burger = new HashMap<>(3);
        burger.put("�n���o�[�K�[",150);
        burger.put("�`�[�Y�o�[�K�[",180);
        burger.put("�r�b�O�}�b�N",410);
        // ���j���[�̕\��
        System.out.println("���j���[��\�����܂��I");
        Iterator<Map.Entry<String,Integer>> iterator = burger.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        for(String key : burger.keySet()){
            System.out.println(key + " : " + burger.get(key) + "�~");
        }

    }
}
