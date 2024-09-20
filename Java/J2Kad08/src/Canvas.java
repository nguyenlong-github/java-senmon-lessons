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
    public int getWidth() { return pixel[0].length; }
    public int getHeight() { return pixel.length; }
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
    public void drawLine(int x1, int y1, int x2, int y2) {
        // ブレゼンハム（Bresenham）のアルゴリズム
        int	dx = ( x2 - x1 ) * 2;
        int	sx = 1;
        if ( dx < 0 ) {
            dx = -dx;
            sx = -sx;
        }

        int	dy = ( y2 - y1 ) * 2;
        int	sy = 1;
        if ( dy < 0 ) {
            dy = -dy;
            sy = -sy;
        }

        int		x = x1;
        int		y = y1;
        int		f;

        set( x, y );

        if ( dx > dy ) {
            f = dy * 2 - dx;
            while ( x != x2 ) {
                if ( f >= 0 ) {
                    y += sy;
                    f -= dx;
                }
                x += sx;
                f += dy;
                set( x, y );
            }
        }
        else {
            f = dx * 2 - dy;
            while ( y != y2 ) {
                if ( f >= 0 ) {
                    x += sx;
                    f -= dy;
                }
                y += sy;
                f += dx;
                set( x, y );
            }
        }
    }
    public void drawCircle(int x, int y, int r) {
        // 45度の三角形の高さを求める
//        int		h = (int)(Math.sqrt((double)(r * r) / 2) + 0.5f);
//
//        for (int i = 0; i <= h; i++) {
//            // 斜辺r、高さiの三角形の底辺の長さを求める
//            int		j = (int)(Math.sqrt((double)(r * r - i * i)) + 0.5f);
//
//            set(x + j, y + i);
//            set(x - j, y + i);
//            set(x + j, y - i);
//            set(x - j, y - i);
//            set(x + i, y + j);
//            set(x - i, y + j);
//            set(x + i, y - j);
//            set(x - i, y - j);
//        }

        // ミッチェナー（Michener）のアルゴリズム
//        // 通常版（誤差が多い？）
//        set(x + r, y);
//        set(x - r, y);
//        set(x, y + r);
//        set(x, y - r);
//
//        int	j = r;
//        int	f = 3 - 2 * r;
//
//        for ( int i = 0; i <= j; i++ ) {
//        	if ( f >= 0 ) {
//        		f += 10 + 4 * i - 4 * j;
//        		j--;
//        	}
//        	else {
//        		f += 6 + 4 * i;
//        	}
//        	set(x + i, y + j);
//        	set(x - i, y + j);
//        	set(x + i, y - j);
//        	set(x - i, y - j);
//        	set(x + j, y + i);
//        	set(x - j, y + i);
//        	set(x + j, y - i);
//        	set(x - j, y - i);
//        }

        // 改良版
        int	j = r;
        int	i = 0;
        int	f = -2 * r + 3;

        while (i <= j) {
            set(x + i, y + j);
            set(x - i, y + j);
            set(x + i, y - j);
            set(x - i, y - j);
            set(x + j, y + i);
            set(x - j, y + i);
            set(x + j, y - i);
            set(x - j, y - i);
            if (f >= 0) {
                j--;
                f -= 4 * j;
            }
            i++;
            f += 4 * i + 2;
        }
    }
}
