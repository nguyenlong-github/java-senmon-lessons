/*
	課題名：J2Kad22C「ECCソフト株式会社②（下請けの追加）」
	作成日：2022/12/15
	作成者：田中太郎
*/
package pac22c;

import java.util.Scanner;

public class J2Kad22C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ECCSoft eccSoft = new ECCSoft();

        while(true) {
            System.out.print("どうしますか？（0：下請けAを使う、1：下請けBを使う、2：下請けCを使う、-1：もういい）＞");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

//            eccSoft.setSubNum(n);             // 下請けの設定
            SubContractor sub = null;
            // 作成すること
            switch (n) {
                case 0:
                    //分岐　入力値0の場合:subAを生成
                    sub = new SubA();
                    break;
                case 1:
                    //分岐　入力値0の場合:subBを生成
                    sub = new SubB();
                    break;
                case 2:
                    //分岐　入力値0の場合:subCを生成
                    sub = new SubC();
                    break;
                case 3:
                    //分岐　入力値0の場合:subDを生成
                    sub = new SubD();
                    break;
            }
            eccSoft.setSubConstractor(sub);
            eccSoft.work();                   // 元請けへ発注
            System.out.println();
        }
    }
}
// 元請け
class ECCSoft {
//    private int subNum = 0;
    SubContractor sub = null;
    public ECCSoft() {
        System.out.println("信頼と実績のECCソフト株式会社です！");
        System.out.println("どんな課題でも私たちが真摯に解決します！！");
    }
//    public void setSubNum(int subNum) { this.subNum = subNum; }
    public void setSubConstractor(SubContractor sub){
        this.sub = sub;
    }
    public void work() {

        // 作成すること
        if(sub != null) {
            //生成したsubのwork()メソッドを実行
            sub.work();
        }else{
            System.out.println("あれ？下請けがいないよ～");
        }

    }
}
// 下請け
abstract class SubContractor {
    public abstract void work();
}
// 下請けA
class SubA extends SubContractor {
    public void work() {
        System.out.println("下請けA：何とかがんばってみます・・・");
    }
}
// 下請けB
class SubB extends SubContractor {
    public void work() { System.out.println("下請けB：下請けはつらいなー！"); }
}
// 下請けC
class SubC extends SubContractor {
    public void work() { System.out.println("下請けC：よろこんでお引き受けいたします！"); }
}
// 下請けD
class SubD extends SubContractor {
    public void work() { System.out.println("下請けD：下請けはつらいなー！"); }
}
