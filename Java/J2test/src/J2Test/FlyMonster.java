package J2Test;

public class FlyMonster extends Monster{
    public FlyMonster(String name) {
        super(name);
        System.out.println("FlyMonster�I");
    }
    public void intro() {
        super.intro();			// Monster��inro
        System.out.println("����Ƃׂ��I");
    }
}
