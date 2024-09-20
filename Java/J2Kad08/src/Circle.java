public class Circle implements IShape {
    private int x;
    private int y;
    private int r;
    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public void draw(Canvas c) {
        c.drawCircle(x, y, r);
    }
}
