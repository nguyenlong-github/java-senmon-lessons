package J2Test;

public class Monster {
    protected String name;            // ���O
    public Monster(String name) {
        this.name = name;
        System.out.println("Monster�I");
    }
    public void intro() {
            System.out.println("�ڂ��̖��O��" + name + "�B");
    }

}
