package J2Test;

import java.util.Scanner;

public class J2Test13_5 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("妖精を召喚して自己紹介させます！");
        IFairy iFairy = null;
        while(true){
            System.out.print("誰を召喚しますか？（0：光の妖精、1：闇の妖精、2：炎の妖精、-1：やめる）＞");
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
