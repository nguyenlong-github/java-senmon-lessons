/*
	課題名：J2Kad28C「インスタンスはひとつだけ！（Singleton）」
	作成日：2023/1/30
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad28C {
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
