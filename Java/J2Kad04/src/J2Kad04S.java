import java.util.Scanner;

public class J2Kad04S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("��������Ⴂ�I�����X�[�p�[ECC�ł��I�I");
        Queue line = new Queue(5);

        while(true) {
            // �f�[�^�̕\��
            if (!line.empty()) {
                System.out.println("���݂̃��W�҂��s��ł��I");
                for (int i = 0; i < line.size(); i++) {
                    System.out.println(i + "�F" + line.getData(i));
                }
                System.out.println();
            }

            // �R�}���h�I��
            System.out.print("�������܂����H�i0�F�q���Ăэ��ށA1�F���W��łA-1�F�X�������ށj��");
            int cmd = in.nextInt();
            if (cmd < 0) break;

            switch (cmd) {
                case 0:			// �q���Ăэ���
                    for (int i = 1 + (int)(Math.random() * 3); i > 0; i--) {
                        Monster	m = new Monster();
                        System.out.print(m + "������Ă����I");
                        if (line.full()) {
                            System.out.println("�����X�ɓ���Ȃ��I�c�O�I�I");
                        }
                        else {
                            System.out.println();
                            line.push(m);
                        }
                    }
                    break;
                case 1:			// ���W��ł�
                    if (line.empty()) {
                        System.out.println("���q���񂪂��Ȃ��I�I");
                    }
                    else {
                        Monster m = line.pop();
                        System.out.println(m + "�͋A���Ă������I�I");
                    }
                    break;
            }
            System.out.println();
        }
        System.out.println();
    }
}
