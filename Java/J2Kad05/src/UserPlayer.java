import java.util.Scanner;

public class UserPlayer extends BasePlayer{
    private Scanner in = new Scanner(System.in);
    UserPlayer(){
        System.out.println("UserPlayer �̃R���X�g���N�^���Ăяo����܂����I");
        System.out.print("���Ȃ��̖��O����͂��Ă���������");
        name = in.next();
    }
    public void intro(){

        System.out.println("���O�F" + name + "�E�E�E���Ȃ������삷��v���C���[�ł��B");
    }
    public int takeStone(int stone){
        System.out.print("�����܂����H�i1-3�j��");
        take = in.nextInt();
        stone -= take;
        return take;
    }
}
