public class CompPlayer extends BasePlayer {
    public CompPlayer() { super("コンピュータ"); }
    public int selectHand() {
        // 実装すること
        return (int)(Math.random()*3);
    }
}
