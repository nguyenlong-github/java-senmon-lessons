/*
	課題名：J2Kad06A「妖精の召喚」
	作成日：2022/10/17
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad06A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Fairy [] fairies = {new Light("光の妖精"),
                            new Darkness("光の妖精") ,
                            new Fire("炎の妖精")
        };

        System.out.println("妖精を召喚して自己紹介させます！");

        while (true){
            System.out.print("誰を召喚しますか？（0：光の妖精、1：闇の妖精、2：炎の妖精、-1：やめる）＞");
            int cmd = in.nextInt();
            if(cmd < 0) break;
            fairies[cmd].intro();
            System.out.println();

        }



    }
}
