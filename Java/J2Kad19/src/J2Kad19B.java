import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
	�ۑ薼�FJ2Kad19B�u��O����낤�I�v
	�쐬���F2022/12/5
	�쐬�ҁF�c�����Y
*/

    public class J2Kad19B {
        public static void throwException() throws IOException, NegativeNumberException,OverflowException{
            Scanner in = new Scanner(System.in);
            System.out.print("�ǂ̗�O���X���[���܂����H�i0:FileNotFoundException�A1:EOFException�j��");
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
            System.out.println("��O���X���[���ăL���b�`���܂��I");
            while(true) {
                try {
                    throwException();
                } catch ( FileNotFoundException e){
                    System.out.println("FileNotFoundException���L���b�`���܂����I");
                } catch (EOFException e){
                    System.out.println("EOFException���L���b�`���܂����I");
                } catch (IOException e){
                    System.out.println("IOException���L���b�`���܂����I");
                } catch ( NegativeNumberException | OverflowException e) {
                    System.out.println(e);
                } catch (Exception e) {
                    System.out.println(e + "���L���b�`���܂����I");
                    System.out.println("�I�����܂��I");
                    break;
                }
                System.out.println();
            }
        }
    }
    class NegativeNumberException extends Exception{
        //�R���X�g���N�^
        NegativeNumberException(){
            super("���̐��ł�");
        }
    }
    class OverflowException extends Exception{
        //�R���X�g���N�^
        OverflowException(){
            super("0 ����2 �܂ł̐�������͂��Ă��������I");
        }
    }

