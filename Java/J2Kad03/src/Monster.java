public class Monster {
    private String name;
    private int hp;

    //�R���X�g���N�^, new�����Ƃ��Ă΂�郁�\�b�h
    Monster(){
        setData("�܂��Ȃ���?", 1);
    }
    Monster(String n , int h){
        name = n;
        hp = h;
    }
    public void setData(String n, int h) {
        name = n;
        hp = h;
    }
    public void showData() {
        System.out.println("�ڂ��̖��O��" + name + "�AHP��" + hp + "����I");
    }
    public void walk() {
        if (hp <= 0) {
            System.out.println("����ĕ����Ȃ���`");
            return;
        }
        System.out.println("�Ă��Ă��E�E�E");
        hp--;
    }
    public void sleep() {
        System.out.println("���������E�E�E");
        hp++;
    }

    public void setName(String name) {
//        name �̃Z�b�^�[�B����name ���u�Q���Q���v�̂Ƃ��́u�Q���Q���Ȃ�Ă��₾?�v��
//        �\�����āA���O��ݒ肵�Ȃ��B
        if(name.equals("�Q���Q��")){
            System.out.println(name + "�Ȃ�Ė��O�͂��₾?");
        }else{
            this.name = name;
        }
    }
    public void setHp(int hp) {
//        hp �̃Z�b�^�[�B����hp ��0 �ȉ��̂Ƃ��́u���߂�HP�A1 �͂��傤�����I�v��
//        �\�����āA1 ��ݒ肷��B
        if(hp <= 0){
            System.out.println("���߂�HP�A1 �͂��傤�����I");
            this.hp = 1;
        }else{
            this.hp = hp;
        }
   }
}
