public class BasePlayer {
    protected String name;
    protected int take;				// ���΂̐�
    BasePlayer(){
        //�uBasePlayer �̃R���X�g���N�^���Ăяo����܂����I�v�ƕ\�����Aname �ɁuCPU�v��������
        System.out.println("BasePlayer �̃R���X�g���N�^���Ăяo����܂����I");
        name = "CPU";
    }
    public void intro(){
        //�u���O�F?�E�E�E���΂̐��𗐐��Ō��߂܂��B�v�i?��name�j�ƕ\������B
        System.out.println("���O�F" + name + "�E�E�E���΂̐��𗐐��Ō��߂܂��B");
    }
    public String toString(){
        //name ��Ԃ��i���̃��\�b�h������ƃC���X�^���X����߂�l�̕�����Ƃ��Ĉ�����j�B
        return name;
    }
    public int takeStone(int stone){
        //BasePlayer�F������1?3 �̒l��Ԃ��B
        if(stone >= 3) {
            take = (int) (Math.random() * 3) + 1;
        }else{
            take = (int) (Math.random() * stone) + 1;
        }
        return take;
    }
}
