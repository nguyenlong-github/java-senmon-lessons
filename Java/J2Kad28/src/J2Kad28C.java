/*
	�ۑ薼�FJ2Kad28C�u�C���X�^���X�͂ЂƂ����I�iSingleton�j�v
	�쐬���F2023/1/30
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad28C {
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
