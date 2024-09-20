public class Eraser {
    public void erase(Canvas c) {
        for (int y = 0; y < c.getHeight(); y++) {
            for (int x = 0; x < c.getWidth(); x++) {
                c.reset(x, y);
            }
        }
    }
}
