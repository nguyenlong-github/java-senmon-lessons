package pac26a;

public class OldAircon {
    public static final int COOL = 0;
    public static final int WARM = 1;
    private int mode = COOL;
    public void showMode() {
        if (mode == COOL) {
            System.out.println("y‹Œ®ƒGƒAƒRƒ“z‚½‚¾‚¢‚Ü—â–[’†‚Å‚·I");
        } else {
            System.out.println("y‹Œ®ƒGƒAƒRƒ“z‚½‚¾‚¢‚Ü’g–[’†‚Å‚·I");
        }
    }
    public void changeMode() {
        if (mode == COOL) {
            mode = WARM;
            System.out.println("y‹Œ®ƒGƒAƒRƒ“z’g–[‚ÉØ‚èŠ·‚¦‚Ü‚µ‚½I");
        } else {
            mode = COOL;
            System.out.println("y‹Œ®ƒGƒAƒRƒ“z—â–[‚ÉØ‚èŠ·‚¦‚Ü‚µ‚½I");
        }
    }
    public int getMode() { return mode; }
}
