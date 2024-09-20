public class BasePlayer {
    protected String name;
    public BasePlayer() { name = "Base"; }
    public void intro() { System.out.println("名前：" + name + "・・・" + myStrategy()); }
    @Override
    public String toString() {
        return name;
    }
    public int takeStone(int stone) { return 1 + (int)(Math.random() * 3); }
    protected String myStrategy() { return "取る石の数を乱数で決めます。"; }
}
