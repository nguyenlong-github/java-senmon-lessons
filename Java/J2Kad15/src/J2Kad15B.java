/*
	課題名：J2Kad15B「ECC長屋の3号室！」
	作成日：2022/11/21
	作成者：田中太郎
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class J2Kad15B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sheep[] nagaya = new Sheep[] { new Sheep(), new Sheep(), new Sheep() };
        while(true) {
            try {
                System.out.print("何号室を見ますか？（-1：興味なし）＞");
                int n = Integer.parseInt(in.next());
                if (n < 0) break;
                nagaya[n].intro();
                System.out.println();
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("そんな部屋番号はありません！");
            }catch(InputMismatchException e){
                System.out.println("int 型でない値が入力されました！");
            }catch(NumberFormatException e){
                System.out.println("int 型でない値が入力されました！");
            }
        }
    }
}
