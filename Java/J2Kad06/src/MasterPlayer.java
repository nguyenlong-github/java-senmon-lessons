public class MasterPlayer extends BasePlayer {
    public MasterPlayer() { name = "Master"; }
    public int takeStone(int stone) {
        stone = (stone + 3) % 4;
        return (stone != 0)? stone : 1;
    }
    protected String myStrategy() { return "最強です！！"; }
}
