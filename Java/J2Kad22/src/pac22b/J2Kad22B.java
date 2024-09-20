/*
	課題名：J2Kad22B「スーパーコンピュータECC1000」
	作成日：2022/12/15
	作成者：田中太郎
*/
package pac22b;

import java.util.Scanner;

public class J2Kad22B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("スーパーコンピュータECC1000を開発した！");
        System.out.println("アルゴリズムをセットすればどんな高度な計算でもできます！！");

        ECC1000 ecc1000 = new ECC1000();

        while(true) {
            System.out.print("計算アルゴリズムをセットしてください（0：Nobita、1：Suneo、2：Dekisugi、3：Sizuka、-1：終了）＞");
            int algNum = Integer.parseInt(in.next());
            if (algNum < 0) break;
            // アルゴリズムの選択
            SumAlg alg = null;
            switch (algNum){
                case 0: alg = new NobitaAlg(); break;
                case 1: alg = new SuneoAlg(); break;
                case 2: alg = new DekisugiAlg(); break;
                case 3: alg = new SizukaAlg(); break;
            }
            //algのセット
            ecc1000.setAlg(alg);
            ecc1000.sum(10);
            // 演算


            System.out.println();
        }
    }
}
// スーパーコンピュータECC1000
class ECC1000 {
    //大元のalg
    SumAlg alg = null;
    // 作成すること
    public void setAlg(SumAlg alg){
        this.alg = alg;
    }

    //alg.sumの実行
    public void sum(int n){
        alg.sum(n);
    }

}
