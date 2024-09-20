public class Jaian extends Handler{
    public Jaian() {
        super("ジャイアン" , Handler.JAIAN);
    }

    public boolean resolve(int n) {
        if ((int)(Math.random() * 4) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
