/*
    課題名：J2Kad04B
    作成日：2022/10/06
    作成者：田中太郎
 */
import java.util.Scanner;

public class J2Kad04B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pikmin[] pikmins = new Pikmin[3];
        System.out.println("ピクミンを探します！");
        while (true){
            Pikmin.showCount();
            System.out.print("どうしますか？（0：探す、-1：やめる）＞");
            int index = in.nextInt();

            if(index != 0) break;

            int rand = (int)(Math.random()*4);
            if(rand == 0){
                System.out.println("見つからなかった！");
            } else {
                for (int i = 0; i < rand; i++) {
                    pikmins[i] = new Pikmin();
                }
                System.out.println(rand + " 匹見つけた！");
            }
            System.out.println();
        }


    }
}
