public class CompPlayer extends BasePlayer {
    public CompPlayer() { name = "Comp"; }
    public int takeStone(int stone) {
        switch(stone) {
            case 1:
                return 1;
            case 2:
            case 3:
            case 4:
                return stone - 1;
            case 6:
            case 7:
            case 8:
                return stone - 5;
        }
        return super.takeStone(stone);
    }
    protected String myStrategy() { return "少し強いです。"; }
}
