/*
	�ۑ薼�FJ2Kad17S1�u������`��V�X�e���@�iBigChar�N���X�j�v
	�쐬���F2022/11/28
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad17S1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Canvas c = new Canvas();
        while(true) {
            System.out.print("�����i�p�����j����͂��Ă��������i-1�F�I���j��");
            String s = in.next();
            if(s == "-1") break;
            BigChar bc = new BigChar(s.charAt(0));
            c.clear();
            bc.draw(c);
            c.show();
        }
    }
}
