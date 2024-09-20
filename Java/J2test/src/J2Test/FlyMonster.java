package J2Test;

public class FlyMonster extends Monster{
    public FlyMonster(String name) {
        super(name);
        System.out.println("FlyMonsterI");
    }
    public void intro() {
        super.intro();			// Monster‚Ìinro
        System.out.println("‹ó‚ğ‚Æ‚×‚é‚æI");
    }
}
