/*
	課題名：J2Kad15X「ECC苦情処理センター（Chain of Responsibility）」
	作成日：2022/11/21
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad15X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ここはECC苦情処理センターです！");
        System.out.println("優秀なスタッフが対応します！");
//        // 初期メンバー
//        Nobita nobita = new Nobita();
//        Jaian jaian = new Jaian();
//        Suneo suneo = new Suneo();

        Handler nobita = new Nobita();
        Handler jaian = new Jaian();
        Handler suneo = new Suneo();
        Handler sizuka = null;
        Handler dekisugi = null;

        Handler[] handlers = {nobita,jaian, suneo,};

        boolean helper = false;

        while(true) {
            System.out.println();
            System.out.print("どうしますか？（0：苦情を受け取る、1：応援を頼む、-1：もうやだ）＞");
            int cmd = in.nextInt();
            if (cmd < 0) break;
            // 応援を頼む
            if (cmd == 1) {

                // 作成すること
                sizuka = new Sizuka();
                dekisugi = new Dekisugi();

                helper = true;
                continue;
            }
            // 苦情処理
            int n = (int)(Math.random() * 100);
            System.out.println("苦情番号：" + n + "を受け付けた！");

            // 作成すること
            nobita.setNext(jaian).setNext(suneo);
            if(helper){
                suneo.setNext(sizuka).setNext(dekisugi);
            }
            nobita.handle(n);


        }
        System.out.println("おつかれさまでした！");
    }
}
