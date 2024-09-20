public abstract class Hand {
    private String name;
    public Hand(String name) { this.name = name; }
    public String toString() { return name; }

    // vsHandを追加
    public abstract Janken.Result vsHand(Hand other);
    public abstract Janken.Result vsGu();
    public abstract Janken.Result vsChoki();
    public abstract Janken.Result vsPa();
}
