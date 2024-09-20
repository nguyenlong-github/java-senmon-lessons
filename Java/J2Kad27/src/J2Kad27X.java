/*
	課題名：J2Kad27X「ECCソフトの憂鬱」
	作成日：2023/1/26
	作成者：田中太郎
*/

import java.util.Scanner;

public class J2Kad27X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ECCSoft eccSoft = new ECCSoft();

        while(true) {
            System.out.print("どうしますか？（0：仕事を依頼する、-1：もういい）＞");
            int cmd = Integer.parseInt(in.next());
            if (cmd < 0) break;

            eccSoft.work();                               // 元請けへ発注
            System.out.println();
        }
    }
}
// 元請け
class ECCSoft {
    public ECCSoft() {
        System.out.println("信頼と実績のECCソフト株式会社です！");
        System.out.println("どんな課題でも私たちが真摯に解決します！！");
    }
    public void work() {
        SubContractor sub;
        switch((int)(Math.random() * 3)) {
            default:
            case 0: sub = new ECCService();   break;
            case 1: sub = new ECCPartners();   break;
            case 2: sub = new ECCSolutions();   break;
        }
        System.out.println(sub + "に丸投げします！");
        sub.work();
    }
}
// 下請け
abstract class SubContractor {
    private String name;
    public SubContractor(String name) {
        this.name = name;
    }
    public String toString() { return name; }
    public abstract void work();
}
// ECCサービス株式会社
class ECCService extends SubContractor {
    public ECCService() { super("ECCサービス株式会社"); }
    public void work() { System.out.println("ECCサービス株式会社「何とかがんばってみます！」"); }
}
// ECCパートナーズ株式会社
class ECCPartners extends SubContractor {
    public ECCPartners() { super("ECCパートナーズ株式会社"); }
    public void work() { System.out.println("ECCパートナーズ株式会社「下請けはつらいなー！」"); }
}
// ECCソリューションズ株式会社
class ECCSolutions extends SubContractor {
    public ECCSolutions() { super("ECCソリューションズ株式会社"); }
    public void work() { System.out.println("ECCソリューションズ株式会社「よろこんでお引き受けいたします！」"); }
}