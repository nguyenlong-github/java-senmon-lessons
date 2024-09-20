public class Suneo extends Handler{
    public Suneo() {
        super("スネ夫", Handler.SUNEO);
    }

    @Override
    public boolean resolve(int n) {
        if ((n % 3) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
