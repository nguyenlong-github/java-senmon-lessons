package pac24c;

import java.util.Scanner;

public class GachaMachine {
    private GachaState state;
    public void setState(GachaState state) { this.state = state; }
    public void execute() {
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("�ǂ̏�Ԃ��`�F�b�N���܂����H�i0�FNoCoin�A1�FHasCoin�A-1�F�I���j��");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

            // �I��������Ԃ𐶐����A�ȉ��̏��Ԃŏ��������s���邱��

            // showState
            state.showState();
            // insertCoin
            state.insertCoin(this);

            // showState
            state.showState();
            // turnHandle
            state.turnHandle(this);

            // showState
            state.showState();
            // ejectCoin
            state.eljectCoin(this);

            System.out.println();
        }
    }
}
// �ȉ��AJ2Kad24D�ipac24d�j����R�s�[���邱��
// �������\��t����Ƃ��́A�E�N���b�N���u����ȃR�s�[/�\��t���v���u�v���[���e�L�X�g�Ƃ��ē\��t���v�œ\��t���邱�ƁB
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
        //HasCoin�֏�ԑJ��
        gm.setState(new HasCoin());
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
        //NoCoin�֏�ԑJ��
        gm.setState(new NoCoin());
    }

    @Override
    public void eljectCoin(GachaMachine gm) {
        System.out.println("�R�C����ԋp���܂����I");
        //NoCoin�֏�ԑJ��
        gm.setState(new NoCoin());
    }
}



