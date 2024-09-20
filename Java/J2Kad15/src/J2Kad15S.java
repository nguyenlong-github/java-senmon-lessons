/*
	課題名：J2Kad15S「ECC苦情処理センター（開設準備室）」
	作成日：2022/11/21
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad15S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ECC苦情処理センター開設準備室です！");
        System.out.println("苦情処理のシミュレーションを行います！");

        Handler nobita = new Nobita();
        Handler jaian = new Jaian();
        Handler suneo = new Suneo();

        Handler[] handlers = {nobita,jaian, suneo,};

        int nobitaOK = 0;
        int jaianOK = 0;
        int suneoOK = 0;

        int[] handerOK = {nobitaOK,jaianOK,suneoOK};

        for (int i = 0; i < 100; i++) {
            System.out.println("苦情番号：" + i + "を受け付けた！");
            for (int j = 0; j < handlers.length; j++ ) {
                if (handlers[j].handle(i)){ handerOK[j]++;}
            }
            System.out.println();
        }

        System.out.println("それぞれが対応した回数は");
        for (int i = 0; i < handlers.length; i++ ) {
            System.out.println(handlers[i] + "：" + handerOK[i] + "回");
        }
    }
}
