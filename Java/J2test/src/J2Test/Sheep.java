package J2Test;

public class Sheep {
    private static int counter;     				// ���������r�̐�
    private int num;           			    // �r�ԍ��i������������1�A2�A3�A�E�E�E�j
    public static void showCounter() {
        System.out.println("�r�͑S����" +counter+ "�C�ł��I");
    }
    public Sheep() {								// �R���X�g���N�^
        num = ++counter;
        System.out.println(num + "�Ԃ̗r������Ă����I");
    }

}
