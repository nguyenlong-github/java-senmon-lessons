package J2Test;

public class SwimMonster extends Monster {
    public SwimMonster(String name) {
        super(name);
        System.out.println("SwimMonster�I");
        }
    public void intro() {
        super.intro();			// Monster��intro
        System.out.println("�j�������ӂ��I");
    }
}

