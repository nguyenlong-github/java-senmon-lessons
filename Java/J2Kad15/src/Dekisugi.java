public class Dekisugi extends Handler{
    public Dekisugi() {super("出木杉" , Handler.DEKISUGI);}
    @Override
    public boolean resolve(int n) {
        if ((n % 7) != 0) {
            return true;
        } else {
            return false;
        }
    }
}
