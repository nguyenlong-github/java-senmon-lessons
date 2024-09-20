public class Point implements Comparable<Point> {
    public int x, y;
    public Point() {
        x = (int)(Math.random() * 50);
        y = (int)(Math.random() * 50);
    }
    public void printInfo() {
        System.out.printf("(%2d, %2d)\tx + y = %d\n", x, y, (x + y));
    }

    // 並び替えのルールメソッド
    @Override
    public int compareTo(Point other) {
        //戻り値が整数なら昇順:負数なら降順する
        return (this.x + this.y) - (other.x + other.y);
    }
}