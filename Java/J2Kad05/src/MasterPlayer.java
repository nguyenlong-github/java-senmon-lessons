import java.util.Scanner;

public class MasterPlayer extends BasePlayer{
    private Scanner in = new Scanner(System.in);
    MasterPlayer(){
        System.out.println("CompPlayer �̃R���X�g���N�^���Ăяo����܂����I");
        name = "ECC";
    }
    public void intro(){
        System.out.println("���O�F" + name + "�E�E�E�ŋ��ł��I");
    }
    public int takeStone(int stone){
        if((stone + 3) % 4 != 0){
            take = (stone + 3) % 4;
        }else if((stone + 3) % 4 == 0){
            take = stone - 1;
        }else{
            take = (int)(Math.random() * 3) + 1;
            stone -= take;
        }
        stone -= take;
        return take;

    }
}
