package J2Test;

import java.util.Scanner;

public class J2Test13_5 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("�d�����������Ď��ȏЉ���܂��I");
        IFairy iFairy = null;
        while(true){
            System.out.print("�N���������܂����H�i0�F���̗d���A1�F�ł̗d���A2�F���̗d���A-1�F��߂�j��");
            int cmd = in.nextInt();
            if(cmd < 0){break;}
            switch (cmd){
                case 0:
                    iFairy = new Light();
//                    iFairy.intro();
                    break;
                case 1:
                    iFairy = new Darkness();
//                    iFairy.intro();
                    break;
                case 2:
                    iFairy = new Fire();
//                    iFairy.intro();
                    break;
            }
            iFairy.intro();
            System.out.println();
        }
    }
}
