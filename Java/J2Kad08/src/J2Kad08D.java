/*
	課題名：J2Kad08D「妖精の召喚（抽象クラス版）」
	作成日：2022/10/24
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad08D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("妖精を召喚して自己紹介させます！");
        IFairy[] iFairys = {new Light() , new Darkness() , new Fire()};
        while(true) {
            System.out.print("誰を召喚しますか？（0：光の妖精、1：闇の妖精、2：炎の妖精、-1：やめる）＞");
            int n = in.nextInt();
            if (n < 0) break;

            iFairys[n].intro();

            System.out.println();
        }
    }
}
