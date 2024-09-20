

public class Square extends Rectangle implements IShape {
    private int[] x = new int[4];
    private int[] y = new int[4];

    public Square(int left, int top, int width, int height) {
        super(left, top, width, height);
    }


    @Override
    public void draw(Canvas c) {
        super.draw(c);

    }
}
