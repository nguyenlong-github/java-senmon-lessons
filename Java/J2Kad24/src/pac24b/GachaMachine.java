package pac24b;
import java.util.Scanner;
public class GachaMachine {
    public void setState(GachaState state) { this.state = state; }

    private int count = 3;
    private GachaState state = new NoCoin();

    public int decCount() { return --count; }

    public void execute() {
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("�J�v�Z���̎c��F" + count);
            showState();
            System.out.print("�ǂ����܂����H�i0�F�R�C��������A1�F�n���h�����񂷁A2�F�ԋp�{�^���������A-1�F�I���j��");
            int cmd = Integer.parseInt(in.next());
            if (cmd < 0) break;
            switch(cmd) {
                case 0: insertCoin();   break;
                case 1: turnHandle();   break;
                case 2: ejectCoin();    break;
            }
            System.out.println();
        }
    }
    private void showState() {
        state.showState();
    }
    private void insertCoin() {
        state.insertCoin(this);
    }
    private void turnHandle() {
        state.turnHandle(this);
    }
    private void ejectCoin() {
        state.ejectCoin(this);
    }
}
interface GachaState {
    //���݂̏�Ԃ�\��
    void showState();
    //�R�C�������郁�\�b�h
    void insertCoin(GachaMachine gm);
    //�n���h�����񂷃��\�b�h
    void turnHandle(GachaMachine gm);
    //�R�C����ԋp���\�b�h
    void ejectCoin(GachaMachine gm);
}
class NoCoin implements GachaState {
    public void showState(){
        System.out.println("�R�C���F�Ȃ�");
    }
    public void insertCoin(GachaMachine gm){
        System.out.println("�R�C�������܂����I");
        gm.setState(new HasCoin());
    }
    public void turnHandle(GachaMachine gm){
        System.out.println("�n���h�������܂���I");
    }
    public void ejectCoin(GachaMachine gm){
        System.out.println("�����N����܂���I");
    }
}
class HasCoin implements GachaState{
    public void showState(){
        System.out.println("�R�C���F����");
    }
    public void insertCoin(GachaMachine gm){
        System.out.println("����ȏ�R�C��������܂���I");
    }
    public void turnHandle(GachaMachine gm){
        System.out.println("�J�v�Z�����o�܂����I");
        gm.decCount();
        gm.setState(new NoCoin());
    }
    public void ejectCoin(GachaMachine gm){
        System.out.println("�R�C����ԋp���܂����I");
        gm.setState(new NoCoin());
    }
}