package J2Test;

public class J2Test13_3 {
    public static void main(String[] args) {
        Sheep.showCounter();									// �r�̐���\��
        Sheep s1 = new Sheep();					// s1�ɗr��1�C����
        Sheep.showCounter();									// �r�̐���\��

        Sheep[] sn = new Sheep[3];					// sn�ɗr�̔z��i3�C���j�𐶐�
        for (int i = 0; i < sn.length; i++) {
            sn[i] = new Sheep();				// �z��ɗr�𐶐�
        }
        Sheep.showCounter();									// �r�̐���\��
    }

}
