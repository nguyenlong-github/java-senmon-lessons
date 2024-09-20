package pac24d;

import java.util.Scanner;

public class GachaMachine {

    private GachaState state;

    public void execute() {
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("�ǂ̏�Ԃ��`�F�b�N���܂����H�i0�FNoCoin�A1�FHasCoin�A-1�F�I���j��");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

            // �I��������ԃN���X�𐶐����A�ȉ��̏��Ԃŏ��������s����B
            state = (n == 0) ? new NoCoin() : new HasCoin();

            // showState
            state.showState();
            // insertCoin
            state.insertCoin(this);
            // turnHandle
            state.turnHandle(this);
            // ejectCoin
            state.eljectCoin(this);

            System.out.println();
        }
    }
}
// GachaState�C���^�[�t�F�C�X
interface GachaState{
    //���݂̏�ԕ\��
    public void showState();
    //�R�C�������郁�\�b�h
    public void insertCoin(GachaMachine gm);
    // �n���h�����񂷃��\�b�h
    public void turnHandle(GachaMachine gm);
    //�R�C���ԋp
    public void eljectCoin(GachaMachine gm);
}
// NoCoin�N���X
class NoCoin implements GachaState{

    @Override
    public void showState() {
        System.out.println("�R�C��:�Ȃ�");
    }

    @Override
    public void insertCoin(GachaMachine gm) {
        System.out.println("�R�C�������܂����I ");
    }

    @Override
    public void turnHandle(GachaMachine gm) {
        System.out.println("�n���h�������܂���I ");
    }

    @Override
    public void eljectCoin(GachaMachine gm) {
        System.out.println("�����N����܂���I");
    }
}
// HasCoin�N���X
class HasCoin implements GachaState{

    @Override
    public void showState() {
        System.out.println("�R�C���F����");
    }

    @Override
    public void insertCoin(GachaMachine gm) {
        System.out.println("����ȏ�R�C��������܂���I");
    }

    @Override
    public void turnHandle(GachaMachine gm) {
        System.out.println("�J�v�Z�����o�܂����I");
    }

    @Override
    public void eljectCoin(GachaMachine gm) {
        System.out.println("�R�C����ԋp���܂����I");
    }
}


