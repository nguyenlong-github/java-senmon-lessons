public class SwimMonster extends Monster{

    public SwimMonster(){
        System.out.println("FlyMonster �̃R���X�g���N�^���Ăяo����܂����I\n");
    }
    public void swim() {
        //hp <= 0 �̂Ƃ��A�u���ĉj���Ȃ���?�v�ƕ\������B�����łȂ��Ƃ��A�u?���j����I�Ԃ��Ԃ�����v�i?�͖��O�j�ƕ\�����Ahp ��1 ���炷�B
        if(hp <= 0){
            System.out.println("���ĉj���Ȃ�");
        }else{
            System.out.println(name + "���j����I�Ԃ��Ԃ����");
            hp--;
        }
    }
    public void walk() {
        //�u���тꂾ�ƕ����Ȃ���?�v�ƕ\������B
        System.out.println("���тꂾ�ƕ����Ȃ���?");
    }
    public void intro() {
        //Monster �N���X��intro ���\�b�h���Ăяo������A�u�j�������ӂ��I�v�ƕ\������B
        super.intro();
        System.out.println("�j�������ӂ��I");
    }

}
