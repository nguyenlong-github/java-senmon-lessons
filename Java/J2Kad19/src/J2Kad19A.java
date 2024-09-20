/*
	課題名：J2Kad19A「ECC野球部！」
	作成日：2022/12/5
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad19A {
    enum BALL {STRAIGHT, CURVE, FORKBALL;}
    public static void throwBall(BALL ball) throws BallException{
        switch (ball){
            case STRAIGHT -> throw new Straight();
            case CURVE -> throw new Curve();
            case FORKBALL -> throw new Forkball();
        }
    }
    public static void main(String[] args) {
        System.out.println("あなたはECC野球部の名キャッチャーです！");
        System.out.println("サインを出してピッチャーの球をキャッチしてください！");

        Scanner in = new Scanner(System.in);
        BALL[] balls = BALL.values();

        while (true) {
            try{
                System.out.print("何のサインを出しますか？（0：直球、1：カーブ、2：フォーク、-1：終了）＞");
                int ball = Integer.parseInt(in.next());
                throwBall(balls[ball]);
            }catch(BallException e){
                System.out.println(e + "を投げた！");
                System.out.println("キャッチしました！");
            }catch (Exception e){
                System.out.println("そんな球種はありません！");
            }
        }
    }
}
class Straight extends BallException{
    Straight(){
        super(" ストレート");
    }
}
class Curve extends BallException{
    Curve(){
        super(" カーブ");
    }
}
class Forkball extends BallException{
    Forkball(){
        super(" フォークボール");
    }
}
class BallException extends Exception{
    BallException(String msg){
        super(msg);
    }
}
