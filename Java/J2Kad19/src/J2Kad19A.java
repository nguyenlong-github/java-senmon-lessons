/*
	�ۑ薼�FJ2Kad19A�uECC�싅���I�v
	�쐬���F2022/12/5
	�쐬�ҁF�c�����Y
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
        System.out.println("���Ȃ���ECC�싅���̖��L���b�`���[�ł��I");
        System.out.println("�T�C�����o���ăs�b�`���[�̋����L���b�`���Ă��������I");

        Scanner in = new Scanner(System.in);
        BALL[] balls = BALL.values();

        while (true) {
            try{
                System.out.print("���̃T�C�����o���܂����H�i0�F�����A1�F�J�[�u�A2�F�t�H�[�N�A-1�F�I���j��");
                int ball = Integer.parseInt(in.next());
                throwBall(balls[ball]);
            }catch(BallException e){
                System.out.println(e + "�𓊂����I");
                System.out.println("�L���b�`���܂����I");
            }catch (Exception e){
                System.out.println("����ȋ���͂���܂���I");
            }
        }
    }
}
class Straight extends BallException{
    Straight(){
        super(" �X�g���[�g");
    }
}
class Curve extends BallException{
    Curve(){
        super(" �J�[�u");
    }
}
class Forkball extends BallException{
    Forkball(){
        super(" �t�H�[�N�{�[��");
    }
}
class BallException extends Exception{
    BallException(String msg){
        super(msg);
    }
}
