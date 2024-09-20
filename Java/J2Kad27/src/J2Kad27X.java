/*
	�ۑ薼�FJ2Kad27X�uECC�\�t�g�̗J�T�v
	�쐬���F2023/1/26
	�쐬�ҁF�c�����Y
*/

import java.util.Scanner;

public class J2Kad27X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ECCSoft eccSoft = new ECCSoft();

        while(true) {
            System.out.print("�ǂ����܂����H�i0�F�d�����˗�����A-1�F���������j��");
            int cmd = Integer.parseInt(in.next());
            if (cmd < 0) break;

            eccSoft.work();                               // �������֔���
            System.out.println();
        }
    }
}
// ������
class ECCSoft {
    public ECCSoft() {
        System.out.println("�M���Ǝ��т�ECC�\�t�g������Ђł��I");
        System.out.println("�ǂ�ȉۑ�ł����������^���ɉ������܂��I�I");
    }
    public void work() {
        SubContractor sub;
        switch((int)(Math.random() * 3)) {
            default:
            case 0: sub = new ECCService();   break;
            case 1: sub = new ECCPartners();   break;
            case 2: sub = new ECCSolutions();   break;
        }
        System.out.println(sub + "�Ɋۓ������܂��I");
        sub.work();
    }
}
// ������
abstract class SubContractor {
    private String name;
    public SubContractor(String name) {
        this.name = name;
    }
    public String toString() { return name; }
    public abstract void work();
}
// ECC�T�[�r�X�������
class ECCService extends SubContractor {
    public ECCService() { super("ECC�T�[�r�X�������"); }
    public void work() { System.out.println("ECC�T�[�r�X������Ёu���Ƃ�����΂��Ă݂܂��I�v"); }
}
// ECC�p�[�g�i�[�Y�������
class ECCPartners extends SubContractor {
    public ECCPartners() { super("ECC�p�[�g�i�[�Y�������"); }
    public void work() { System.out.println("ECC�p�[�g�i�[�Y������Ёu�������͂炢�ȁ[�I�v"); }
}
// ECC�\�����[�V�����Y�������
class ECCSolutions extends SubContractor {
    public ECCSolutions() { super("ECC�\�����[�V�����Y�������"); }
    public void work() { System.out.println("ECC�\�����[�V�����Y������Ёu��낱��ł������󂯂������܂��I�v"); }
}