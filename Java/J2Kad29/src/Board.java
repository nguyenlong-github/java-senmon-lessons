public class Board {
    private final int HEIGHT = 10;          // 縦
    private final int WIDTH = 20;           // 横
    private final int MINE = 25;            // 地雷の数
    public Board() {
        // マス目の生成
    }
    public void show() {
        System.out.println("  ＡＢＣＤＥＦＧＨＩＪＫＬＭＮＯＰＱＲＳＴ");
        for (int y = 0; y < HEIGHT; y++) {
            System.out.print(y + " ");
            for (int x = 0; x < WIDTH; x++) {
                // マス目の表示
                System.out.print("■");
            }
            System.out.println(" " + y);
        }
        System.out.println("  ＡＢＣＤＥＦＧＨＩＪＫＬＭＮＯＰＱＲＳＴ");
    }
}
