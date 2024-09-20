import static java.lang.Math.abs;

public class Canvas {
    private boolean[][] pixel;

    public Canvas(int width, int height) {
        pixel = new boolean[height][width];
        for (int y = 0; y < pixel.length; y++) {
            for (int x = 0; x < pixel[y].length; x++) {
                pixel[y][x] = false;
            }
        }
    }
    public void show() {
        for (int y = 0; y < pixel.length; y++) {
            for (int x = 0; x < pixel[y].length; x++) {
                System.out.print("　" + ((pixel[y][x])? "○": "・"));
            }
            System.out.println();
        }
    }
    private boolean inBound(int x, int y) {
        if ((y < 0) || (pixel.length <= y)) return false;
        if ((x < 0) || (pixel[y].length <= x)) return false;
        return true;
    }
    public void set(int x, int y) {
        if (inBound(x, y)) pixel[y][x] = true;
    }
    public void reset(int x, int y) {
        if (inBound(x, y)) pixel[y][x] = false;
    }
    // 直線描画
    public void drawLine(int x1, int y1, int x2, int y2) {

        int x;

        int sx = (x1 < x2)? 1 : -1;
        int sy = (y1 < y2)? 1 : -1;

        int Dx = abs (x2 - x1);
        int Dy = abs (y2 - y1);
        int err = Dx - Dy;
        int e2 = 2 * err;

        while(true){
            if(x1 == x2 && y1 == y2){break;}
            if(e2 > -Dy){
                err -= Dy;
                x1 += sx;
            }else if(e2 < Dx){
                err += Dx;
                y1 += sy;
            }
            set(x1,y1);
        }


    }
}
