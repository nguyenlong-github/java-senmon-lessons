public class Nobita extends Handler{
    public Nobita() { super("のび太" , Handler.NOBITA);}

    @Override
    public boolean resolve(int n) {
        if (n < 20) {
            return true;
        } else {
            return false;
        }
    }
}
