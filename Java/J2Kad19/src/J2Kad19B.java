import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
	課題名：J2Kad19B「例外を作ろう！」
	作成日：2022/12/5
	作成者：田中太郎
*/

    public class J2Kad19B {
        public static void throwException() throws IOException, NegativeNumberException,OverflowException{
            Scanner in = new Scanner(System.in);
            System.out.print("どの例外をスローしますか？（0:FileNotFoundException、1:EOFException）＞");
            int n = Integer.parseInt(in.next());
            if(n == 0){
                throw new FileNotFoundException();
            }else if(n == 1){
                throw new EOFException();
            }else if(n == 2){
                throw new IOException();
            }else if(n < 0){
                throw new NegativeNumberException();
            }else if(n > 2) {
                throw new OverflowException();
            }
        }
        public static void main(String[] args) {
            System.out.println("例外をスローしてキャッチします！");
            while(true) {
                try {
                    throwException();
                } catch ( FileNotFoundException e){
                    System.out.println("FileNotFoundExceptionをキャッチしました！");
                } catch (EOFException e){
                    System.out.println("EOFExceptionをキャッチしました！");
                } catch (IOException e){
                    System.out.println("IOExceptionをキャッチしました！");
                } catch ( NegativeNumberException | OverflowException e) {
                    System.out.println(e);
                } catch (Exception e) {
                    System.out.println(e + "をキャッチしました！");
                    System.out.println("終了します！");
                    break;
                }
                System.out.println();
            }
        }
    }
    class NegativeNumberException extends Exception{
        //コンストラクタ
        NegativeNumberException(){
            super("負の数です");
        }
    }
    class OverflowException extends Exception{
        //コンストラクタ
        OverflowException(){
            super("0 から2 までの整数を入力してください！");
        }
    }

