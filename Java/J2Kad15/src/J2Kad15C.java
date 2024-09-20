/*
	課題名：J2Kad15D「例外処理①（try～catch）」
	作成日：2022/11/21
	作成者：田中太郎
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class J2Kad15C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("整数1を入力してください＞");
            int n1 = in.nextInt();
            System.out.print("整数2を入力してください＞");
            int n2 = in.nextInt();

            div(n1,n2);
        }catch (InputMismatchException e){
            System.out.println(e + "int 型でない値が入力されました！");
        }catch(ArithmeticException e){
            System.out.println(e + "int 型でない値が入力されました！");
        }finally{
            System.out.println("finally ブロックの処理です！");
        }
    }
    public static void div(int n1, int n2){
        System.out.println(n1 + "÷" + n2 + "を計算します！");
        int ans = n1 / n2;
        System.out.println("計算結果は" + ans + "です！");
    }
}
