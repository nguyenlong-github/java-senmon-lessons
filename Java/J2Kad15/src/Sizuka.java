public class Sizuka extends Handler{
    public Sizuka() {
        super("しずか" , Handler.SIZUKA);
    }

    @Override
    public boolean resolve(int n) {
        if ((n % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
