/*
	課題名：J2Kad19C「例外を投げよう！（throw）」
	作成日：2022/12/5
	作成者：田中太郎
*/
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J2Kad19C {
    public static void throwException() throws FileNotFoundException,EOFException,Exception{
        Scanner in = new Scanner(System.in);
        System.out.print("どの例外をスローしますか？（0:FileNotFoundException、1:EOFException）＞");
        int n = Integer.parseInt(in.next());
        if(n == 0){
            throw new FileNotFoundException();
        }else if(n == 1){
            throw new EOFException();
        }else {
            throw new Exception();
        }
    }
    public static void main(String[] args) {
        System.out.println("例外をスローしてキャッチします！");
        while(true) {
            try {

                ////ここからメンソッド化////
//                Scanner in = new Scanner(System.in);
//                System.out.print("どの例外をスローしますか？（0:FileNotFoundException、1:EOFException）＞");
//                int n = Integer.parseInt(in.next());
//                if(n == 0){
//                    throw new FileNotFoundException();
//                }else if(n == 1){
//                    throw new EOFException();
//                }
                ////ここまで////
                throwException();

            } catch ( FileNotFoundException e){
                System.out.println("FileNotFoundExceptionをキャッチしました！");
            } catch (EOFException e){
                System.out.println("EOFExceptionをキャッチしました！");
            }catch (Exception e) {
                System.out.println(e + "をキャッチしました！");
                System.out.println("終了します！");
                break;
            }
            System.out.println();
        }
    }
}
