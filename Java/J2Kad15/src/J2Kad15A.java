/*
	課題名：J2Kad15A「例外処理①まとめ」
	作成日：2022/11/21
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad15A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 作成すること
        while(true) {
            try {
                int[] results = new int[5];
                System.out.print("割られる数を入力してください＞");
                int input = Integer.parseInt(in.next());
                int rand = (int) (Math.random() * 10);
                System.out.println(rand + " で割ります！");
                if (rand == 0) {
                    break;
                }
                System.out.println("計算結果は" + input / rand + "です！");
                int indexRand = (int) (Math.random() * 10);
                System.out.println("配列の" + indexRand + " 番目に格納します！");
                System.out.println("処理が正常に行われました！");
            } catch (ArithmeticException e) {
                System.out.println("0 除算が発生しました！");
            } catch (NumberFormatException e) {
                System.out.println("int 型でない値が入力されました！\n");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("配列に格納できません！");
            } finally {
                System.out.println("finally ブロックの処理です！");
            }
        }


        System.out.println("終了します！");
    }
}
