/*
    �ۑ薼�FJ2Kad04B
    �쐬���F2022/10/06
    �쐬�ҁF�c�����Y
 */
import java.util.Scanner;

public class J2Kad04B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pikmin[] pikmins = new Pikmin[3];
        System.out.println("�s�N�~����T���܂��I");
        while (true){
            Pikmin.showCount();
            System.out.print("�ǂ����܂����H�i0�F�T���A-1�F��߂�j��");
            int index = in.nextInt();

            if(index != 0) break;

            int rand = (int)(Math.random()*4);
            if(rand == 0){
                System.out.println("������Ȃ������I");
            } else {
                for (int i = 0; i < rand; i++) {
                    pikmins[i] = new Pikmin();
                }
                System.out.println(rand + " �C�������I");
            }
            System.out.println();
        }


    }
}
