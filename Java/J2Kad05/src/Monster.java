public class Monster {
    protected String name;
    protected int hp;

    public Monster() { System.out.println("Monster�N���X�̃R���X�g���N�^���Ăяo����܂����I"); }
    public void setData(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public void showData() { System.out.println(name + "�i�̗́F" + hp + "�j"); }
    public void intro() {
        System.out.println("������̖��O��" + name + "�B");
        System.out.println("��͎U���B���Z�͂ǂ��ł�����邱�Ƃ���B");
    }
    public void walk() {
        if (hp <= 0) {
            System.out.println("���ĕ����Ȃ���?");
            return;
        }
        System.out.println("�Ă��Ă��E�E�E");
        hp--;
    }
    public void sleep() {
        System.out.println("���������E�E�E");
        int recover = (int)(Math.random() * 3);
        if (recover == 0) {
            System.out.println("�悭����Ȃ������I");
            return;
        }
        System.out.println("�̗͂�" + recover + "�|�C���g�񕜂����I");
        hp += recover;
    }
}
